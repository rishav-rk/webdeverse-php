
//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

class Animal {
    public void move() {
        System.out.println("The animal moves.");
    }
}

 class Cheetah extends Animal {
   @Override
    public void move() {
        System.out.println("The Cheetah runs.");
    }
}

class  Main_c{
    public static void main(String x[] ) {
        Animal a = new Animal();
        Cheetah c = new Cheetah();        
        a.move();
        c.move();
    }
}