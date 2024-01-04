
//Java Program To Calculate Power Of Number
class fiftyone {
    public static void main(String[] args) {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the base number: ");
            double base = Double.parseDouble(input.readLine());
            System.out.print("Enter the exponent: ");
            double exponent = Double.parseDouble(input.readLine());

            double result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}