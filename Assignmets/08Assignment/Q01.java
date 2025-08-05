// // Employee Record System
// Create a class Employee with private fields: id, name, and salary.
// Use setter methods to assign values. Add a method to display Employee details.

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("----Employee Details ----");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Salary: " + salary);
    }
}

 class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();

        System.out.print("Enter Employee ID: ");
        obj.setId(sc.nextInt());

        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        obj.setName(sc.nextLine());

        System.out.print("Enter Employee Salary: ");
        obj.setSalary(sc.nextDouble());

        obj.displayDetails();
    }
}

