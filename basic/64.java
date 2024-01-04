
//Write a Java program that reads an positive integer and count the number of digits
class sixtyFour {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a positive integer: ");
            long number = Long.parseLong(input.readLine());

            if (number < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int digitCount = (number == 0) ? 1 : 0;

                while (number > 0) {
                    digitCount++;
                    number /= 10;
                }

                System.out.println("Number of digits: " + digitCount);
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}