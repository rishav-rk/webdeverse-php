
//Write a Java program to create a simple calculator
class sixtyEight {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(input.readLine());
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(input.readLine());

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter the operation number (1/2/3/4): ");
            int choice = Integer.parseInt(input.readLine());

            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation selection.");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values and operation number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}