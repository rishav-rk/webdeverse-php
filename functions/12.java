//Write a Java method that accepts three integers and returns true if one is the middle point between the other two integers, otherwise false.

class MiddlePointChecker {

    public static boolean isMiddlePoint(int a, int b, int c) {
        // Sort the numbers
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int middle = a + b + c - min - max;

        // Check if 'middle' is the middle point
        return middle == b;
    }

    public static void main(String[] args) {
        // Example: Check if 5 is the middle point between 3 and 8
        int num1 = 3;
        int num2 = 5;
        int num3 = 8;

        boolean result = isMiddlePoint(num1, num2, num3);

        System.out.println(num2 + " is the middle point between " + num1 + " and " + num3 + ": " + result);
    }
}
