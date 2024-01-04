//Create a Java program to access the java.util.Date class through qualified way and print the current date of the system but inherit the Date class.

class date extends java.util.Date{
    date(){
        System.out.print("Systems date: "+ this);
    }
    public static void main(String args[])
    {
        new date();
    }
}
