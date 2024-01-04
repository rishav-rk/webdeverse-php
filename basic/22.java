
//Write a Java program to count the number of even and odd elements in a given array
import java.util.Arrays;
class p22{
 public static void main(String[] args) {
        int[] a = {1, 7, 3, 13, 5, 6, 7, 8, 9, 10};
        
        int e = 0;
        int o = 0;

        for (int n : a) {
            if (n % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(a));
        System.out.println("Even Numbers: " + e);
        System.out.println("Odd Numbers: " + o);
    }
}