
// Program to find maximum occurring character in a string
import java.util.*;
 class maxChars {
 static final int N = 256;
 static char MaxOccuringChar(String str1) {
  int ctr[] = new int[N];
  int l = str1.length();
  for (int i = 0; i < l; i++)
   ctr[str1.charAt(i)]++;
  int max = -1;
  char result = ' ';

  for (int i = 0; i < l; i++) {
   if (max < ctr[str1.charAt(i)]) {
    max = ctr[str1.charAt(i)];
    result = str1.charAt(i);
   }
  }

  return result;
 }
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your String: ");
  String str1 = input.nextLine();
  System.out.println("The given string is: " + str1);
  System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
 }
}
