
//Write a java program to count total number of notes in entered amount using loop
class oneHundredSeventeen {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the amount: ");
            int amount = Integer.parseInt(input.readLine());

            int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
            int[] noteCount = new int[10];
            int remainingAmount = amount, index = 0;

            while (remainingAmount > 0) {
                int currentNote = notes[index];
                if (remainingAmount >= currentNote) {
                    int count = remainingAmount / currentNote;
                    noteCount[index] = count;
                    remainingAmount -= count * currentNote;
                }
                index++;
            }

            System.out.println("Total number of notes:");
            for (int i = 0; i < notes.length; i++) {
                if (noteCount[i] > 0) {
                    System.out.println(notes[i] + " rupees notes: " + noteCount[i]);
                }
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid amount.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}