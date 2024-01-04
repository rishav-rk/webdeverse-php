
//Write a Java program to get the character at the given index within the String
class seventySeven {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String inputString = input.readLine();

            System.out.print("Enter the index: ");
            int index = Integer.parseInt(input.readLine());

            if (index >= 0 && index < inputString.length()) {
                char character = inputString.charAt(index);
                System.out.println("Character at index " + index + ": " + character);
            } else {
                System.out.println("Invalid index. Please enter a valid index within the string length.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid index.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}