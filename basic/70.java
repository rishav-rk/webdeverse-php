
//Write a Java program to convert all characters in a string to lowercase
class seventy {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string to convert to lowercase: ");
            String strLower = input.readLine().toLowerCase();
            System.out.println("Lowercase string: " + strLower);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}