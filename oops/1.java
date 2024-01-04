//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person{
    String name;
    int age;

    Person(String a, int b)
    {
        this.name = a;
        this.age= b;
    }

    public static void main(String arg[])
    {
        Person p1 = new Person("Ruqayya",21);
        Person p2 = new Person("Aaisha",25);

        System.out.println("Name: "+p1.name+"\t"+"Age: "+p1.age);
        System.out.println("Name: "+p2.name+"\t"+"Age: "+p2.age);
    }
}