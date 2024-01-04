
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
import java.util.Scanner;
class sum{
    double sum_it(int a)
    {
        double sum=0;
        sum = a+Math.pow(a,2)+Math.pow(a,3);
        return sum;
    }
    public static void main(String str[])
    {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        sum val = new sum();
        double result=val.sum_it(a);
        System.out.println("The result of n+nn+nnn is "+result);
    }
}