
//Java program to check vowel or consonant
import java.util.Scanner;
class check{
    public static void main(String str[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        char[] arr = {'A','E','I','O','U','a','e','i','o','u'};
        if(java.util.Arrays.binarySearch(arr,ch)==1)
        System.out.println("You've entered a vowel");
        else
        System.out.println("You've entered a consonant");
    }
}