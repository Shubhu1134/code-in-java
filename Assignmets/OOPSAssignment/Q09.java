// 9. Write a Java program to create a class called "Employee"
// with a name, salary, and hire date attributes, and a method
// to calculate years of service.

import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public Employee() {}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
    }
}

class TestMain {
    public static void main(String args[]) {
        Employee e1 = new Employee("John Doe", 50000, LocalDate.of(2015, 6, 15));
        Employee e2 = new Employee("Jane Smith", 65000, LocalDate.of(2018, 3, 1));

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("\nEmployee 2:");
        e2.display();
    }
}
