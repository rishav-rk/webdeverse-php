
//Program to Check if a String contains only digits?

import java.io.BufferedReader;
import java.io.InputStreamReader;
class digits{
    public static void main(String args[])throws java.io.IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string to check whether it contains only digits: ");
        String str = input.readLine();
        if(str.contains(" "))
        {
            str = str.replaceAll(" ","");
            try{
                int a = Integer.parseInt(str);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Not a number.");
                return;
            }

            System.out.println("Its a number, along with whitespaces.");
        }
        else
        {
            try{
                int a = Integer.parseInt(str);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Not a numbers.");
                return;
            }

            System.out.println("Its a number.");
        }

    }
}