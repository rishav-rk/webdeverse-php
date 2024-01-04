//Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Employee {
    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String name, double salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int calculateYearsOfService() {
        Date currentDate = new Date();
        long timeDifference = currentDate.getTime() - hireDate.getTime();
        int years = (int) (timeDifference / (1000L * 60 * 60 * 24 * 365));
        return years;
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date hireDate = null;
        try {
            hireDate = dateFormat.parse("2018-11-27"); // Replace with the actual hire date
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Employee employee = new Employee("John Doe", 50000.0, hireDate);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: $" + employee.getSalary());
        System.out.println("Hire Date: " + dateFormat.format(employee.getHireDate()));
        System.out.println("Years of Service: " + employee.calculateYearsOfService() + " years");
    }
}
