
//Write a Java program to compute the sum of the first 100 prime numbers
class prime{

    static boolean check(int a)
    {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            return false;
        }

        return true;
    }
    public static void main(String str[])
    {
        System.out.println("first 100 prime number: ");
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            if(prime.check(i))
            {
                System.out.print(i+" ");
                sum += i;
            }   
        }

        System.out.println("\nSum of these prime numbers "+sum);
    }
}