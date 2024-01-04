
//Write a Java program to insert an element (specific position) into an array
class eightySeven {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = Integer.parseInt(input.readLine());
            int[] array = new int[n + 1];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) 
                array[i] = Integer.parseInt(input.readLine());

            System.out.print("Enter the element to insert: ");
            int elementToInsert = Integer.parseInt(input.readLine());

            System.out.print("Enter the position to insert (0 to " + n + "): ");
            int position = Integer.parseInt(input.readLine());

            if (position >= 0 && position <= n) {
                for (int i = n; i > position; i--) 
                    array[i] = array[i - 1];
                
                array[position] = elementToInsert;

                System.out.println("Array after inserting " + elementToInsert + " at position " + position + ":");
                for (int i = 0; i <= n; i++) 
                    System.out.print(array[i] + " ");
                System.out.println();
            } else {
                System.out.println("Invalid position. Please enter a valid position within the array size.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}