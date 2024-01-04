// Create a Java program to create a package with public class and public members to be accessed in another class.

/*
package P1;

public class Pack1 {
public void show()
{
     System.out.println("Hello , This Is Package used in another class");
}
}

*/

import P1.Pack1;
class check{
    public static void main(String arg[])
    {
        Pack1 obj = new Pack1();
        obj.show();
    }
}