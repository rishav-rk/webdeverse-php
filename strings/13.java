
// Program to count number of words in a String?
 class WordCount {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String inputString = "Welcome to java Programming";

        int wordCount = countWords(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Number of words: " + wordCount);
    }
}
