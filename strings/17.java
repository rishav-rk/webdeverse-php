
// Program to determine whether a given string is palindrome
class palindrome{
    public static void main(String st[]){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Enter your String: ");
    StringBuffer str= new StringBuffer( input.nextLine());
    StringBuffer st1 = new StringBuffer(str);
    str.reverse();

    //converting string back to string from string buffer
    String s1=st1.toString();
    String s2=str.toString();
   
   if(s1.equals(s2))
   System.out.println("It is a palindrome String");
   else
   System.out.println("It is not a palindrome String");
    

}
}