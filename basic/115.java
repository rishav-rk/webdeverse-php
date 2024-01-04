
//Write a Java program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered
class number
{
    public static void main(String arg[])throws java.io.IOException
    {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        Double num;
        String a="";
        System.out.println("Enter numbers, to quit enter q : ");
        while(true)
        {   try
           {
               a=input.readLine();
               num= Double.parseDouble(a); 
            }
            catch(java.lang.NumberFormatException e)
           {
               if(a.equals("q"))
               break;
               else continue;
           }
            if(num>max)
            max=num;
            if(num<min)
            min=num;
        }

    System.out.println("The maximum number was "+max);
    System.out.println("The minimum number was "+min);




    }
}