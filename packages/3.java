//Create a Java program to access the java.util.Date class through import keyword and print the current date of the system but inherit the Date class.

import java.util.Date;
class date extends Date{
    date(){
        System.out.print("Systems date: "+ this);
    }
    public static void main(String args[])
    {
        new date();
    }
}
