// Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

class circle {
    private int radius = 0;

    public int getter() {
        return radius;
    }

    public void setter(int x) {
        radius = x;
    }

    double calculatearea() {
        int r = getter();
        double area = 3.14 * r * r;
        return area;
    }

    double calculateperimeter() {
        int r = getter();
        double perimeter = 2 * 3.14 * r;
        return perimeter;
    }

    public static void main(String s[]) {
        circle obj = new circle();
        obj.setter(10);
        System.out.println("Area of circle is: " + obj.calculatearea());
        System.out.println("Perimeter of circle is: " + obj.calculateperimeter());
    }
}