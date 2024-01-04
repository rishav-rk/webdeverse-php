
//Java program to sum of N numbers
import java.util.Scanner;

    class add {
    public static void main(String arg[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to sum:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " number :");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Sum of " + n + " numbers is =" + sum);
    }
}
    


