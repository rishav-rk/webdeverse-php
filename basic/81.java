
//Write a java program to count total number of lines from a string
class eightyOne {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.println("Enter a multi-line string (type 'end' on a new line to finish input):");
            String inputLine;
            int lineCount = 0;

            while (true) {
                inputLine = input.readLine();
                if (inputLine.equals("end")) {
                    break;
                }
                lineCount++;
            }

            System.out.println("Total number of lines: " + lineCount);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}