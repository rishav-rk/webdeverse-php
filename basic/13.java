
//Write a Java program to print the ascii value of a given character
import java.util.Scanner;
class value{
    char a;
    void check(char a)
    {
        int b=a;
        System.out.println("Ascii value of "+a+" is : "+b);
    }

    public static void main(String str[])
    {
        value v1 = new value();
        Scanner input = new Scanner(System.in);
        v1.a= (input.next()).charAt(0);
        v1.check(v1.a);
    }
}