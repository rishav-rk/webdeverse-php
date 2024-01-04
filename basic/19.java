
//Write a Java program to convert seconds to hour, minute and seconds
class time{
    public static void main(String str[])
    {
        System.out.print("Enter the time in seconds : ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int s = input.nextInt();

        int hours= s/3600;
        int minutes = (s%3600)/60;
        int seconds = (s%3600)%60;

        System.out.println(hours+" hours "+minutes+" minutes "+seconds+ " seconds");
    }
}