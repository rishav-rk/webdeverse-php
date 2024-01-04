
//Java Program to find area of rhombus
import java.util.*;
import java.io.*;
class p1{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of diagonal 1 : ");
        int d1 = obj.nextInt();
        System.out.println("Enter value of diagonal 2 : ");
        int d2 = obj.nextInt();
        int res = (d1 * d2)/2;
        System.out.println("Area of Rhombus : "+res);
    }
}
