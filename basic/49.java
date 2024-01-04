
//Java Pogram to Calculate Commission Percentage
import java.util.Scanner;
class p49{
public static void main(String at[]){
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the sales amount: $");
        double salesAmount = r.nextDouble();

        System.out.print("Enter the commission rate (%): ");
        double commissionRate = r.nextDouble();

        r.close();

        double commissionAmount = (salesAmount * commissionRate) / 100.0;

        System.out.printf("The commission amount is: $%.2f%n", commissionAmount);
    }
}
