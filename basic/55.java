
//Write a Java Program to accept number of week’s day (1-7) and print name of the day
class fiftyFive {
    public static void main(String[] args) {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter a number between 1 and 7: ");
            int dayNumber = Integer.parseInt(input.readLine());
            String dayName;

            switch (dayNumber) {
                case 1: dayName = "Sunday"; break;
                case 2: dayName = "Monday"; break;
                case 3: dayName = "Tuesday"; break;
                case 4: dayName = "Wednesday"; break;
                case 5: dayName = "Thursday"; break;
                case 6: dayName = "Friday"; break;
                case 7: dayName = "Saturday"; break;
                default: dayName = "Invalid day number";
            }
            System.out.println("Day: " + dayName);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}