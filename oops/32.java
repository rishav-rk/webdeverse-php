//Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.

class Student {
    private int student_id;
    private String student_name;
    private int grades;
    private int numberOfGrades;

    // Getter and Setter for 'student_id'
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    // Getter and Setter for 'student_name'
    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    // Method to add a grade with validation
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades += grade;
            numberOfGrades++;
        } else {
            System.out.println("Invalid grade. Grade should be between 0 and 100.");
        }
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        if (numberOfGrades > 0) {
            return (double) grades / numberOfGrades;
        } else {
            return 0.0;
        }
    }
}

class pro32 {
    public static void main(String[] args) {
        // Creating an instance of Student class
        Student student = new Student();

        // Setting values using setter methods
        student.setStudentId(101);
        student.setStudentName("Alice");

        // Adding grades
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(78);

        // Displaying student details and average grade
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Average Grade: " + student.calculateAverageGrade());
    }
}