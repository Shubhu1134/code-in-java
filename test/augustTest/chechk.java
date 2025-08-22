// Q3. (4 Marks)
// Write a Java program using OOP concepts:
//
// Create a class Student with attributes: name, marks.
// Create a method getGrade() that returns:
// "A" if marks ≥ 80
// "B" if marks ≥ 60 and < 80
// "C" if marks ≥ 40 and < 60
// "F" if marks < 40
// Create main() method to create 3 students and print their name with grade.

import java.util.*;

class Student {
    private String name;
    private int marks;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Method to return grade based on marks
    public String getGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 Student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Input details for student 1
        System.out.print("Enter name of Student 1: ");
        s1.setName(sc.nextLine());
        System.out.print("Enter marks of Student 1: ");
        s1.setMarks(sc.nextInt());
        sc.nextLine(); // consume newline

        // Input details for student 2
        System.out.print("Enter name of Student 2: ");
        s2.setName(sc.nextLine());
        System.out.print("Enter marks of Student 2: ");
        s2.setMarks(sc.nextInt());
        sc.nextLine(); // consume newline

        // Input details for student 3
        System.out.print("Enter name of Student 3: ");
        s3.setName(sc.nextLine());
        System.out.print("Enter marks of Student 3: ");
        s3.setMarks(sc.nextInt());

        // Print name with grade
        System.out.println("\nStudent Grades:");
        System.out.println(s1.getName() + " - Grade: " + s1.getGrade());
        System.out.println(s2.getName() + " - Grade: " + s2.getGrade());
        System.out.println(s3.getName() + " - Grade: " + s3.getGrade());

        sc.close();
    }
}
