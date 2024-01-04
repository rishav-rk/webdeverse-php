
//Java Program to find area of equilateral triangle
import java.util.Scanner;

class area{
    public static void main(String str[])
    {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of side : ");
    Double s1 = input.nextDouble();
    
    double s = (s1*3)/2;
    double area = Math.sqrt(s*(s-s1)*(s-s1)*(s-s1));
    System.out.println("Area of the equilateral triangle is: "+ area);


    }
}
