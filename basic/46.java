
//Java Program To Calculate CGPA Percentage
class p46 {

    public static void main(String[] args) {
  int n=4;
        int[] grades = new int[n];
 System.out.println(" Total subject on your Course:"+n);
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Grade of subject " + (i + 1) + ":");
java.util.Scanner sc=new java.util.Scanner(System.in);           
 grades[i] = sc.nextInt();

             if (grades[i] >= 0 && grades[i] <= 10) {
                total += grades[i];
            } else {
                System.out.println("Invalid grade. Please enter a number between 0 and 10");
                i--; 
            }
        }
        double cgpa = (double) total / n;

     
        double p = cgpa * 9.5;

      
        System.out.println("Your CGPA is: " + cgpa);
        System.out.println("Your percentage is: " + p + "%");
    }
}
