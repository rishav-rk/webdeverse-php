
//Write a Java program to replace all the ‘d’ characters with ‘f’ characters
class seventyFour {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String replacedString = input.readLine().replace('d', 'f');

            System.out.println("String after replacing 'd' with 'f': " + replacedString);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}