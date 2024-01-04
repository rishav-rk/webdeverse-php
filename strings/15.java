// Program to count the total number of punctuation characters exists in a String
class count
{
  public static void main(String args[])
  {
    int n = 0;
    System.out.println("Enter your String ");
    String line = new java.util.Scanner(System.in).nextLine();
    
    for (int i = 0; i < line.length(); i++)  
    {    
        if (!Character.isLetterOrDigit(line.charAt(i)) && line.charAt(i)!=' ') 
         n++;
    }

    System.out.println("number of punctuation characters : "+ n);
    
  }
}
