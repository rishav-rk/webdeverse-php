//Create a Java program to access the java.util.Date class through import keyword and print the current date of the system.

import java.util.Date;
class date{
    public static void main(String args[])
    {
        Date today = new Date();
     System.out.println(today);
     System.out.println("Current date of the System :"+today.getDate()+"-"+today.getMonth()+"-"+(1900+today.getYear()));   

    }
}