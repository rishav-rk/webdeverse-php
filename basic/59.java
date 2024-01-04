
//Write a java program to check vowel or consonant
class fiftyNine {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a character: ");
            char ch = input.readLine().charAt(0);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                boolean isVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

                if (isVowel) {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid letter.");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}