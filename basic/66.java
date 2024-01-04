
//Write a java program that accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order.
class sixtySix {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(input.readLine());
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(input.readLine());
            System.out.print("Enter the third number: ");
            double num3 = Double.parseDouble(input.readLine());

            if ((num1 < num2) && (num2 < num3)) {
                System.out.println("Numbers are in increasing order.");
            } else if ((num1 > num2) && (num2 > num3)) {
                System.out.println("Numbers are in decreasing order.");
            } else {
                System.out.println("Numbers are neither in increasing nor in decreasing order.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}