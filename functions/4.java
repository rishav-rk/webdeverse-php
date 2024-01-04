//Write a Java method to count all the words in a string.

class WordCounter {

    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            // Handle null or empty strings
            return 0;
        }

        // Split the string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Return the count of words
        return words.length;
    }

    public static void main(String[] args) {
        // Example: Count words in a string
        String sampleString = "This is a sample sentence with several words.";

        int wordCount = countWords(sampleString);

        System.out.println("Number of words: " + wordCount);
    }
}
