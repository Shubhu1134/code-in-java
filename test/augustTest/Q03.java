// 3. (4 Marks)

// Write a Java program using OOP concepts:
// Create a class Student with attributes: name, marks.
// Create a method getGrade() that returns:
// "A" if marks ≥ 80
// "B" if marks ≥ 60 and < 80
// "C" if marks ≥ 40 and < 60
// Q
// "F" if marks < 40
// Create main() method to create 3 students and print their name with grade.

/

class Student {
    private String name;
    private String marks;


    public Student(String name, String marks) {
        this.name = name;
        this.marks = marks;
        
    }
    public Student() {}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
    public String getMarks() {
        return marks;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void grade(double grade) {
        grade = marks/ 100;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + marks);
       
    }
}

class TestMain {
    public static void main(String args[]) {
        Student s1 = new Student("shubham ", 80);
        Student s2 = new Student("rahul",  70);
        Student s3 = new Student("Anuj",  60);

        System.out.println("Student 1:");
        s.display();

        System.out.println("\nStudent 2:");
        s2.display();

       
}
