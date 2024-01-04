
//Java Program to find area of triangle
import java.util.Scanner;

class area{
    public static void main(String str[])
    {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of first side: ");
    Double s1 = input.nextDouble();
    System.out.println("Enter the length of second side: ");
    Double s2 = input.nextDouble();
    System.out.println("Enter the length of third side: ");
    Double s3 = input.nextDouble();

    double s = (s1+s2+s3)/2;
    double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    System.out.println("Area of the triangle is: "+ area);


    }
}
