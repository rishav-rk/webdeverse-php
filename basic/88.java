
//Write a Java program to reverse an array of integer values
class eightyEight {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
            
            System.out.print("Enter the number of elements: ");
            int n = Integer.parseInt(input.readLine());

            System.out.println("Enter the elements:");

            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(input.readLine()));
            }

            java.util.Collections.reverse(arr);

            System.out.println("Reversed array: " + arr);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}