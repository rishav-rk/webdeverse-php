
//Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
class Operations
{
	public static void main(String str[])throws java.io.IOException
	{	
		System.out.println("Computing the product of two number using BufferedReader Class");

		java.io.InputStreamReader obj = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader input = new java.io.BufferedReader(obj);
		System.out.println("enter a number : ");
		int a=Integer.parseInt(input.readLine());
		System.out.println("enter a number : ");
		int b=Integer.parseInt(input.readLine());
		System.out.println("Sum of nums: "+ (a+b));
		System.out.println("Product of nums: " + (a*b));
		System.out.println("Subraction of nums: "+ (a-b));
		System.out.println("Division of nums: " + (a/b));
		System.out.println("Modulo of nums: " + (a%b));
}}