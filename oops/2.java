//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog{
    String name,breed;

    Dog()
    {
        this.name= "Sam";
        this.breed= "pug";
    }

    void setName(String a)
    {
        this.name= a;
    }

    void setBreed(String a)
    {
        this.breed = a;
    }
}

class Myclass{
    public static void main(String arg[])
    {
        Dog d1 = new Dog();
        System.out.println("Values before updating : ");
        System.out.println("Name: "+d1.name+"\t"+"Breed: "+d1.breed);

        d1.setName("Roshan");
        d1.setBreed("German Shepherd");
        System.out.println("Values after updating : ");
        System.out.println("Name: "+d1.name+"\t"+"Breed: "+d1.breed);

    }
}