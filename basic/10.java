
//Write a Java program and compute the sum of the digits of an integer
class digi{
    int num;
    void digitSum(int a)
    {
        int sum=0;
        while(a>0)
        {
            sum += a%10;
            a /= 10;
        }
        System.out.println("The sum of digits is : "+sum);
    }

    public static void main(String str[]) throws java.io.IOException
    {
        java.io.BufferedReader input  = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        digi number = new digi();
        System.out.println("Enter your number");
        number.num=Integer.parseInt(input.readLine());
        number.digitSum(number.num);
    }
}