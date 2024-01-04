
//Write a Java program to print the odd numbers from 1 to 20
class p16{
public static boolean isEven(int n) {
    return n % 2 == 0;
}

public static void printEven(int start, int end) {
    System.out.println("Even Numbers are: ");
    for (int i = start; i <= end; i++) {
        if (isEven(i)) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

public static void main(String[] args) {

    printEven(1, 20);
}
}