
//Write a Java program to print the days in a month
class fiftyThree {
    public static void main(String[] arg) throws java.io.IOException {
        System.out.print("Enter the month name : ");

        String month = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine().toLowerCase();
        String message = "Kindly enter a valid month, " + month + " is not a valid month";

        switch (month) {
            case "january": case "march": case "may": case "july": case "august": case "october": case "december":
                message = month + " has 31 days!!"; break;
            case "april": case "june": case "september": case "november":
                message = month + " has 30 days!!"; break;
            case "february":
                message = month + " has 28 days but, if it is from a leap year then it will have 29 days"; break;
        }

        System.out.println(message);
    }
}
