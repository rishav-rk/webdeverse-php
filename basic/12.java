
//Write a Java program to count the letters, spaces, numbers and other characters of an input string
import java.io.BufferedReader;
import java.io.InputStreamReader;


class chars{
    String s1,s2,s3;
    String test;
    chars()
    {
     s1="0123456789";
     s2=" ";
     s3="qwertyuiopasdfghjklzxcvbnm";
    }

    void check(String s)
    {
        int letters=0,nums=0,spaces=0,other=0;
        for(int i=0;i<s.length();i++)
        {
            if(s1.contains(s.subSequence(i,i+1)))
            nums++;
            else if(s2.contains(s.subSequence(i,i+1)))
            spaces++;
            else if(s3.contains(s.subSequence(i,i+1)))
            letters++;
            else other++;
        }

        System.out.println("The number of letter in the given String : "+letters);
        System.out.println("The number of numbers in the given String : "+nums);
        System.out.println("The number of spaces in the given String : "+spaces);
        System.out.println("The number of other characters in the given String : "+other);

    }

    public static void main(String str[]) throws java.io.IOException
    {
        chars b = new chars();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string : ");
        b.test = input.readLine();
        b.check(b.test);

        
    }

}