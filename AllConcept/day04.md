# 30 Days Java Mastery - Day 4: Object-Oriented Programming Basics

## 🎯 Today's Learning Goals

- Understand Object-Oriented Programming (OOP) concepts
- Learn Classes and Objects fundamentals
- Master Constructors and method types
- Explore the `this` keyword and method chaining
- Understand access modifiers and encapsulation
- Practice creating real-world class designs

---

## 1. Object-Oriented Programming Overview

### What is OOP?

Object-Oriented Programming is a programming paradigm based on the concept of **"objects"** that contain data (attributes) and code (methods). Java is a pure object-oriented language.

### Four Pillars of OOP

```java
/*
1. ENCAPSULATION - Bundling data and methods together, hiding internal details
2. INHERITANCE - Creating new classes based on existing classes
3. POLYMORPHISM - One interface, multiple implementations
4. ABSTRACTION - Hiding complex implementation details, showing only essentials
*/
```

### Real-World Analogy

```java
// Think of a Car as a class
// Individual cars (Toyota Camry, Honda Civic) are objects
// All cars have:
// - Attributes: color, model, year, speed
// - Methods: start(), stop(), accelerate(), brake()
```

---

## 2. Classes and Objects Fundamentals

### Class Definition Structure

```java
public class Car {
    // 1. Class Variables/Fields (Attributes)
    private String brand;
    private String model;
    private int year;
    private String color;
    private double speed;

    // 2. Constructors
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0.0;
    }

    // 3. Methods (Behavior)
    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }

    public void accelerate(double increment) {
        speed += increment;
        System.out.println("Speed increased to " + speed + " mph");
    }

    // 4. Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 5. Display method
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Current Speed: " + speed + " mph");
        System.out.println("---");
    }
}
```

### Creating and Using Objects

```java
public class CarDemo {
    public static void main(String[] args) {
        // Creating objects (instances) of Car class
        Car car1 = new Car("Toyota", "Camry", 2023, "Blue");
        Car car2 = new Car("Honda", "Civic", 2022, "Red");
        Car car3 = new Car("Ford", "Mustang", 2024, "Black");

        // Using object methods
        car1.displayInfo();
        car1.start();
        car1.accelerate(30.0);
        car1.accelerate(20.0);

        System.out.println("\n" + "=".repeat(30) + "\n");

        car2.displayInfo();
        car2.start();
        car2.accelerate(45.0);

        // Accessing object through getter methods
        System.out.println("\nCar 3 brand: " + car3.getBrand());
        System.out.println("Car 3 model: " + car3.getModel());

        // Multiple objects of same class
        Car[] garage = {car1, car2, car3};

        System.out.println("\nGarage Contents:");
        for (Car car : garage) {
            System.out.println("- " + car.getBrand() + " " + car.getModel());
        }
    }
}
```

---

## 3. Constructors Deep Dive

### Types of Constructors

```java
public class Student {
    // Instance variables
    private String name;
    private int id;
    private int age;
    private String course;
    private double gpa;

    // 1. Default Constructor (No parameters)
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.age = 18;
        this.course = "Undeclared";
        this.gpa = 0.0;
        System.out.println("Default constructor called");
    }

    // 2. Parameterized Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.age = 18; // Default values
        this.course = "Undeclared";
        this.gpa = 0.0;
        System.out.println("Constructor with name and id called");
    }

    // 3. Another Parameterized Constructor (Constructor Overloading)
    public Student(String name, int id, int age, String course) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
        this.gpa = 0.0;
        System.out.println("Constructor with name, id, age, and course called");
    }

    // 4. Full Parameterized Constructor
    public Student(String name, int id, int age, String course, double gpa) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
        setGpa(gpa); // Using setter for validation
        System.out.println("Full parameterized constructor called");
    }

    // 5. Copy Constructor (creating object from another object)
    public Student(Student other) {
        this.name = other.name;
        this.id = other.id;
        this.age = other.age;
        this.course = other.course;
        this.gpa = other.gpa;
        System.out.println("Copy constructor called");
    }

    // Getter and Setter methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    // Display method
    public void displayStudent() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
        System.out.println("---");
    }
}
```

### Constructor Chaining

```java
public class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;
    private String position;

    // Default constructor
    public Employee() {
        this("Unknown", 0); // Calls constructor with name and id
    }

    // Constructor with name and id
    public Employee(String name, int id) {
        this(name, id, "General"); // Calls constructor with name, id, and department
    }

    // Constructor with name, id, and department
    public Employee(String name, int id, String department) {
        this(name, id, department, 30000.0); // Calls constructor with name, id, department, and salary
    }

    // Constructor with name, id, department, and salary
    public Employee(String name, int id, String department, double salary) {
        this(name, id, department, salary, "Junior"); // Calls full constructor
    }

    // Full constructor (all parameters)
    public Employee(String name, int id, String department, double salary, String position) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.position = position;
        System.out.println("Employee " + name + " created successfully");
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + " (ID: " + id + ")");
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("---");
    }
}
```

---

## 4. The `this` Keyword

### Understanding `this`

```java
public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        // 'this' refers to the current object
        this.name = name;   // this.name (instance variable) = name (parameter)
        this.age = age;     // this.age (instance variable) = age (parameter)
        this.email = email; // this.email (instance variable) = email (parameter)
    }

    // Using 'this' to call another constructor
    public Person(String name, int age) {
        this(name, age, "unknown@email.com"); // Calls the main constructor
    }

    // Using 'this' to call current object's method
    public void introduce() {
        System.out.println("Hi, I'm " + this.name);
        this.displayDetails(); // Calls displayDetails() method of current object
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
    }

    // Method chaining using 'this'
    public Person setName(String name) {
        this.name = name;
        return this; // Returns current object for chaining
    }

    public Person setAge(int age) {
        this.age = age;
        return this; // Returns current object for chaining
    }

    public Person setEmail(String email) {
        this.email = email;
        return this; // Returns current object for chaining
    }

    // Compare current object with another object
    public boolean isSameAge(Person other) {
        return this.age == other.age; // 'this' refers to current object
    }

    public void greet(Person other) {
        System.out.println("Hello " + other.name + ", I'm " + this.name);
    }
}
```

### Method Chaining Demo

```java
public class PersonDemo {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("Alice", 25, "alice@email.com");
        Person person2 = new Person("Bob", 30);

        person1.introduce();
        System.out.println();
        person2.introduce();

        // Method chaining example
        Person person3 = new Person("", 0, "");
        person3.setName("Charlie")
               .setAge(28)
               .setEmail("charlie@email.com");

        System.out.println("\nAfter method chaining:");
        person3.displayDetails();

        // Using 'this' in comparisons
        System.out.println("\nAge comparison:");
        System.out.println("Alice and Bob same age? " + person1.isSameAge(person2));

        // Greeting between objects
        person1.greet(person2);
        person2.greet(person1);
    }
}
```

---

## 5. Access Modifiers and Encapsulation

### Access Modifiers Overview

```java
public class AccessModifiersDemo {
    // public - accessible from anywhere
    public String publicField = "I'm public";

    // private - accessible only within the same class
    private String privateField = "I'm private";

    // protected - accessible within package and subclasses
    protected String protectedField = "I'm protected";

    // package-private (default) - accessible within the same package
    String packageField = "I'm package-private";

    // Public method - accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method called");
        // Can access all fields from within the same class
        System.out.println(publicField);
        System.out.println(privateField);
        System.out.println(protectedField);
        System.out.println(packageField);
    }

    // Private method - accessible only within this class
    private void privateMethod() {
        System.out.println("Private method called");
    }

    // Protected method - accessible within package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected method called");
        privateMethod(); // Can call private method from within same class
    }

    // Package-private method
    void packageMethod() {
        System.out.println("Package method called");
    }
}
```

### Encapsulation Example

```java
public class BankAccount {
    // Private fields (encapsulated data)
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String pin;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, String pin) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = 0.0;
    }

    // Public methods to access private data (controlled access)

    // Getter methods (read-only access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Controlled setter methods with validation
    public boolean changePin(String oldPin, String newPin) {
        if (authenticate(oldPin)) {
            if (newPin.length() >= 4) {
                this.pin = newPin;
                System.out.println("PIN changed successfully");
                return true;
            } else {
                System.out.println("PIN must be at least 4 characters");
                return false;
            }
        } else {
            System.out.println("Invalid PIN");
            return false;
        }
    }

    // Business methods with validation
    public boolean deposit(double amount, String pin) {
        if (!authenticate(pin)) {
            System.out.println("Invalid PIN");
            return false;
        }

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
            System.out.println("New balance: $" + balance);
            return true;
        } else {
            System.out.println("Deposit amount must be positive");
            return false;
        }
    }

    public boolean withdraw(double amount, String pin) {
        if (!authenticate(pin)) {
            System.out.println("Invalid PIN");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        }

        balance -= amount;
        System.out.println("Withdrawn $" + amount);
        System.out.println("New balance: $" + balance);
        return true;
    }

    public boolean transfer(BankAccount targetAccount, double amount, String pin) {
        if (this.withdraw(amount, pin)) {
            // For simplicity, assuming target account accepts deposits without PIN
            targetAccount.balance += amount;
            System.out.println("Transferred $" + amount + " to account " + targetAccount.accountNumber);
            return true;
        }
        return false;
    }

    // Private helper method (internal implementation detail)
    private boolean authenticate(String inputPin) {
        return this.pin.equals(inputPin);
    }

    // Public method to display account info (without sensitive data)
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("---");
    }
}
```

---

## 6. Static Members and Instance Members

### Understanding Static vs Instance

```java
public class Counter {
    // Static variable - belongs to class, shared by all instances
    private static int totalObjects = 0;

    // Instance variable - belongs to individual object
    private int instanceCount;
    private String name;

    // Static block - executed when class is first loaded
    static {
        System.out.println("Counter class loaded");
        totalObjects = 0;
    }

    // Constructor
    public Counter(String name) {
        this.name = name;
        totalObjects++; // Increment static variable
        instanceCount = 0; // Initialize instance variable
        System.out.println("Counter '" + name + "' created. Total objects: " + totalObjects);
    }

    // Instance method - operates on specific object
    public void increment() {
        instanceCount++;
        System.out.println(name + " count: " + instanceCount);
    }

    // Static method - belongs to class, can be called without creating object
    public static int getTotalObjects() {
        return totalObjects;
        // Note: Cannot access instance variables from static method
        // System.out.println(name); // This would cause compilation error
    }

    // Static method to reset all counters
    public static void resetTotalCount() {
        totalObjects = 0;
        System.out.println("Total count reset to 0");
    }

    // Instance method accessing both static and instance variables
    public void displayInfo() {
        System.out.println("Counter: " + name);
        System.out.println("Instance count: " + instanceCount);
        System.out.println("Total objects: " + totalObjects);
        System.out.println("---");
    }

    // Static method with utility function
    public static void printClassInfo() {
        System.out.println("Counter Class Information:");
        System.out.println("Total Counter objects created: " + totalObjects);
        System.out.println("Class: " + Counter.class.getSimpleName());
    }
}
```

### Static Example - Math Utility Class

```java
public class MathUtils {
    // Static final variable (constant)
    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    // Private constructor to prevent instantiation
    private MathUtils() {
        // Utility class should not be instantiated
    }

    // Static methods - can be called without creating object
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static int factorial(int n) {
        if (n < 0) return -1; // Invalid input
        if (n == 0 || n == 1) return 1;

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static double power(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent < 0) return 1 / power(base, -exponent);

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
```

---

## 7. Real-World Class Design Examples

### Library Management System

```java
public class Book {
    // Private fields
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private boolean isAvailable;
    private String borrowerName;

    // Constructor
    public Book(String isbn, String title, String author, int publicationYear, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.isAvailable = true;
        this.borrowerName = null;
    }

    // Getter methods
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }
    public String getBorrowerName() { return borrowerName; }

    // Business methods
    public boolean borrowBook(String borrowerName) {
        if (!isAvailable) {
            System.out.println("Book is already borrowed by " + this.borrowerName);
            return false;
        }

        this.isAvailable = false;
        this.borrowerName = borrowerName;
        System.out.println("Book '" + title + "' borrowed by " + borrowerName);
        return true;
    }

    public boolean returnBook() {
        if (isAvailable) {
            System.out.println("Book is not currently borrowed");
            return false;
        }

        String previousBorrower = this.borrowerName;
        this.isAvailable = true;
        this.borrowerName = null;
        System.out.println("Book '" + title + "' returned by " + previousBorrower);
        return true;
    }

    public void displayBookInfo() {
        System.out.println("Book Information:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed by " + borrowerName));
        System.out.println("---");
    }
}

public class Library {
    private String libraryName;
    private Book[] books;
    private int bookCount;
    private int maxBooks;

    public Library(String libraryName, int maxBooks) {
        this.libraryName = libraryName;
        this.maxBooks = maxBooks;
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount >= maxBooks) {
            System.out.println("Library is full. Cannot add more books.");
            return false;
        }

        // Check for duplicate ISBN
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(book.getIsbn())) {
                System.out.println("Book with ISBN " + book.getIsbn() + " already exists");
                return false;
            }
        }

        books[bookCount] = book;
        bookCount++;
        System.out.println("Book '" + book.getTitle() + "' added to " + libraryName);
        return true;
    }

    public Book findBookByISBN(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void displayAllBooks() {
        System.out.println(libraryName + " - All Books:");
        if (bookCount == 0) {
            System.out.println("No books in library");
            return;
        }

        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i].getTitle() + " by " +
                              books[i].getAuthor() + " [" +
                              (books[i].isAvailable() ? "Available" : "Borrowed") + "]");
        }
        System.out.println("---");
    }

    public void displayAvailableBooks() {
        System.out.println(libraryName + " - Available Books:");
        boolean hasAvailable = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println("- " + books[i].getTitle() + " by " + books[i].getAuthor());
                hasAvailable = true;
            }
        }

        if (!hasAvailable) {
            System.out.println("No books available");
        }
        System.out.println("---");
    }
}
```

---

## 8. Practice Exercises for Day 4

### Exercise 1: Rectangle Class

```java
public class Rectangle {
    // TODO: Create a Rectangle class with:
    // - Private fields: length, width
    // - Multiple constructors (default, with parameters)
    // - Getter and setter methods with validation
    // - Methods: calculateArea(), calculatePerimeter(), isSquare()
    // - Method to compare with another rectangle
    // - Display method

    public static void main(String[] args) {
        // Test your Rectangle class
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(4.0, 4.0);

        // Test all methods
    }
}
```

### Exercise 2: Student Management System

```java
public class StudentManager {
    // TODO: Create classes:
    // 1. Student class with fields: name, id, grades[], gpa
    // 2. Course class with fields: courseCode, courseName, credits
    // 3. StudentManager class to manage multiple students

    // Features to implement:
    // - Add/remove students
    // - Calculate GPA
    // - Find student by ID
    // - Display all students
    // - Search students by name

    public static void main(String[] args) {
        // Test your student management system
    }
}
```

### Exercise 3: Bank Account System

```java
public class BankingSystem {
    // TODO: Enhance the BankAccount class:
    // - Add transaction history
    // - Different account types (Savings, Checking)
    // - Interest calculation for savings
    // - Monthly fees for checking
    // - Account statements

    public static void main(String[] args) {
        // Create different types of accounts
        // Perform various transactions
        // Generate account statements
    }
}
```

---

## 9. Key Takeaways from Day 4

### ✅ What You Learned Today:

1. **Classes and Objects**: Blueprint vs instances, attributes and methods
2. **Constructors**: Default, parameterized, overloaded, chaining
3. **`this` Keyword**: Object reference, constructor chaining, method chaining
4. **Encapsulation**: Access modifiers, data hiding, controlled access
5. **Static vs Instance**: Class-level vs object-level members
6. **Real-world Design**: Practical class design principles

### 🚀 Tomorrow's Preview (Day 5): Advanced OOP - Inheritance

- Inheritance concepts and syntax
- Method overriding vs overloading
- Super keyword and constructor chaining
- Types of inheritance in Java
- Abstract classes and methods

### 📝 Homework:

1. Complete all three practice exercises
2. Create a `Circle` class with methods for area, circumference, and comparison
3. Design a `Product` class for an e-commerce system
4. Implement a `Time` class with hours, minutes, seconds and time operations

### 💡 Pro Tips:

- **Encapsulation**: Always make fields private and provide public methods for access
- **Constructor Design**: Provide multiple constructors for flexibility
- **Method Chaining**: Return `this` from setters for fluent API design
- **Static Usage**: Use static for utility methods and constants
- **Validation**: Always validate input in setter methods
- **Naming**: Use descriptive names for classes, methods, and variables

---

## Quick Reference Card

```java
// Class Definition Template
public class ClassName {
    // Fields
    private dataType fieldName;

    // Constructors
    public ClassName() { }
    public ClassName(parameters) { }

    // Methods
    public returnType methodName(parameters) {
        return value; // if not void
    }

    // Getters and Setters
    public dataType getFieldName() { return fieldName; }
    public void setFieldName(dataType fieldName) { this.fieldName = fieldName; }
}

// Object Creation and Usage
ClassName object = new ClassName(parameters);
object.methodName();
dataType value = object.getFieldName();

// Access Modifiers
public    // Accessible everywhere
private   // Accessible within same class only
protected // Accessible within package and subclasses
// default (no modifier) - accessible within package
```

Fantastic progress! You've mastered the fundamentals of Object-Oriented Programming. Day 4 is crucial because OOP is the foundation of Java development. Keep practicing with the exercises! 🚀Perfect 👍 Let’s go to **Concept 4: Operators in Java**.
I’ll again keep the structure: **Why, What, How, Connections, Interview Qs, Tricks**.

---

## 🔹 Why do we need Operators?

When we work with data in a program, we must **perform actions** on it:

- Add numbers (10 + 20)
- Compare values (a > b)
- Make decisions (if condition is true)
- Assign values (x = 5)
  Without operators, Java would just be a storage system, not a computing language.

---

## 🔹 What are Operators?

Operators are **symbols** that tell the compiler to perform a specific operation on one, two, or three operands (variables/values).

---

## 🔹 Types of Operators in Java

### 1. **Arithmetic Operators**

- `+`, `-`, `*`, `/`, `%`
  👉 Used for mathematical calculations.
  📌 Example:

```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a % b); // 1 (remainder)
```

---

### 2. **Relational (Comparison) Operators**

- `==`, `!=`, `>`, `<`, `>=`, `<=`
  👉 Compare values, always return `true` or `false`.
  📌 Example:

```java
System.out.println(10 > 5); // true
System.out.println(10 == 5); // false
```

---

### 3. **Logical Operators**

- `&&` (AND), `||` (OR), `!` (NOT)
  👉 Used in conditions.
  📌 Example:

```java
int age = 20;
System.out.println(age > 18 && age < 30); // true
```

---

### 4. **Assignment Operators**

- `=`, `+=`, `-=`, `*=`, `/=`, `%=`
  👉 Assign and update values.
  📌 Example:

```java
int x = 10;
x += 5; // x = x + 5 → 15
```

---

### 5. **Unary Operators**

- `+`, `-` (signs), `++` (increment), `--` (decrement), `!` (logical NOT)
  📌 Example:

```java
int n = 5;
System.out.println(++n); // 6 (pre-increment)
System.out.println(n--); // 6 then 5
```

---

### 6. **Ternary Operator**

- `?:` → condition ? value_if_true : value_if_false
  📌 Example:

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result); // Adult
```

---

### 7. **Bitwise Operators**

- `&` (AND), `|` (OR), `^` (XOR), `~` (NOT), `<<` (left shift), `>>` (right shift)
  👉 Work on binary representation.
  📌 Example:

```java
int a = 5;  // 0101
int b = 3;  // 0011
System.out.println(a & b); // 1 (0001)
System.out.println(a | b); // 7 (0111)
```

---

### 8. **Instanceof Operator**

👉 Tests whether an object is an instance of a class.
📌 Example:

```java
String s = "Hello";
System.out.println(s instanceof String); // true
```

---

### 9. **Type Cast Operator**

👉 Converts one type to another.
📌 Example:

```java
double d = 9.8;
int i = (int) d; // explicit cast
System.out.println(i); // 9
```

---

## 🔹 How they connect

- Arithmetic + Assignment = Compound operators (`+=`, `-=`).
- Relational + Logical = Decision making (`if`, `while`).
- Unary + Looping = Shorter code (`i++` instead of `i = i+1`).
- Bitwise + Performance = Faster operations in low-level tasks (e.g. masks).

---

## 🔹 Common Interview Questions (Basic → Tricky)

1. Difference between `==` and `.equals()` in Java?
   👉 `==` compares references (memory), `.equals()` compares content.

2. What’s the difference between `&` and `&&`?
   👉 `&` checks both sides always, `&&` stops if left side is false (**short-circuiting**).

3. What happens when you divide an integer by 0?
   👉 `ArithmeticException`.

4. What happens when you divide a double by 0?
   👉 `Infinity` or `NaN`.

5. Pre-increment vs Post-increment difference in loops?
   👉 Pre-increment updates before use, post-increment updates after use.

6. Can `instanceof` work with `null`?
   👉 No, always returns false.

---

## 🔹 Trick / Mind Map

👉 Think of **Operators as tools in a toolbox**:

- 🔢 Arithmetic → Calculator
- 🔍 Relational → Comparison (like scales)
- ⚡ Logical → Decision making (electric switch)
- 📝 Assignment → Note-taking
- ➕ Unary → Quick change
- ❓ Ternary → Short if-else
- ⚙️ Bitwise → Binary machine
- 🧾 Instanceof → Type checker
- 🎭 Casting → Changing shape

---
