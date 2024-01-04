
//Write a Java program to find the maximum and minimum value of an array
class eightySix {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        try {
            System.out.println("Enter the elements of the array:");
            String[] values = input.readLine().split(" ");
            int n = values.length;
            int[] array = new int[n];

            for (int i = 0; i < n; i++) 
                array[i] = Integer.parseInt(values[i]);
            
            int max = array[0], min = array[0];
            for (int i : array) {
                if (i > max) max = i;
                if (i < min) min = i;
            }

            System.out.println("Maximum value in the array: " + max);
            System.out.println("Minimum value in the array: " + min);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}