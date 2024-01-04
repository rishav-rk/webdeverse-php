
//Write a Java program to input 5 numbers from keyboard and find their sum and average
class fiftySeven {
    public static void main(String[] args) {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            double sum = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter number " + i + ": ");
                double num = Double.parseDouble(input.readLine());
                sum += num;
            }
            System.out.println("Sum of numbers : " + sum);
            System.out.println("Average of numbers : " + sum/5);

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}