//Get all characters from the file, count number of lines, words, characters and display on the screen

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class prog10 {
    static BufferedReader reader;
    public static void main(String[] args)  throws ClassNotFoundException{
        String filePath = "abc.txt"; // Replace with the actual path to your file

        try{ 
            reader = new BufferedReader(new FileReader(filePath));
            int character;
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            boolean inWord = false;

            while ((character = reader.read()) != -1) {
                charCount++;

                // Count lines
                if (character == '\n') {
                    lineCount++;
                }

                // Count words
                if (Character.isWhitespace(character)) {
                    inWord = false;
                } else if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            }

            // Display statistics
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            }
            catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 }