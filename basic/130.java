
//Write a Java method to displays prime numbers between 1 to 20
import java.util.Scanner;
class Bpc130{
    void prime(int s,int e){
        for(int i=s;i<=e;i++){
            int f=0;
            for(int j=2;j<=i/2;j++){
            if(i%j==0){
                ++f;
            }
        }
        if(i<=1){
            ++f;
        }
         else if(f==0){
            System.out.println(i);
        }
        }   
    }
}
class b{
    public static void main(String str[]){
    
    Bpc130 obj=new Bpc130();
    Scanner sc=new Scanner(System.in);
    System.out.println("Prime numbers between 1 to 20 are: ");
    obj.prime(1,20);
    }
}
