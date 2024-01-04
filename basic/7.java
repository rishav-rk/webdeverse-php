
//Write a Java program to convert a decimal number to binary numbers
import java.util.ArrayList;
class convert{
    int val;

    void input() 
    {
        System.out.println("Enter the number you want to convert to binary: ");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        try{this.val= Integer.parseInt(input.readLine());}
        catch(java.io.IOException a){ System.out.println(a.getMessage());}
    }

    void tobinary(int a)
    {
        ArrayList<Integer> binary = new ArrayList<Integer>();
        while(a>0)
        {
            binary.add(0,a%2);
            a /= 2;
        }

        System.out.print("The binary form of the given number is : "+binary);
    }


    public static void main(String str[])
    {
        convert test = new convert();
        test.input();
        test.tobinary(test.val);
    }
}