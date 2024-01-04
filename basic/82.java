
//Write a Java program to sum values of an array
class eightyTwo {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = Integer.parseInt(input.readLine());
            int[] array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) 
                array[i] = Integer.parseInt(input.readLine());
            
            int sum = 0;
            for (int num : array) 
                sum += num;
            
            System.out.println("Sum of the elements in the array: " + sum);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}