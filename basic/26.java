
//Write a Java program to add all the digits of a given positive integer
class sum
{
    public static void main(String st[])
    {
        int num=12345,sum=0,temp;
        temp=num;
        System.out.println("Given number is : "+num);
        while(num!=0)
            {
                sum=sum+num%10;
                num=num/10;
            }
            System.out.println("Sum of all digits  in the "+temp+" is "+sum);
          

    }
}