
//Write a java program to reverse a String
class seventyNine {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            StringBuffer reversedString = new StringBuffer(input.readLine()).reverse();

            System.out.println("Reversed string: " + reversedString);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}