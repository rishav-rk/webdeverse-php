
//Java program to find factorial of any number
import java.util.Scanner;
class Bpc44{
    double fact(int x){
        if(x==0){
            return 1;
        }
         return x*(fact(x-1));
    }
}

class b{
    public static void main(String str[]){
    Bpc44 obj=new Bpc44();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int a=sc.nextInt();
    System.out.println("Factorial of the Number is : "+ obj.fact(a));
}
}