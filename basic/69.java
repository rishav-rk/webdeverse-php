
//Write a Java program to concatenate two string
class sixtyNine {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the first string: ");
            String str1 = input.readLine();
            System.out.print("Enter the second string: ");
            String str2 = input.readLine();

            String concatenatedString = str1 + str2;
            System.out.println("Concatenated string: " + concatenatedString);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}