# 30 Days Java Mastery - Day 2: Operators and Control Structures

## 🎯 Today's Learning Goals

- Master all types of operators in Java
- Understand operator precedence and associativity
- Learn decision-making with if-else statements
- Explore switch statements and expressions
- Master all loop types (for, while, do-while)
- Practice control flow with nested structures

---

## 1. Java Operators Overview

### Operator Categories

```java
// 1. Arithmetic Operators
+ - * / %

// 2. Relational/Comparison Operators
== != > < >= <=

// 3. Logical Operators
&& || !

// 4. Assignment Operators
= += -= *= /= %=

// 5. Unary Operators
++ -- + - !

// 6. Bitwise Operators
& | ^ ~ << >> >>>

// 7. Ternary Operator
condition ? value1 : value2

// 8. instanceof Operator
object instanceof Class
```

---

## 2. Arithmetic Operators

### Basic Arithmetic

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20, b = 7;

        System.out.println("a = " + a + ", b = " + b);

        // Basic operations
        System.out.println("Addition: a + b = " + (a + b));       // 27
        System.out.println("Subtraction: a - b = " + (a - b));    // 13
        System.out.println("Multiplication: a * b = " + (a * b)); // 140
        System.out.println("Division: a / b = " + (a / b));       // 2 (integer division)
        System.out.println("Modulus: a % b = " + (a % b));        // 6 (remainder)

        // Floating-point division
        double result = (double) a / b;
        System.out.println("Float Division: " + result);          // 2.857...
    }
}
```

### Division Types and Pitfalls

```java
public class DivisionExamples {
    public static void main(String[] args) {
        // Integer division truncates decimal part
        int x = 7, y = 3;
        System.out.println("7 / 3 = " + (x / y));           // 2 (not 2.33)

        // Floating-point division
        double d1 = 7.0 / 3.0;                              // 2.333...
        double d2 = (double) x / y;                         // 2.333... (casting)
        double d3 = x * 1.0 / y;                           // 2.333... (promotion)

        // Division by zero
        try {
            int result = 10 / 0;                           // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        // Floating-point division by zero
        double infiniteResult = 10.0 / 0.0;               // Infinity
        double nanResult = 0.0 / 0.0;                     // NaN (Not a Number)

        System.out.println("10.0 / 0.0 = " + infiniteResult);
        System.out.println("0.0 / 0.0 = " + nanResult);
    }
}
```

---

## 3. Unary and Assignment Operators

### Increment and Decrement

```java
public class UnaryOperators {
    public static void main(String[] args) {
        int x = 5;

        // Pre-increment: increment first, then use value
        System.out.println("x = " + x);                    // 5
        System.out.println("++x = " + (++x));              // 6
        System.out.println("x after ++x = " + x);          // 6

        // Post-increment: use value first, then increment
        x = 5; // Reset
        System.out.println("x++ = " + (x++));              // 5
        System.out.println("x after x++ = " + x);          // 6

        // Pre-decrement and post-decrement
        x = 5; // Reset
        System.out.println("--x = " + (--x));              // 4
        System.out.println("x-- = " + (x--));              // 4
        System.out.println("x after x-- = " + x);          // 3

        // Complex expressions
        int a = 5, b = 5;
        int result1 = ++a + b++;  // 6 + 5 = 11, a=6, b=6
        int result2 = a++ + ++b;  // 6 + 7 = 13, a=7, b=7

        System.out.println("Complex result 1: " + result1);
        System.out.println("Complex result 2: " + result2);
    }
}
```

### Assignment Operators

```java
public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 10;

        // Compound assignment operators
        x += 5;    // x = x + 5;    → x = 15
        x -= 3;    // x = x - 3;    → x = 12
        x *= 2;    // x = x * 2;    → x = 24
        x /= 4;    // x = x / 4;    → x = 6
        x %= 5;    // x = x % 5;    → x = 1

        System.out.println("Final x value: " + x);

        // Multiple assignments
        int a, b, c;
        a = b = c = 50;  // Right to left assignment
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
    }
}
```

---

## 4. Relational and Logical Operators

### Comparison Operators

```java
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);

        // Relational operators return boolean
        System.out.println("a == b: " + (a == b));         // false
        System.out.println("a != b: " + (a != b));         // true
        System.out.println("a > b: " + (a > b));           // false
        System.out.println("a < b: " + (a < b));           // true
        System.out.println("a >= b: " + (a >= b));         // false
        System.out.println("a <= b: " + (a <= b));         // true

        // String comparison (be careful!)
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2: " + (s1 == s2));     // true (same object in pool)
        System.out.println("s1 == s3: " + (s1 == s3));     // false (different objects)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same content)
    }
}
```

### Logical Operators

```java
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        // Logical AND (&&) - Short-circuit evaluation
        System.out.println("a && b: " + (a && b));         // false
        System.out.println("a && true: " + (a && true));   // true

        // Logical OR (||) - Short-circuit evaluation
        System.out.println("a || b: " + (a || b));         // true
        System.out.println("b || false: " + (b || false)); // false

        // Logical NOT (!)
        System.out.println("!a: " + !a);                   // false
        System.out.println("!b: " + !b);                   // true

        // Short-circuit demonstration
        int x = 5, y = 0;

        // This is safe - second condition won't execute if first is false
        if (y != 0 && x / y > 2) {
            System.out.println("Division executed");
        } else {
            System.out.println("Division avoided due to short-circuit");
        }

        // Complex logical expressions
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("Can drive: " + canDrive);
    }
}
```

---

## 5. Operator Precedence and Associativity

### Precedence Table (High to Low)

```java
public class OperatorPrecedence {
    public static void main(String[] args) {
        // Precedence demonstration
        int result1 = 2 + 3 * 4;        // 14 (not 20) - * has higher precedence
        int result2 = (2 + 3) * 4;      // 20 - parentheses override precedence

        // Complex expression
        int a = 10, b = 20, c = 30;
        boolean result = a < b && b < c || a > c;  // true
        // Evaluation: (a < b) && (b < c) || (a > c)
        //            (true) && (true) || (false)
        //            true || false
        //            true

        System.out.println("Complex result: " + result);

        // Assignment associativity (right to left)
        int x, y, z;
        x = y = z = 5;  // Equivalent to: x = (y = (z = 5))

        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}
```

### Precedence Rules to Remember:

1. **Unary operators**: `++`, `--`, `!`, `+`, `-`
2. **Multiplicative**: `*`, `/`, `%`
3. **Additive**: `+`, `-`
4. **Relational**: `<`, `>`, `<=`, `>=`
5. **Equality**: `==`, `!=`
6. **Logical AND**: `&&`
7. **Logical OR**: `||`
8. **Ternary**: `?:`
9. **Assignment**: `=`, `+=`, `-=`, etc.

---

## 6. Conditional Statements (if-else)

### Basic if-else Structure

```java
public class ConditionalStatements {
    public static void main(String[] args) {
        int score = 85;

        // Simple if statement
        if (score >= 90) {
            System.out.println("Grade: A");
        }

        // if-else statement
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // if-else if-else ladder
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Nested if statements
        boolean isLoggedIn = true;
        String role = "admin";

        if (isLoggedIn) {
            if (role.equals("admin")) {
                System.out.println("Welcome Admin! Full access granted.");
            } else if (role.equals("user")) {
                System.out.println("Welcome User! Limited access granted.");
            } else {
                System.out.println("Welcome Guest! Read-only access.");
            }
        } else {
            System.out.println("Please log in first.");
        }
    }
}
```

### Ternary Operator (Conditional Operator)

```java
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Basic ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);

        // Nested ternary (use sparingly!)
        int x = 15;
        String category = (x >= 18) ? "Adult" :
                         (x >= 13) ? "Teen" : "Child";
        System.out.println("Category: " + category);

        // Ternary in expressions
        System.out.println("Result: " + ((a > b) ? "a is greater" : "b is greater"));

        // Multiple conditions
        boolean hasPermission = true;
        boolean isActive = true;
        String status = (hasPermission && isActive) ? "Authorized" : "Denied";
        System.out.println("Access: " + status);
    }
}
```

---

## 7. Switch Statements

### Traditional Switch Statement

```java
public class SwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;

        // Traditional switch
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day: " + dayName);

        // Switch with multiple cases
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("Average");
                break;
            case 'D':
            case 'd':
                System.out.println("Below average");
                break;
            case 'F':
            case 'f':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }

        // Switch with String (Java 7+)
        String command = "start";
        switch (command.toLowerCase()) {
            case "start":
                System.out.println("Starting the application...");
                break;
            case "stop":
                System.out.println("Stopping the application...");
                break;
            case "restart":
                System.out.println("Restarting the application...");
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }
}
```

### Enhanced Switch (Java 12+)

```java
public class EnhancedSwitch {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        // Switch expression (Java 12+)
        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("Day type: " + dayType);

        // Switch with yield (Java 13+)
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> {
                System.out.println("Processing invalid day...");
                yield "Unknown";
            }
        };

        System.out.println("Day name: " + dayName);
    }
}
```

---

## 8. Loop Structures

### for Loop

```java
public class ForLoop {
    public static void main(String[] args) {
        // Basic for loop
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Counting backward
        System.out.println("Countdown:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Blast off!");

        // Step by different values
        System.out.println("Even numbers:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multiple variables in for loop
        System.out.println("Multiple variables:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i=" + i + ", j=" + j);
        }

        // Infinite for loop (be careful!)
        // for (;;) {
        //     System.out.println("This runs forever!");
        //     break; // Need break to exit
        // }
    }
}
```

### Enhanced for Loop (for-each)

```java
public class EnhancedForLoop {
    public static void main(String[] args) {
        // Array iteration
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // String array iteration
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        System.out.println("Names:");
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }

        // Character iteration in String
        String word = "Java";
        System.out.println("Characters in '" + word + "':");
        for (char c : word.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Note: Enhanced for loop is read-only
        int[] arr = {1, 2, 3, 4, 5};
        for (int value : arr) {
            value *= 2; // This doesn't modify the original array
        }

        System.out.println("Original array unchanged:");
        for (int value : arr) {
            System.out.print(value + " "); // Still 1 2 3 4 5
        }
        System.out.println();
    }
}
```

### while Loop

```java
public class WhileLoop {
    public static void main(String[] args) {
        // Basic while loop
        int count = 1;
        System.out.println("While loop counting:");
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Input validation with while loop
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number;

        System.out.println("Enter a positive number:");
        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("Invalid! Enter a positive number:");
            number = scanner.nextInt();
        }

        System.out.println("You entered: " + number);

        // Finding factorial
        int n = 5;
        int factorial = 1;
        int temp = n;

        while (temp > 0) {
            factorial *= temp;
            temp--;
        }

        System.out.println("Factorial of " + n + " = " + factorial);

        scanner.close();
    }
}
```

### do-while Loop

```java
public class DoWhileLoop {
    public static void main(String[] args) {
        // Basic do-while loop
        int i = 1;
        System.out.println("Do-while loop:");
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        // Key difference: executes at least once
        int x = 10;
        System.out.println("Do-while with false condition:");
        do {
            System.out.println("This executes once even though x > 5");
        } while (x < 5); // False condition, but block executes once

        // Menu-driven program example
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
```

---

## 9. Loop Control Statements

### break and continue

```java
public class LoopControl {
    public static void main(String[] args) {
        // break statement
        System.out.println("Using break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i equals 6
            }
            System.out.print(i + " ");
        }
        System.out.println(" (Loop terminated at 6)");

        // continue statement
        System.out.println("Using continue (skip even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println(" (Only odd numbers printed)");

        // Labeled break and continue (nested loops)
        System.out.println("Labeled break in nested loops:");
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer; // Break out of both loops
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        System.out.println("Exited nested loops");

        System.out.println("Labeled continue in nested loops:");
        outer2: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer2; // Continue with next iteration of outer loop
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
```

---

## 10. Practice Exercises for Day 2

### Exercise 1: Grade Calculator

```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Get marks for 5 subjects from user
        // Calculate percentage
        // Assign grade based on percentage:
        // 90-100: A+, 80-89: A, 70-79: B, 60-69: C, 50-59: D, <50: F
        // Display result with appropriate message

        scanner.close();
    }
}
```

### Exercise 2: Number Pattern Generator

```java
import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // TODO: Generate these patterns:
        // Pattern 1: Right triangle
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        // Pattern 2: Inverted triangle
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        scanner.close();
    }
}
```

### Exercise 3: Simple Calculator with Menu

```java
import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // TODO: Create a menu-driven calculator
        // 1. Addition
        // 2. Subtraction
        // 3. Multiplication
        // 4. Division
        // 5. Exit
        // Use do-while loop and switch statement
        // Handle division by zero
        // Continue until user chooses exit

        scanner.close();
    }
}
```

### Exercise 4: Prime Number Checker

```java
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // TODO: Check if the number is prime
        // A prime number is only divisible by 1 and itself
        // Use loop to check divisibility
        // Print appropriate message

        scanner.close();
    }
}
```

---

## 11. Key Takeaways from Day 2

### ✅ What You Learned Today:

1. **Operators**: Arithmetic, relational, logical, assignment, unary
2. **Operator Precedence**: Understanding evaluation order
3. **Conditional Statements**: if-else chains, nested conditions, ternary operator
4. **Switch Statements**: Traditional and enhanced syntax
5. **Loops**: for, enhanced for, while, do-while
6. **Loop Control**: break, continue, labeled statements

### 🚀 Tomorrow's Preview (Day 3): Arrays and Methods

- Array declaration, initialization, and operations
- Multi-dimensional arrays
- Method definition and calling
- Parameter passing and return types
- Method overloading
- Variable arguments (varargs)

### 📝 Homework:

1. Complete all four practice exercises
2. Create a program that finds all prime numbers between 1 and 100
3. Write a program that generates multiplication tables
4. Experiment with nested loops to create different patterns

### 💡 Pro Tips:

- **Operator Precedence**: When in doubt, use parentheses for clarity
- **Loop Choice**: Use for when you know iterations, while for conditions, do-while for at-least-once execution
- **Switch vs If-else**: Use switch for discrete values, if-else for ranges
- **Break vs Continue**: break exits loop completely, continue skips current iteration
- **Code Style**: Use meaningful variable names and proper indentation

---

## Quick Reference Card

```java
// Operator Precedence (High to Low)
++ --           // Unary
* / %           // Multiplicative
+ -             // Additive
< > <= >= ==!=  // Relational & Equality
&&              // Logical AND
||              // Logical OR
?:              // Ternary
= += -= *= /= %= // Assignment

// Control Structures Templates
if (condition) { /* code */ }
else if (condition) { /* code */ }
else { /* code */ }

switch (variable) {
    case value1: /* code */ break;
    case value2: /* code */ break;
    default: /* code */
}

for (init; condition; update) { /* code */ }
for (type var : collection) { /* code */ }
while (condition) { /* code */ }
do { /* code */ } while (condition);
```
