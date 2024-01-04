
//Java Program to find volume of cone
import java.util.*;
import java.io.*;
class p7{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        int r = obj.nextInt();
        System.out.println("Enter value of height : ");
        int h = obj.nextInt();
        double res = 3.14 * (h/3) * r * r;
        System.out.println("Volume of Cone : "+res);
    }
}
