
//Write a Java program that takes five numbers as input to calculate and print the average of the numbers
class average{
    public static void main(String str[]) throws java.io.IOException
    {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int nums[] = new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
             System.out.println("Enter "+(i+1)+" number ");
            nums[i]=Integer.parseInt(input.readLine());
            sum += nums[i];
        }

        System.out.println("The average of the five numbers is : "+((float)sum/5));
    }
}