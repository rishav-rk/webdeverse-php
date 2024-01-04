
//Write a Java program that accepts three numbers and check All numbers are equal or not
class sixtyFive {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter first number : ");
            double num1 = Double.parseDouble(input.readLine());
            System.out.print("Enter second number : ");
            double num2 = Double.parseDouble(input.readLine());
            System.out.print("Enter third number : ");
            double num3 = Double.parseDouble(input.readLine());

            if(num1 == num2 && num1 == num3)
                System.out.println("All three numbers are equal");
            else
                System.out.println("All three numbers are not equal");

            
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}