
//Write a Java program to compute the square root of an given integer
class p23{
public static void main(String args[]) throws java.io.IOException
{
java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
System.out.println("Enter a number: ");
int a= Integer.parseInt(input.readLine());
double c=Math.sqrt(a);
System.out.println("Square root of the given number is: "+c);
}
}