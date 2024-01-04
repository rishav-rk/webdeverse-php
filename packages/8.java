//Create a Java program to create a package with public class and protected members to be accessed in another class.

/* Program named A_8.java
package program8;
public class A_8{
    protected String str;
    public A_8(String a){
        this.str = a;
        System.out.println("The protected string str is set to "+ a);
    }

}
*/

class check{
    public static void main(String arg[])
    {
        program8.A_8 obj = new program8.A_8("Hello, This is ruqayya");
    }
}