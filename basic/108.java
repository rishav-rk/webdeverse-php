
//Write a Java program to print multiplication table of given number
import java.util.Scanner;

public class basicprogram7048_108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}