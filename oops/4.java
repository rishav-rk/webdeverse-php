//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

import java.text.DecimalFormat;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getCircumference()
    {
        return 2 * 3.14 * this.radius;
    }
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.000000000");

        //scanning the radius
        System.out.print("Enter the radius of the circle : ");    
        obj.setRadius(scanner.nextDouble());

        //area and circumference
        System.out.println("The Area of given circle with radius "+obj.getRadius()+" : "+format.format(obj.getArea()));
        System.out.println("The Area of given circle with radius "+obj.getRadius()+" : "+format.format(obj.getCircumference()));

        scanner.close();
    }

}