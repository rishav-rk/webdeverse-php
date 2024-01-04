
//Write a Java program to compare two numbers
import java.io.BufferedReader;
import java.io.InputStreamReader;
class compare{

    int num1,num2;

    void compareNum()
    {
        if(this.num1>this.num2)
        System.out.println(num1+" is greater than "+num2);
        if(this.num1<this.num2)
        System.out.println(num1+" is smaller than "+num2);
        if(this.num1 == this.num2)
        System.out.println(num1+" is equal than "+num2);    
    }

    public static void main(String str[]) throws java.io.IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        compare obj = new compare();
        System.out.println("Enter the two number you want to compare: ");
        obj.num1= Integer.parseInt(input.readLine());
        obj.num2= Integer.parseInt(input.readLine());
        obj.compareNum();

    }
}