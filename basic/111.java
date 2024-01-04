
// Write a Java program that reads a set of integers, and then prints the sum of the even and odd integers using loop
class oneHundredEleven {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a set of integers : ");
            String[] elements = input.readLine().split(" ");
            int evenSum = 0, oddSum = 0;

            for (String element : elements) {
                int num = Integer.parseInt(element);
                if (num % 2 == 0) evenSum += num;
                else oddSum += num;
            }

            System.out.println("Sum of even integers: " + evenSum);
            System.out.println("Sum of odd integers: " + oddSum);

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers separated by spaces.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}