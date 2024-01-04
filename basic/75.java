
//Write a java program to get the length of a given string
class seventyFive {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String inputString = input.readLine();
            int length = inputString.length();
            System.out.println("Length of the string: " + length);
            
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}