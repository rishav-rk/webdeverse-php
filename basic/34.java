
//Java Program to find volume of sphere
import java.util.*;
import java.io.*;
 class p4{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        int r = obj.nextInt();
        double res = (4/3)* Math.PI * r * r * r;
        System.out.println("Volume of Sphere : "+res);
    }
}
