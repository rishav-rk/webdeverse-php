
//Java program to find area of circle
class area{
    public static void main(String str[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area= Math.PI*radius*radius;
        System.out.println("Area of the circle is: "+area);
    }
}