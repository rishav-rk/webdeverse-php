
//Write a Java program that determines a student’s grade
class sixtySeven {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the student's score (0-100): ");
            int score = Integer.parseInt(input.readLine());

            char grade;

            if (score >= 90) { grade = 'A'; } 
            else if (score >= 80) { grade = 'B'; } 
            else if (score >= 70) { grade = 'C'; } 
            else if (score >= 60) { grade = 'D'; } 
            else { grade = 'F'; }

            System.out.println("Student's grade: " + grade);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric score.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}