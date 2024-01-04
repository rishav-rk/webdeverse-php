// Write a Java method to compute the average of three numbers.

class Main {
    public double calculateAverage(double x, double y, double z) {
        return (x + y + z )/ 3;
    }

    // main function
    public static void main(String[] args) {
        double a, b, c;
        Main obj = new Main();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // input
        System.out.print("Enter the value for a : ");
        a = scanner.nextDouble();

        System.out.print("Enter the value for b : ");
        b = scanner.nextDouble();

        System.out.print("Enter the value for c : ");
        c = scanner.nextDouble();

        //calling funtion calculateAverage
        System.out.println("The Average of given numbers is : " + obj.calculateAverage(a, b, c));

        scanner.close();
    }
}
