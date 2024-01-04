
//Write a Java program to display the multiplication table of a given integer
class sixtyTwo {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter an integer: ");
            int n = Integer.parseInt(input.readLine());

            System.out.println("Multiplication table of " + n + ":");
            for (int i = 1; i <= 10; i++) 
                System.out.println(n + " x " + i + " = " + (n * i));
            
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}