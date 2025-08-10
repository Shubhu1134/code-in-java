// 10. Write a Java program to create a class called "Student"
// with a name, grade, and courses attributes, and methods to add and remove courses.

import java.util.ArrayList;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    public Student() {}

    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " added.");
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " removed.");
        } else {
            System.out.println(course + " not found.");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

class TestMain {
    public static void main(String args[]) {
        Student s1 = new Student("Alice", "A");
        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.display();
        s1.removeCourse("Math");
        s1.display();
    }
}
