// 14. Write a Java program to create a class called "School"
// with attributes for students, teachers, and classes,
// and methods to add and remove students and teachers, and to create classes.

import java.util.ArrayList;

class School {
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added as student.");
    }

    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " removed from students.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void addTeacher(String name) {
        teachers.add(name);
        System.out.println(name + " added as teacher.");
    }

    public void removeTeacher(String name) {
        if (teachers.remove(name)) {
            System.out.println(name + " removed from teachers.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void addClass(String className) {
        classes.add(className);
        System.out.println(className + " class created.");
    }

    public void display() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }
}

class TestMain {
    public static void main(String args[]) {
        School school = new School();
        school.addStudent("Alice");
        school.addTeacher("Mr. Smith");
        school.addClass("Math");
        school.display();
        school.removeStudent("Alice");
        school.display();
    }
}
