# 30 Days Java Mastery - Day 1: Java Fundamentals

## 🎯 Today's Learning Goals

- Understand what Java is and why it's popular
- Learn Java's key features and architecture
- Set up development environment
- Write your first Java program
- Understand basic syntax and structure

---

## 1. What is Java?

### Definition

Java is a **high-level, object-oriented, platform-independent** programming language developed by **Sun Microsystems** (now Oracle) in 1995.

### Key Philosophy: "Write Once, Run Anywhere" (WORA)

```
Java Source Code (.java)
    ↓ (javac compiler)
Java Bytecode (.class)
    ↓ (JVM)
Machine Code (Platform Specific)
```

---

## 2. Why Java is Popular?

### ✅ Platform Independence

- Code runs on any system with JVM
- No need to recompile for different operating systems

### ✅ Object-Oriented Programming (OOP)

- Encapsulation, Inheritance, Polymorphism, Abstraction
- Promotes code reusability and maintainability

### ✅ Strong Memory Management

- Automatic garbage collection
- No manual memory allocation/deallocation

### ✅ Rich Standard Library

- Extensive built-in classes and methods
- Collections, networking, I/O, GUI, etc.

### ✅ Enterprise-Ready

- Robust security features
- Multithreading support
- Exception handling

---

## 3. Java Architecture & Components

### JVM (Java Virtual Machine)

```
┌─────────────────────────────────┐
│           JVM                   │
│  ┌───────────────────────────┐  │
│  │    Class Loader           │  │
│  └───────────────────────────┘  │
│  ┌───────────────────────────┐  │
│  │    Memory Areas           │  │
│  │  • Heap                   │  │
│  │  • Method Area            │  │
│  │  • Stack                  │  │
│  └───────────────────────────┘  │
│  ┌───────────────────────────┐  │
│  │    Execution Engine       │  │
│  │  • Interpreter            │  │
│  │  • JIT Compiler           │  │
│  └───────────────────────────┘  │
└─────────────────────────────────┘
```

### JRE (Java Runtime Environment)

- JVM + Standard Libraries + Supporting files
- Required to **run** Java applications

### JDK (Java Development Kit)

- JRE + Development tools (compiler, debugger, etc.)
- Required to **develop** Java applications

---

## 4. Java Program Structure

### Basic Java Program

```java
// 1. Package declaration (optional)
package com.example;

// 2. Import statements (optional)
import java.util.Scanner;

// 3. Class declaration (mandatory)
public class HelloWorld {

    // 4. Main method (entry point)
    public static void main(String[] args) {
        // 5. Program logic
        System.out.println("Hello, World!");
    }
}
```

### Key Rules:

1. **Filename** must match **public class name**
2. Every Java program needs at least **one class**
3. **main()** method is the entry point
4. Java is **case-sensitive**
5. Statements end with **semicolon (;)**

---

## 5. Your First Java Program

### Step 1: Create HelloWorld.java

```java
public class HelloWorld {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Hello, Java World!");
        System.out.println("Welcome to Day 1 of Java Learning!");

        /*
         * This is a multi-line comment
         * Used for detailed explanations
         */
        System.out.print("Java is "); // print without newline
        System.out.println("awesome!"); // print with newline
    }
}
```

### Step 2: Compile and Run

```bash
# Compile Java source code
javac HelloWorld.java

# This creates HelloWorld.class file

# Run the program
java HelloWorld
```

### Expected Output:

```
Hello, Java World!
Welcome to Day 1 of Java Learning!
Java is awesome!
```

---

## 6. Java Syntax Fundamentals

### Comments

```java
// Single-line comment

/*
   Multi-line comment
   Can span multiple lines
*/

/**
 * Documentation comment (Javadoc)
 * Used to generate API documentation
 * @author Your Name
 * @version 1.0
 */
```

### Identifiers (Naming Rules)

```java
// Valid identifiers
int age;
String firstName;
double salary_2024;
boolean $isValid;
char _grade;

// Invalid identifiers
// int 2age;        // Cannot start with digit
// String first-name; // Hyphen not allowed
// boolean class;   // 'class' is a keyword
```

### Keywords (Reserved Words)

```java
// Some important Java keywords
abstract    boolean    break      byte       case
catch       char       class      const      continue
default     do         double     else       extends
final       finally    float      for        if
implements  import     instanceof int        interface
long        native     new        package    private
protected   public     return     short      static
super       switch     this       throw      throws
try         void       volatile   while
```

### Literals

```java
// Integer literals
int decimal = 42;
int hexadecimal = 0x2A;      // 42 in hex
int binary = 0b101010;       // 42 in binary
int octal = 052;             // 42 in octal

// Floating-point literals
double d1 = 3.14;
double d2 = 3.14159D;        // D suffix (optional for double)
float f1 = 3.14F;            // F suffix (mandatory for float)
double scientific = 1.23e-4; // Scientific notation

// Character literals
char letter = 'A';
char unicode = '\\u0041';     // 'A' in Unicode
char escape = '\\n';          // Newline character

// String literals
String message = "Hello World";
String multiline = "Line 1\\nLine 2\\nLine 3";

// Boolean literals
boolean isTrue = true;
boolean isFalse = false;
```

---

## 7. Variables and Data Types

### Primitive Data Types

```java
// Integer types
byte b = 127;           // 8-bit: -128 to 127
short s = 32767;        // 16-bit: -32,768 to 32,767
int i = 2147483647;     // 32-bit: -2^31 to 2^31-1
long l = 9223372036854775807L; // 64-bit: -2^63 to 2^63-1

// Floating-point types
float f = 3.14159F;     // 32-bit IEEE 754
double d = 3.14159;     // 64-bit IEEE 754

// Character type
char c = 'A';           // 16-bit Unicode

// Boolean type
boolean flag = true;    // true or false only
```

### Variable Declaration and Initialization

```java
// Declaration only
int age;
String name;

// Declaration with initialization
int age = 25;
String name = "John";

// Multiple declarations
int x, y, z;
int a = 1, b = 2, c = 3;

// Constants (final variables)
final double PI = 3.14159;
final String COMPANY_NAME = "TechCorp";
```

---

## 8. Basic Input/Output

### Output Methods

```java
public class OutputExample {
    public static void main(String[] args) {
        // println - prints with newline
        System.out.println("Hello World");
        System.out.println("Next line");

        // print - prints without newline
        System.out.print("Hello ");
        System.out.print("World");
        System.out.println(); // Just newline

        // printf - formatted output
        String name = "Alice";
        int age = 30;
        System.out.printf("Name: %s, Age: %d%n", name, age);
    }
}
```

### Input Methods

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your salary is $" + salary);

        scanner.close(); // Good practice to close scanner
    }
}
```

---

## 9. Practice Exercises for Day 1

### Exercise 1: Personal Info Program

```java
import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Get user's name, age, city, and favorite color
        // Print a formatted message using all information

        input.close();
    }
}
```

### Exercise 2: Variable Playground

```java
public class VariablePlayground {
    public static void main(String[] args) {
        // TODO: Declare variables of all primitive types
        // Initialize them with different values
        // Print each variable with its type and value

        // Example:
        // byte byteVar = 100;
        // System.out.println("Byte variable: " + byteVar);
    }
}
```

### Exercise 3: Simple Calculator

```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Get two numbers from user
        // Perform basic arithmetic operations (+, -, *, /)
        // Display results

        scanner.close();
    }
}
```

---

## 10. Key Takeaways from Day 1

### ✅ What You Learned Today:

1. **Java Overview**: Platform independence, OOP, WORA principle
2. **Java Architecture**: JVM, JRE, JDK relationships
3. **Program Structure**: Class, main method, basic syntax
4. **Data Types**: Primitives and their ranges
5. **Variables**: Declaration, initialization, naming rules
6. **Basic I/O**: Scanner for input, System.out for output

### 🚀 Tomorrow's Preview (Day 2): Operators and Control Structures

- Arithmetic, relational, logical operators
- Operator precedence and associativity
- If-else statements
- Switch statements
- Loops (for, while, do-while)

### 📝 Homework:

1. Complete all three practice exercises
2. Experiment with different data types and their limits
3. Create a simple program that calculates area of rectangle, circle, and triangle
4. Practice using Scanner for different input types

### 💡 Pro Tips:

- Always close Scanner objects to avoid resource leaks
- Use meaningful variable names
- Add comments to explain complex logic
- Practice typing code instead of copy-pasting
- Understand error messages - they're your friends!

---

## Quick Reference Card

```java
// Basic Program Template
public class ClassName {
    public static void main(String[] args) {
        // Your code here
    }
}

// Common Import
import java.util.Scanner;

// Input Template
Scanner scanner = new Scanner(System.in);
String text = scanner.nextLine();
int number = scanner.nextInt();
scanner.close();

// Output Templates
System.out.println("Text with newline");
System.out.print("Text without newline");
System.out.printf("Formatted: %s %d%n", text, number);
```
