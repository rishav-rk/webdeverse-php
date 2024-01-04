
//Write a Java program to print the even numbers from 1 to 20
class p16{
public static boolean isOdd(int n) {
    return n % 2 != 0;
}

public static void printOdd(int start, int end) {
    System.out.println("Odd Numbers are: ");
    for (int i = start; i <= end; i++) {
        if (isOdd(i)) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

public static void main(String[] args) {

    printOdd(1, 20);
}
}