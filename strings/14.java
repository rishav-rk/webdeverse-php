
// Program to count the total number of characters in a string
class S14
{
  public static void main(String args[])
  {
    int n = 0;
    System.out.println("Enter your String: ");
    String line = new java.util.Scanner(System.in).nextLine();
    
    for (int i = 0; i < line.length(); i++)  if (line.charAt(i) != ' ') n++;

    System.out.println("number of characters : "+n);
    
  }
}
