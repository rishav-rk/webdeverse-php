
//Write a Java program to add two numbers without using any arithmetic operators
import java.util.Scanner;
 class P25 {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();


        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
