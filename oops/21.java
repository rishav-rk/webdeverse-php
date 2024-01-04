// Create a class showing an example of parameterized constructor.

class MyClass {
private int number;
private String name;

// Parameterized Constructor
public MyClass(int a, String b) {
number = a;
name = b;
}

// Method to display values
public void display() {
System.out.println("Number: " + number);
System.out.println("Name: " + name);
}
}

 class pro21 {
public static void main(String[] args) {
// Creating an instance of MyClass using the parameterized constructor
MyClass myObject = new MyClass(34,"Ruqayya");

// Displaying values initialized by the default constructor
myObject.display();
}
}

