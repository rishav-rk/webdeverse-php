// Create a class entering the rollno, name and class of the student from user but rollno should be automatically generated as we enter the information of 10 students

import java.util.Scanner;

class Student {
    private static int counter = 1;
    private int rollNo;
    private String name;
    private String className;

    public Student(String name, String className) {
        this.rollNo = counter++;
        this.name = name;
        this.className = className;
    }

    public void printStudentInfo() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Class: " + className);
    }
}

 class createStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the name of the student:");
            String name = scanner.nextLine();
            System.out.println("Enter the class of the student:");
            String className = scanner.nextLine();
            students[i] = new Student(name, className);
        }

        for (Student student : students) {
            student.printStudentInfo();
        }

        scanner.close();
    }
}
