
//Write a Java program to display the cube of the number upto given an integer
class sixty {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter an integer: ");
            int n = Integer.parseInt(input.readLine());

            System.out.println("Cubes of numbers up to " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.println(i + "^3 = " + (long)(i * i * i));
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}