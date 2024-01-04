
//Write a java program to remove a particular character from a string
class seventyEight {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String inputString = input.readLine();

            System.out.print("Enter the character to remove: ");
            char characterToRemove = input.readLine().charAt(0);

            String modifiedString = inputString.replace(String.valueOf(characterToRemove), "");

            System.out.println("String after removing '" + characterToRemove + "': " + modifiedString);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}