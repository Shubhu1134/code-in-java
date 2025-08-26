// Question2_Class_Object_OOPFeatures.java
// What is class and object? Explain all OOP features in Java with example.

// ENCAPSULATION EXAMPLE
class Student {
    // Private data members (Encapsulation - data hiding)
    private String name;
    private int age;
    private String course;
    private double gpa;
    
    // Constructor
    public Student(String name, int age, String course, double gpa) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }
    
    // Getter methods (controlled access to private data)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getGpa() { return gpa; }
    
    // Setter methods (controlled modification of private data)
    public void setName(String name) { 
        if (name != null && !name.trim().isEmpty()) {
            this.name = name; 
        }
    }
    
    public void setAge(int age) { 
        if (age > 0 && age < 120) {
            this.age = age; 
        }
    }
    
    public void setCourse(String course) { this.course = course; }
    
    public void setGpa(double gpa) { 
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa; 
        }
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + 
                          ", Course: " + course + ", GPA: " + gpa);
    }
    
    // Method to check if student is eligible for honors
    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }
}

// INHERITANCE EXAMPLE
// GraduateStudent inherits from Student (IS-A relationship)
class GraduateStudent extends Student {
    private String researchArea;
    private String advisor;
    
    // Constructor calls parent constructor using super()
    public GraduateStudent(String name, int age, String course, double gpa, 
                          String researchArea, String advisor) {
        super(name, age, course, gpa); // Call parent constructor
        this.researchArea = researchArea;
        this.advisor = advisor;
    }
    
    // Additional getters and setters
    public String getResearchArea() { return researchArea; }
    public void setResearchArea(String researchArea) { this.researchArea = researchArea; }
    
    public String getAdvisor() { return advisor; }
    public void setAdvisor(String advisor) { this.advisor = advisor; }
    
    // METHOD OVERRIDING (Runtime Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Research Area: " + researchArea + ", Advisor: " + advisor);
    }
    
    // Additional method specific to GraduateStudent
    public void conductResearch() {
        System.out.println(getName() + " is conducting research in " + researchArea);
    }
}

// ABSTRACTION EXAMPLE
abstract class Shape {
    protected String color;
    protected String name;
    
    // Constructor
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }
    
    // Abstract method (must be implemented by subclasses)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // Concrete method (can be inherited as-is)
    public void displayColor() {
        System.out.println(name + " color: " + color);
    }
    
    // Getters
    public String getColor() { return color; }
    public String getName() { return name; }
}

// Concrete class implementing abstract methods
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color, "Circle");
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color, "Rectangle");
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
}

// POLYMORPHISM EXAMPLE
class Calculator {
    // METHOD OVERLOADING (Compile-time Polymorphism)
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    // Method to demonstrate runtime polymorphism
    public static void calculateShapeProperties(Shape shape) {
        shape.displayColor(); // Calls appropriate method
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}

// MAIN CLASS TO DEMONSTRATE ALL OOP FEATURES
public class Question2_Class_Object_OOPFeatures {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRATING OOP FEATURES IN JAVA ===\n");
        
        // 1. CLASS AND OBJECT DEMONSTRATION
        System.out.println("1. CLASS AND OBJECT:");
        System.out.println("Class: Blueprint/template for creating objects");
        System.out.println("Object: Instance of a class\n");
        
        // Creating objects (instances of classes)
        Student student1 = new Student("Alice Johnson", 20, "Computer Science", 3.8);
        Student student2 = new Student("Bob Smith", 19, "Mathematics", 3.2);
        
        System.out.println("Created Student objects:");
        student1.displayInfo();
        student2.displayInfo();
        System.out.println();
        
        // 2. ENCAPSULATION DEMONSTRATION
        System.out.println("2. ENCAPSULATION:");
        System.out.println("Data hiding and controlled access through getters/setters");
        
        // Accessing private data through public methods
        System.out.println("Student name: " + student1.getName());
        student1.setAge(21); // Controlled modification
        System.out.println("Updated age: " + student1.getAge());
        System.out.println("Is honor student: " + student1.isHonorStudent());
        System.out.println();
        
        // 3. INHERITANCE DEMONSTRATION
        System.out.println("3. INHERITANCE:");
        System.out.println("Creating new classes based on existing classes");
        
        GraduateStudent gradStudent = new GraduateStudent(
            "Carol Davis", 24, "Computer Science", 3.9, 
            "Machine Learning", "Dr. Wilson"
        );
        
        System.out.println("Graduate Student (inherits from Student):");
        gradStudent.displayInfo(); // Uses overridden method
        gradStudent.conductResearch();
        System.out.println();
        
        // 4. POLYMORPHISM DEMONSTRATION
        System.out.println("4. POLYMORPHISM:");
        
        // a) Method Overloading (Compile-time polymorphism)
        System.out.println("Method Overloading:");
        Calculator calc = new Calculator();
        System.out.println("Add two ints (5, 3): " + calc.add(5, 3));
        System.out.println("Add two doubles (5.5, 3.2): " + calc.add(5.5, 3.2));
        System.out.println("Add three ints (1, 2, 3): " + calc.add(1, 2, 3));
        System.out.println("Add two strings ('Hello', 'World'): " + calc.add("Hello", "World"));
        System.out.println();
        
        // b) Method Overriding (Runtime polymorphism)
        System.out.println("Method Overriding & Runtime Polymorphism:");
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0),
            new Circle("Green", 3.0)
        };
        
        for (Shape shape : shapes) {
            Calculator.calculateShapeProperties(shape);
        }
        
        // 5. ABSTRACTION DEMONSTRATION
        System.out.println("5. ABSTRACTION:");
        System.out.println("Hiding complex implementation details");
        System.out.println("Abstract Shape class defines interface,");
        System.out.println("Concrete classes (Circle, Rectangle) provide implementation");
        
        Circle circle = new Circle("Yellow", 7.0);
        System.out.println("Circle area calculation is abstracted from user");
        System.out.println("User just calls calculateArea(): " + circle.calculateArea());
    }
}