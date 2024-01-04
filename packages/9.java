//Create a Java program to create a nested package i.e. c4.sample with public class and protected members to be accessed in another class.

/* file named A_9.java
   package c4.sample;
   public class A_9{
       protected String str;
       public A_9(String a)
       {
           this.str = a;
           System.out.println("The protected member str is set to "+a);
       }
   }

*/

import c4.sample.A_9;
class check{
    public static void main(String arg[])
    {
    A_9 obj = new A_9("Hello, java! Rishav here.");

    }
}