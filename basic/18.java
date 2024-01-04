
//Write a Java program to convert a string to an integer
class convert{
    public static void main(String str[]) throws java.io.IOException
    {
        System.out.println("Enter a number: ");
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        try
        {int n = Integer.parseInt(input.readLine());
            System.out.println("String Converted to number successfully!!!");
         }
        catch( java.lang.NumberFormatException a)
        {
            System.out.println(a.getMessage());
            System.out.println("Input string is not a number, thus we cannot convert it");
        }
        
    }
}