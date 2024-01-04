
//Write a Java program to swap two variables
class vars{
    int value1,value2;

    void swap(int a, int b)
    {
        System.out.println("Values before swapping \na: "+a+"\tb: "+b);
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swapping \na: "+a+"\tb: "+b);
    }

    void input()
    {
        try{
            java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.println("Enter the numbers you want to swap : ");
            this.value1 = Integer.parseInt(input.readLine());
            this.value2= Integer.parseInt(input.readLine());
        }catch(java.io.IOException a )
        {
            a.getMessage();
        }
    }

    public static void main(String str[])
    {
        vars test = new vars();
        test.input();
        test.swap(test.value1, test.value2);
    }
}