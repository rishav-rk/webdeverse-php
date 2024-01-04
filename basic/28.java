
//Java Program to find area of rectangle
import java.util.Scanner;

class Test
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        double l = s.nextDouble();
        System.out.println("Enter the breadth of rectangle:");
        double b = s.nextDouble();
        double area = l * b;
        System.out.println("Area of Rectangle is: " + area);
    }
}
