
//Write a java program to print current date and time in the specified format
import java.text.SimpleDateFormat;
import java.util.Date;

class seventySix {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(new Date());

        System.out.println("Current Date and Time: " + formattedDate);
    }
}