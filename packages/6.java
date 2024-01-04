//Create a Java program to create a package with 4 public classes, create the object in another file and call the function created in those classes

/* file named A_6.java
package pack_1;
public class A_6{
    public void disp()
    {
        System.out.println("This is class 'A' from pack-1");
    }
}
*/

/* file named B_6.java
package pack_1;
public class B_6{
    public void disp()
    {
        System.out.println("This is class 'B' from pack-1");
    }
}
*/


/* file named C_6.java
package pack_1;
public class C_6{
    public void disp()
    {
        System.out.println("This is class 'C' from pack-1");
    }
}

*/

/* file named D_6.java
package pack_1;
public class D_6{
    public void disp()
    {
        System.out.println("This is class 'D' from pack-1");
    }
}

*/


//file named 6.java
import pack_1.*;
class check{
   public static void main(String ar[])
   {
       
    pack_1.A_6 a= new pack_1.A_6();
    pack_1.B_6 b= new pack_1.B_6();
    pack_1.C_6 c= new pack_1.C_6();
    pack_1.D_6 d= new pack_1.D_6();

    a.disp();
    b.disp();
    c.disp();
    d.disp();
}

   
}
