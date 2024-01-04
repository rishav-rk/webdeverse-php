
// Program to find the number of the words in the given text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class WordCount {
    public static void main(String[] args) {
        String filePath = "data.txt"; // replace with your file path
        BufferedReader reader = null;
        int wordCount = 0;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] words = currentLine.split("\\s+");
                wordCount += words.length;
                currentLine = reader.readLine();
            }

            System.out.println("Number of words: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
