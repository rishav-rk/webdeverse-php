//Write a Java method to print characters between two characters (i.e. A to P).

class CharacterPrinter {

    public static void printCharactersBetween(char start, char end) {
        // Ensure that start is less than or equal to end
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }

        // Print characters between start and end (inclusive)
        for (char c = (++start); c < end; c++) {
            System.out.print(c + " ");
        }
        System.out.println(); // Move to the next line after printing all characters
    }

    public static void main(String[] args) {
        // Example: Print characters between 'A' and 'P'
        printCharactersBetween('A', 'P');
    }
}
