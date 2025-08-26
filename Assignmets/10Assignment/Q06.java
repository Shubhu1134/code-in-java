// Question6_Constructor.java
// What is Constructor? List down the key points about constructor.

/*
CONSTRUCTOR IN JAVA:

DEFINITION:
A constructor is a special method that is automatically called when an object of a class is created.
It is used to initialize the object's state and allocate memory for the object.

KEY POINTS ABOUT CONSTRUCTOR:

1. NAME: Constructor name must be exactly the same as the class name
2. NO RETURN TYPE: Constructor has no return type, not even void
3. AUTOMATIC INVOCATION: Called automatically when object is created using 'new' keyword
4. INITIALIZATION: Primary purpose is to initialize object's instance variables
5. OVERLOADING: Constructors can be overloaded (multiple constructors with different parameters)
6. DEFAULT CONSTRUCTOR: If no constructor is defined, Java provides a default no-argument constructor
7. ACCESS MODIFIERS: Can have public, private, protected, or default access modifiers
8. INHERITANCE: Constructors are not inherited by subclasses
9. CHAINING: Constructors can call other constructors using this() or super()
10. NO STATIC: Constructors cannot be static, final, synchronized, or abstract
11. FIRST STATEMENT: Constructor calls (this() or super()) must be the first statement
12. MEMORY ALLOCATION: Constructor is called after memory allocation for the object
*/

// Demonstrating various types of constructors
class Student {
    private String name;
    private int age;
    private String course;
    private double gpa;
    private static int totalStudents = 0; // Static variable to count students
    
    // 1. DEFAULT/NO-ARGUMENT CONSTRUCTOR
    public Student() {
        System.out.println("Default constructor called");
        this.name = "Unknown";
        this.age = 18;
        this.course = "Undeclared";
        this.gpa = 0.0;
        totalStudents++;
        System.out.println("Student created with default values");
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR (with all parameters)
    public Student(String name, int age, String course, double gpa) {
        System.out.println("Parameterized constructor (all params) called");
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
        totalStudents++;
        System.out.println("Student created: " + name);
    }
    
    // 3. PARAMETERIZED CONSTRUCTOR (with partial parameters)
    public Student(String name, int age) {
        System.out.println("Parameterized constructor (partial params) called");
        this.name = name;
        this.age = age;
        this.course = "Undeclared";
        this.gpa = 0.0;
        totalStudents++;
        System.out.println("Student created with name and age only: " + name);
    }
    
    // 4. CONSTRUCTOR CHAINING using this()
    public Student(String name) {
        this(name, 18); // Calls constructor with name and age parameters
        System.out.println("Constructor with name only called, chained to name+age constructor");
    }
    
    // 5. COPY CONSTRUCTOR (not built-in in Java, but we can create one)
    public Student(Student other) {
        System.out.println("Copy constructor called");
        this.name = other.name + " (Copy)";
        this.age = other.age;
        this.course = other.course;
        this.gpa = other.gpa;
        totalStudents++;
        System.out.println("Copy of student created: " + this.name);
    }
    
    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getGpa() { return gpa; }
    public static int getTotalStudents() { return totalStudents; }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Info: Name=" + name + ", Age=" + age + 
                          ", Course=" + course + ", GPA=" + gpa);
    }
}

// Class demonstrating constructor inheritance and super()
class UndergraduateStudent extends Student {
    private int year; // 1st, 2nd, 3rd, 4th year
    
    // Constructor with super() call
    public UndergraduateStudent() {
        super(); // Calls parent's default constructor
        this.year = 1;
        System.out.println("UndergraduateStudent default constructor called");
    }
    
    public UndergraduateStudent(String name, int age, String course, double gpa, int year) {
        super(name, age, course, gpa); // Calls parent's parameterized constructor
        this.year = year;
        System.out.println("UndergraduateStudent parameterized constructor called");
    }
    
    public UndergraduateStudent(String name, int year) {
        super(name); // Calls parent constructor with name only
        this.year = year;
        System.out.println("UndergraduateStudent constructor with name and year called");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
    
    public int getYear() { return year; }
}

// Class demonstrating private constructor
class SingletonExample {
    private static SingletonExample instance;
    private String data;
    
    // PRIVATE CONSTRUCTOR - prevents direct instantiation
    private SingletonExample() {
        System.out.println("Private constructor called for Singleton");
        this.data = "Singleton Data";
    }
    
    // Static method to get the single instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
}

// Class demonstrating constructor with validation
class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    
    // Constructor with validation logic
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        System.out.println("BankAccount constructor called");
        
        // Validation in constructor
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        
        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be null or empty");
        }
        
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        
        System.out.println("Bank account created successfully for: " + accountHolderName);
    }
    
    public void displayAccount() {
        System.out.println("Account: " + accountNumber + ", Holder: " + 
                          accountHolderName + ", Balance: $" + balance);
    }
}

// Main class to demonstrate all constructor concepts
public class Question6_Constructor {
    
    private static void demonstrateBasicConstructors() {
        System.out.println("=== BASIC CONSTRUCTOR DEMONSTRATION ===\n");
        
        // 1. Default constructor
        System.out.println("1. Creating student with default constructor:");
        Student student1 = new Student();
        student1.displayInfo();
        System.out.println();
        
        // 2. Parameterized constructor (all parameters)
        System.out.println("2. Creating student with all parameters:");
        Student student2 = new Student("Alice Johnson", 20, "Computer Science", 3.8);
        student2.displayInfo();
        System.out.println();
        
        // 3. Parameterized constructor (partial parameters)
        System.out.println("3. Creating student with partial parameters:");
        Student student3 = new Student("Bob Smith", 19);
        student3.displayInfo();
        System.out.println();
        
        // 4. Constructor chaining
        System.out.println("4. Creating student with constructor chaining:");
        Student student4 = new Student("Carol Davis");
        student4.displayInfo();
        System.out.println();
        
        // 5. Copy constructor
        System.out.println("5. Creating student using copy constructor:");
        Student student5 = new Student(student2);
        student5.displayInfo();
        System.out.println();
        
        System.out.println("Total students created: " + Student.getTotalStudents());
    }
    
    private static void demonstrateInheritanceConstructors() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== INHERITANCE AND CONSTRUCTOR DEMONSTRATION ===\n");
        
        System.out.println("1. Creating undergraduate student with default constructor:");
        UndergraduateStudent ugStudent1 = new UndergraduateStudent();
        ugStudent1.displayInfo();
        System.out.println();
        
        System.out.println("2. Creating undergraduate student with all parameters:");
        UndergraduateStudent ugStudent2 = new UndergraduateStudent(
            "David Wilson", 21, "Engineering", 3.5, 3);
        ugStudent2.displayInfo();
        System.out.println();
        
        System.out.println("3. Creating undergraduate student with name and year:");
        UndergraduateStudent ugStudent3 = new UndergraduateStudent("Emma Brown", 2);
        ugStudent3.displayInfo();
        System.out.println();
        
        System.out.println("Total students (including undergraduates): " + Student.getTotalStudents());
    }
    
    private static void demonstratePrivateConstructor() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== PRIVATE CONSTRUCTOR (SINGLETON) DEMONSTRATION ===\n");
        
        // Cannot create instance directly due to private constructor
        // SingletonExample obj = new SingletonExample(); // This would cause compilation error
        
        System.out.println("Getting singleton instances:");
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        
        System.out.println("Singleton 1 data: " + singleton1.getData());
        System.out.println("Singleton 2 data: " + singleton2.getData());
        System.out.println("Are both instances same? " + (singleton1 == singleton2));
        
        singleton1.setData("Modified Data");
        System.out.println("After modifying singleton1:");
        System.out.println("Singleton 2 data: " + singleton2.getData());
    }
    
    private static void demonstrateConstructorValidation() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== CONSTRUCTOR VALIDATION DEMONSTRATION ===\n");
        
        System.out.println("1. Creating valid bank account:");
        try {
            BankAccount account1 = new BankAccount("ACC123456", "John Smith", 1000.0);
            account1.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        
        System.out.println("2. Attempting to create account with invalid data:");
        try {
            BankAccount account2 = new BankAccount("", "Jane Doe", 500.0);
            account2.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
        
        try {
            BankAccount account3 = new BankAccount("ACC789012", "", 500.0);
            account3.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
        
        try {
            BankAccount account4 = new BankAccount("ACC345678", "Bob Wilson", -100.0);
            account4.displayAccount();
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
    
    private static void demonstrateConstructorExecution() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== CONSTRUCTOR EXECUTION ORDER DEMONSTRATION ===\n");
        
        System.out.println("Creating undergraduate student to show execution order:");
        System.out.println("(Watch the order of constructor calls)\n");
        
        UndergraduateStudent ugStudent = new UndergraduateStudent(
            "Test Student", 20, "Math", 3.0, 2);
        
        System.out.println("\nExecution completed.");
        ugStudent.displayInfo();
    }
    
    public static void main(String[] args) {
        System.out.println("CONSTRUCTOR IN JAVA - COMPREHENSIVE DEMONSTRATION");
        System.out.println("=".repeat(70) + "\n");
        
        // Demonstrate basic constructors
        demonstrateBasicConstructors();
        
        // Demonstrate inheritance and constructors
        demonstrateInheritanceConstructors();
        
        // Demonstrate private constructor
        demonstratePrivateConstructor();
        
        // Demonstrate constructor validation
        demonstrateConstructorValidation();
        
        // Demonstrate constructor execution order
        demonstrateConstructorExecution();
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("KEY POINTS ABOUT CONSTRUCTORS:");
        System.out.println("=".repeat(70));
        
        String[] keyPoints = {
            "1. NAME: Must be same as class name",
            "2. NO RETURN TYPE: Not even void",
            "3. AUTOMATIC CALL: Invoked when object is created",
            "4. INITIALIZATION: Used to initialize object state",
            "5. OVERLOADING: Multiple constructors with different parameters",
            "6. DEFAULT CONSTRUCTOR: Provided by Java if none defined",
            "7. ACCESS MODIFIERS: Can be public, private, protected, default",
            "8. NO INHERITANCE: Constructors are not inherited",
            "9. CHAINING: Can call other constructors using this()/super()",
            "10. NOT STATIC: Cannot be static, final, synchronized, abstract",
            "11. FIRST STATEMENT: this()/super() calls must be first",
            "12. MEMORY: Called after memory allocation",
            "13. VALIDATION: Can include validation logic",
            "14. SINGLETON: Private constructors prevent instantiation",
            "15. EXECUTION ORDER: Parent constructor called before child"
        };
        
        for (String point : keyPoints) {
            System.out.println(point);
        }
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("CONSTRUCTOR TYPES DEMONSTRATED:");
        System.out.println("✓ Default/No-argument Constructor");
        System.out.println("✓ Parameterized Constructor");
        System.out.println("✓ Constructor Overloading");
        System.out.println("✓ Constructor Chaining (this)");
        System.out.println("✓ Constructor Inheritance (super)");
        System.out.println("✓ Copy Constructor");
        System.out.println("✓ Private Constructor");
        System.out.println("✓ Constructor with Validation");
    }
}