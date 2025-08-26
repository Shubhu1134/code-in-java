// Question7_Multiple_Constructors.java
// Can we make multiple constructors inside a class? If yes then what is the need of it? Explain.

/*
MULTIPLE CONSTRUCTORS IN A CLASS:

ANSWER: YES, we can have multiple constructors in a class. This is called CONSTRUCTOR OVERLOADING.

CONSTRUCTOR OVERLOADING RULES:
1. Multiple constructors must have different parameter lists (different number or types of parameters)
2. Constructors are differentiated by their parameter signatures
3. Return type is not considered (constructors don't have return types)
4. Access modifiers can be different for different constructors

NEED FOR MULTIPLE CONSTRUCTORS:

1. FLEXIBILITY: Allows creating objects in different ways based on available information
2. DEFAULT VALUES: Some constructors can provide default values for missing parameters
3. CONVENIENCE: Users can choose the most convenient way to create objects
4. DIFFERENT INITIALIZATION SCENARIOS: Different constructors for different use cases
5. OPTIONAL PARAMETERS: Simulate optional parameters (Java doesn't have native optional parameters)
6. VALIDATION: Different constructors can have different validation rules
7. BACKWARDS COMPATIBILITY: Add new constructors without breaking existing code
8. CODE REUSABILITY: Constructors can call other constructors using this()
*/

import java.time.LocalDate;
import java.time.Period;

// Example 1: Employee class with multiple constructors
class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private String email;
    private LocalDate joiningDate;
    private String phoneNumber;
    private String address;
    
    private static int nextEmployeeId = 1001; // Auto-increment ID
    
    // Constructor 1: Default constructor
    // Use case: Create employee object with minimal info, set details later
    public Employee() {
        System.out.println("Default constructor called");
        this.employeeId = nextEmployeeId++;
        this.name = "TBD"; // To Be Determined
        this.department = "Unassigned";
        this.salary = 0.0;
        this.email = "";
        this.joiningDate = LocalDate.now();
        this.phoneNumber = "";
        this.address = "";
        System.out.println("Employee created with ID: " + this.employeeId);
    }
    
    // Constructor 2: Constructor with basic information
    // Use case: Create employee with essential information
    public Employee(String name, String department) {
        System.out.println("Basic constructor (name + department) called");
        this.employeeId = nextEmployeeId++;
        this.name = name;
        this.department = department;
        this.salary = 30000.0; // Default starting salary
        this.email = generateEmail(name);
        this.joiningDate = LocalDate.now();
        this.phoneNumber = "";
        this.address = "";
        System.out.println("Employee " + name + " created in " + department);
    }
    
    // Constructor 3: Constructor with name, department, and salary
    // Use case: Create employee with salary information
    public Employee(String name, String department, double salary) {
        System.out.println("Constructor (name + department + salary) called");
        this.employeeId = nextEmployeeId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = generateEmail(name);
        this.joiningDate = LocalDate.now();
        this.phoneNumber = "";
        this.address = "";
        System.out.println("Employee " + name + " created with salary: $" + salary);
    }
    
    // Constructor 4: Complete information constructor
    // Use case: Create employee with all available information
    public Employee(String name, String department, double salary, String email, String phoneNumber) {
        System.out.println("Complete constructor called");
        this.employeeId = nextEmployeeId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.joiningDate = LocalDate.now();
        this.phoneNumber = phoneNumber;
        this.address = "";
        System.out.println("Employee " + name + " created with complete information");
    }
    
    // Constructor 5: Constructor with custom joining date
    // Use case: Create employee record for someone who joined on a specific date
    public Employee(String name, String department, double salary, LocalDate joiningDate) {
        System.out.println("Constructor with custom joining date called");
        this.employeeId = nextEmployeeId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = generateEmail(name);
        this.joiningDate = joiningDate;
        this.phoneNumber = "";
        this.address = "";
        System.out.println("Employee " + name + " created with joining date: " + joiningDate);
    }
    
    // Constructor 6: Constructor chaining example
    // Use case: Reuse other constructors to avoid code duplication
    public Employee(String name, String department, String phoneNumber) {
        this(name, department); // Call constructor 2
        this.phoneNumber = phoneNumber; // Add phone number
        System.out.println("Constructor with phone number called (chained)");
    }
    
    // Constructor 7: Copy constructor
    // Use case: Create a copy of existing employee (for transfer, promotion, etc.)
    public Employee(Employee other) {
        System.out.println("Copy constructor called");
        this.employeeId = nextEmployeeId++; // New ID for copy
        this.name = other.name + " (Copy)";
        this.department = other.department;
        this.salary = other.salary;
        this.email = generateEmail(this.name);
        this.joiningDate = LocalDate.now(); // New joining date
        this.phoneNumber = other.phoneNumber;
        this.address = other.address;
        System.out.println("Copy of employee created: " + this.name);
    }
    
    // Utility method to generate email
    private String generateEmail(String name) {
        return name.toLowerCase().replace(" ", ".") + "@company.com";
    }
    
    // Getter methods
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getEmail() { return email; }
    public LocalDate getJoiningDate() { return joiningDate; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    
    // Method to calculate experience
    public int getExperienceInYears() {
        return Period.between(joiningDate, LocalDate.now()).getYears();
    }
    
    // Method to display employee information
    public void displayEmployee() {
        System.out.println("=== EMPLOYEE DETAILS ===");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Email: " + email);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Phone: " + (phoneNumber.isEmpty() ? "Not provided" : phoneNumber));
        System.out.println("Address: " + (address.isEmpty() ? "Not provided" : address));
        System.out.println("Experience: " + getExperienceInYears() + " years");
        System.out.println("========================");
    }
}

// Example 2: Student class demonstrating different constructor needs
class Student {
    private String studentId;
    private String name;
    private int age;
    private String course;
    private double gpa;
    private String email;
    private String parentContact;
    private boolean isScholarship;
    
    private static int studentCounter = 1;
    
    // Constructor 1: Emergency registration (minimal info)
    public Student(String name) {
        System.out.println("Emergency registration constructor called");
        this.studentId = "STU" + String.format("%04d", studentCounter++);
        this.name = name;
        this.age = 18; // Default age
        this.course = "Undeclared";
        this.gpa = 0.0;
        this.email = "";
        this.parentContact = "";
        this.isScholarship = false;
        System.out.println("Student registered with minimal info: " + name);
    }
    
    // Constructor 2: Regular admission (name and age)
    public Student(String name, int age) {
        System.out.println("Regular admission constructor called");
        this.studentId = "STU" + String.format("%04d", studentCounter++);
        this.name = name;
        this.age = age;
        this.course = "Undeclared";
        this.gpa = 0.0;
        this.email = generateStudentEmail(name);
        this.parentContact = "";
        this.isScholarship = false;
        System.out.println("Student " + name + " registered for regular admission");
    }
    
    // Constructor 3: Transfer student (with previous GPA)
    public Student(String name, int age, String course, double gpa) {
        System.out.println("Transfer student constructor called");
        this.studentId = "STU" + String.format("%04d", studentCounter++);
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
        this.email = generateStudentEmail(name);
        this.parentContact = "";
        this.isScholarship = gpa >= 3.5; // Auto scholarship for high GPA
        System.out.println("Transfer student " + name + " registered in " + course);
    }
    
    // Constructor 4: Complete registration
    public Student(String name, int age, String course, String email, String parentContact) {
        System.out.println("Complete registration constructor called");
        this.studentId = "STU" + String.format("%04d", studentCounter++);
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = 0.0;
        this.email = email;
        this.parentContact = parentContact;
        this.isScholarship = false;
        System.out.println("Student " + name + " completely registered");
    }
    
    // Constructor 5: Scholarship student
    public Student(String name, int age, String course, double gpa, boolean isScholarship) {
        System.out.println("Scholarship student constructor called");
        this.studentId = "STU" + String.format("%04d", studentCounter++);
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
        this.email = generateStudentEmail(name);
        this.parentContact = "";
        this.isScholarship = isScholarship;
        System.out.println("Scholarship student " + name + " registered");
    }
    
    private String generateStudentEmail(String name) {
        return name.toLowerCase().replace(" ", ".") + "@university.edu";
    }
    
    public void displayStudent() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + 
                          ", Age: " + age + ", Course: " + course + 
                          ", GPA: " + gpa + ", Scholarship: " + isScholarship);
    }
    
    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getGpa() { return gpa; }
    public boolean isScholarship() { return isScholarship; }
}

// Example 3: Rectangle class showing constructor overloading with different parameter types
class Rectangle {
    private double length;
    private double width;
    private String color;
    private String unit;
    
    // Constructor 1: Square (same length and width)
    public Rectangle(double side) {
        System.out.println("Square constructor called");
        this.length = side;
        this.width = side;
        this.color = "White";
        this.unit = "units";
        System.out.println("Square created with side: " + side);
    }
    
    // Constructor 2: Rectangle with length and width
    public Rectangle(double length, double width) {
        System.out.println("Rectangle constructor (length, width) called");
        this.length = length;
        this.width = width;
        this.color = "White";
        this.unit = "units";
        System.out.println("Rectangle created: " + length + " x " + width);
    }
    
    // Constructor 3: Colored rectangle
    public Rectangle(double length, double width, String color) {
        System.out.println("Colored rectangle constructor called");
        this.length = length;
        this.width = width;
        this.color = color;
        this.unit = "units";
        System.out.println("Colored rectangle created: " + length + " x " + width + " (" + color + ")");
    }
    
    // Constructor 4: Rectangle with unit specification
    public Rectangle(double length, double width, String color, String unit) {
        System.out.println("Complete rectangle constructor called");
        this.length = length;
        this.width = width;
        this.color = color;
        this.unit = unit;
        System.out.println("Rectangle created: " + length + " x " + width + " " + unit + " (" + color + ")");
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public void displayRectangle() {
        System.out.println("Rectangle: " + length + " x " + width + " " + unit + 
                          ", Color: " + color + ", Area: " + getArea() + 
                          ", Perimeter: " + getPerimeter());
    }
}

public class Question7_Multiple_Constructors {
    
    private static void demonstrateEmployeeConstructors() {
        System.out.println("=== EMPLOYEE CLASS - MULTIPLE CONSTRUCTORS ===\n");
        
        // Different ways to create Employee objects
        
        System.out.println("1. Creating employee with default constructor:");
        Employee emp1 = new Employee();
        emp1.displayEmployee();
        System.out.println();
        
        System.out.println("2. Creating employee with basic info:");
        Employee emp2 = new Employee("John Smith", "IT");
        emp2.displayEmployee();
        System.out.println();
        
        System.out.println("3. Creating employee with salary info:");
        Employee emp3 = new Employee("Alice Johnson", "HR", 65000.0);
        emp3.displayEmployee();
        System.out.println();
        
        System.out.println("4. Creating employee with complete info:");
        Employee emp4 = new Employee("Bob Wilson", "Finance", 70000.0, 
                                   "bob.wilson@company.com", "123-456-7890");
        emp4.displayEmployee();
        System.out.println();
        
        System.out.println("5. Creating employee with custom joining date:");
        Employee emp5 = new Employee("Carol Davis", "Marketing", 55000.0, 
                                   LocalDate.of(2020, 6, 15));
        emp5.displayEmployee();
        System.out.println();
        
        System.out.println("6. Creating employee with constructor chaining:");
        Employee emp6 = new Employee("David Brown", "Engineering", "987-654-3210");
        emp6.displayEmployee();
        System.out.println();
        
        System.out.println("7. Creating copy of employee:");
        Employee emp7 = new Employee(emp3);
        emp7.displayEmployee();
        System.out.println();
    }
    
    private static void demonstrateStudentConstructors() {
        System.out.println("=== STUDENT CLASS - MULTIPLE CONSTRUCTORS ===\n");
        
        System.out.println("1. Emergency registration:");
        Student student1 = new Student("Emma Watson");
        student1.displayStudent();
        System.out.println();
        
        System.out.println("2. Regular admission:");
        Student student2 = new Student("Michael Johnson", 19);
        student2.displayStudent();
        System.out.println();
        
        System.out.println("3. Transfer student:");
        Student student3 = new Student("Sarah Davis", 21, "Computer Science", 3.7);
        student3.displayStudent();
        System.out.println();
        
        System.out.println("4. Complete registration:");
        Student student4 = new Student("Robert Brown", 18, "Mathematics", 
                                     "robert@email.com", "555-0123");
        student4.displayStudent();
        System.out.println();
        
        System.out.println("5. Scholarship student:");
        Student student5 = new Student("Lisa Wilson", 20, "Physics", 3.9, true);
        student5.displayStudent();
        System.out.println();
    }
    
    private static void demonstrateRectangleConstructors() {
        System.out.println("=== RECTANGLE CLASS - CONSTRUCTOR OVERLOADING ===\n");
        
        System.out.println("1. Creating a square:");
        Rectangle rect1 = new Rectangle(5.0);
        rect1.displayRectangle();
        System.out.println();
        
        System.out.println("2. Creating a rectangle:");
        Rectangle rect2 = new Rectangle(8.0, 6.0);
        rect2.displayRectangle();
        System.out.println();
        
        System.out.println("3. Creating a colored rectangle:");
        Rectangle rect3 = new Rectangle(10.0, 7.0, "Blue");
        rect3.displayRectangle();
        System.out.println();
        
        System.out.println("4. Creating rectangle with units:");
        Rectangle rect4 = new Rectangle(12.5, 8.5, "Red", "cm");
        rect4.displayRectangle();
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("MULTIPLE CONSTRUCTORS IN A CLASS");
        System.out.println("=".repeat(70) + "\n");
        
        // Demonstrate employee constructors
        demonstrateEmployeeConstructors();
        
        System.out.println("=".repeat(70) + "\n");
        
        // Demonstrate student constructors
        demonstrateStudentConstructors();
        
        System.out.println("=".repeat(70) + "\n");
        
        // Demonstrate rectangle constructors
        demonstrateRectangleConstructors();
        
        System.out.println("=".repeat(70));
        System.out.println("BENEFITS OF MULTIPLE CONSTRUCTORS:");
        System.out.println("=".repeat(70));
        
        String[] benefits = {
            "1. FLEXIBILITY: Create objects in different ways based on available data",
            "2. CONVENIENCE: Choose the most appropriate constructor for the situation",
            "3. DEFAULT VALUES: Some constructors provide default values for missing parameters",
            "4. DIFFERENT SCENARIOS: Handle various object creation scenarios",
            "5. OPTIONAL PARAMETERS: Simulate optional parameters in Java",
            "6. CODE REUSABILITY: Use constructor chaining with this()",
            "7. BACKWARDS COMPATIBILITY: Add new constructors without breaking existing code",
            "8. VALIDATION: Different constructors can have different validation rules",
            "9. PERFORMANCE: Choose lightweight constructors when full initialization isn't needed",
            "10. USER-FRIENDLY API: Provide easy-to-use constructors for different use cases"
        };
        
        for (String benefit : benefits) {
            System.out.println(benefit);
        }
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("CONSTRUCTOR OVERLOADING RULES:");
        System.out.println("=".repeat(70));
        System.out.println("✓ Different parameter lists (number or types of parameters)");
        System.out.println("✓ Parameter order matters for overloading");
        System.out.println("✓ Return type is not considered (constructors have no return type)");
        System.out.println("✓ Access modifiers can be different");
        System.out.println("✓ Can use constructor chaining with this()");
        System.out.println("✓ Cannot have two constructors with exactly same parameter signature");
    }
}