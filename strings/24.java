
// Program to find the duplicate characters in a string
import java.util.*; 
 class check_duplicate 
{
       static int arr[]=new int[26];
    static void CountCharacters(String str1)
    {
       
        str1=str1.toUpperCase();
        System.out.println(str1);
       for (int i = 0; i < str1.length();  i++)
        {  arr[(str1.charAt(i))-65]++;     }
    }
    static void showDuplicates(String str1)
    {
        System.out.println("Duplicate Characters: ");
      for(int i=0;i<26;i++)
      {
          if(arr[i]>1)
          System.out.println((char)(i+65)+"-"+arr[i]);
      }
    }
    public static void main(String[] args)
    {
        String str1 = "RuqayyaParveen";
		System.out.println("The given string is: "+str1);
		System.out.println("The duplicate characters and counts are: ");
        CountCharacters(str1);
        showDuplicates(str1);
    }
}
