
//Program to remove all occurrences of a given character from input String?
import java.io.InputStreamReader;
import java.io.BufferedReader;

class remove_char{
    public static void main(String args[])throws java.io.IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your string: ");
        String str = input.readLine();
        System.out.print("Enter the character you want to remove: ");
        String ch = String.valueOf((input.readLine()).charAt(0));
        str=str.replace(ch,"");
        System.out.print("String after removing your character: "+str);
    }
}