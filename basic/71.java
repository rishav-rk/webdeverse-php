
//Write a Java program to convert all characters in a string to uppercase
class seventyOne {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string to convert to uppercase: ");
            String strUpper = input.readLine().toUpperCase();
            System.out.println("Uppercase string: " + strUpper);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}