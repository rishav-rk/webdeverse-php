//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

class Rectangle{
   double width;
   double height;

   double getArea(double a, double b)
   {
       return a*b;
   }


   double getPerimeter(double a, double b)
   {
       return 4*(a+b);
   }

   public static void main(String arg[])
   {
       Rectangle r1 = new Rectangle();
       double area=r1.getArea(50,78.5);
       double peri=r1.getPerimeter(50,78.5);

       System.out.print("Area of rectangle: "+area+"\n"+"Perimeter of rectangle: "+peri);
   }
}