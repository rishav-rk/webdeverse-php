
//Write a Java program to display the n terms of odd natural number and their sum
class sixtyOne {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the value of n: ");
            int n = Integer.parseInt(input.readLine());

            if (n < 1) {
                System.out.println("Please enter a positive integer.");
            } else {
                int sum = 0;

                System.out.print("First " + n + " odd natural numbers: ");
                for (int i = 1, count = 0; count < n; i += 2, count++) {
                    System.out.print(i + " ");
                    sum += i;
                }

                System.out.println("\nSum of the first " + n + " odd natural numbers: " + sum);
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}