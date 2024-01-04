
//Write a Java program to take three numbers from the user and print the greatest number
class fiftyTwo {
    public static void main(String[] args) {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(input.readLine());
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(input.readLine());
            System.out.print("Enter the third number: ");
            double num3 = Double.parseDouble(input.readLine());

            double max = num1;

            if (num2 > max) max = num2;
            if (num3 > max) max = num3;

            System.out.println("The greatest number is: " + max);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}