//Create a Java program to access the java.util.Date class through qualified way and print the current date of the system.

class date{
    public static void main(String args[])
    {
        java.util.Date today = new java.util.Date();
        System.out.print("Systems date: "+today);
    }
}