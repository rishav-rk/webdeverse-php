//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        System.out.println("Salary increased by "+ percentage+"%");
        this.salary += this.salary * percentage / 100.0;
    }

    public double calculateAnnualSalary() {
        return this.salary * 12;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Job Title: " + this.jobTitle);
        System.out.println("Salary: " + this.salary);
    }
}


//Another class
class emp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ruqayya", "Software Engineer", 5000000);
        employee.displayEmployeeDetails();
        employee.increaseSalary(10);
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
        employee.displayEmployeeDetails();
    }
}

