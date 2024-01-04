
//Program to append the string using StringBuffer class
import java.lang.StringBuffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class string{
    public static void main(String args[])throws java.io.IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Enter a string: ");
        StringBuffer str= new StringBuffer(input.readLine());

        System.out.print(" Enter the string you want to append: ");
        StringBuffer str2= new StringBuffer(input.readLine());

        str = str.append(str2);
        System.out.print("The new string is :"+str);
    }
}