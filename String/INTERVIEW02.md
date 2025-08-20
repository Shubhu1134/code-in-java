---
# 🚀 Java Methods Interview Questions & Answers
---

## 🟢 Beginner-Level Questions

---

### 1. **What is a method in Java?**

**Answer:**

- A **method** is a block of code that performs a specific task.
- It improves **code reusability, readability, and maintainability**.
- Syntax:

  ```java
  returnType methodName(parameters) {
      // method body
  }
  ```

**Example:**

```java
public int add(int a, int b) {
    return a + b;
}
```

---

### 2. **What are the types of methods in Java?**

**Answer:**

1. **Predefined (Inbuilt) methods** → Already available in Java libraries.
   Example: `Math.max()`, `String.length()`, `System.out.println()`.
2. **User-defined methods** → Created by the programmer.
   Example:

   ```java
   void greet() {
       System.out.println("Hello!");
   }
   ```

3. **Static methods** → Belong to class, can be called without object.
4. **Instance methods** → Need an object to call.
5. **Abstract methods** → Declared without body, defined in subclasses.
6. **Final methods** → Cannot be overridden.
7. **Synchronized methods** → Used in multithreading for thread safety.

---

### 3. **What is the difference between function and method in Java?**

**Answer:**

- In Java, everything is inside a **class**.
- So, a function inside a class is called a **method**.
- Unlike C/C++, you cannot have standalone functions in Java.

---

### 4. **What is the difference between static and non-static methods?**

**Answer:**

- **Static method** → belongs to the class, called using `ClassName.method()`.
- **Non-static (instance) method** → belongs to an object, called using `object.method()`.

**Example:**

```java
class Test {
    static void staticMethod() { System.out.println("Static method"); }
    void instanceMethod() { System.out.println("Instance method"); }
}

public class Main {
    public static void main(String[] args) {
        Test.staticMethod();      // no object needed
        new Test().instanceMethod(); // needs object
    }
}
```

---

### 5. **What is method signature in Java?**

**Answer:**

- Method **signature = method name + parameter list (number, type, order)**.
- Return type is **not** part of the signature.

Example:

```java
int add(int a, int b)   // Signature: add(int, int)
```

---

## 🟡 Intermediate-Level Questions

---

### 6. **What is method overloading?**

**Answer:**

- **Same method name, different parameter list** (type, number, or order).
- Happens at **compile time** (compile-time polymorphism).

**Example:**

```java
class MathUtil {
    int add(int a, int b) { return a+b; }
    double add(double a, double b) { return a+b; }
}
```

---

### 7. **What is method overriding?**

**Answer:**

- **Same method name, same parameter list, but defined in child class**.
- Happens at **runtime** (runtime polymorphism).

**Example:**

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Bark"); }
}
```

---

### 8. **What is the difference between overloading and overriding?**

**Answer:**

| Feature          | Overloading       | Overriding                |
| ---------------- | ----------------- | ------------------------- |
| Parameters       | Must be different | Must be same              |
| Return type      | Can be different  | Must be same or covariant |
| Compile/Runtime  | Compile-time      | Runtime                   |
| Access modifiers | No restrictions   | Cannot reduce visibility  |

---

### 9. **What is recursion in Java?**

**Answer:**

- A method calling itself is recursion.
- Useful for problems like factorial, Fibonacci, tree traversal.

**Example:**

```java
int factorial(int n) {
    if(n == 0) return 1;
    return n * factorial(n-1);
}
```

---

### 10. **What is a constructor vs a method?**

**Answer:**

- **Constructor:** special method to initialize object, same name as class, no return type.
- **Method:** performs operations, can have return type, can be called multiple times.

---

## 🔵 Advanced-Level Questions

---

### 11. **What is an abstract method?**

**Answer:**

- A method declared with `abstract` keyword (no body).
- Must be implemented in subclass.

Example:

```java
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}
```

---

### 12. **What is a final method?**

**Answer:**

- Declared with `final` keyword.
- Cannot be overridden by child classes.

Example:

```java
class A {
    final void show() { System.out.println("Final method"); }
}
```

---

### 13. **What is a synchronized method?**

**Answer:**

- Ensures only **one thread at a time** executes the method.
- Used in multithreading to avoid data corruption.

Example:

```java
synchronized void printMessage() {
    System.out.println("Thread-safe method");
}
```

---

### 14. **What are native methods?**

**Answer:**

- Methods implemented in **other languages (C/C++)** using JNI.
- Declared with `native` keyword.
- Example: Many JVM internal methods like `hashCode()` use native code.

---

### 15. **What are default and static methods in interfaces?**

**Answer:**

- **Default method**: has body inside interface.
- **Static method**: belongs to interface, called using `InterfaceName.method()`.

Example:

```java
interface MyInterface {
    default void show() { System.out.println("Default method"); }
    static void display() { System.out.println("Static method in interface"); }
}
```

---

## 🔴 Tricky / Real Interview Questions

---

### 16. **Why do we need methods in Java?**

- Reusability (write once, use many times).
- Modularity (break program into smaller parts).
- Maintainability (easy to update).

---

### 17. **Can we overload main() method in Java?**

**Yes**, we can overload `main()`, but JVM always calls the one with `public static void main(String[] args)`.
Example:

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Main with String[]");
        main(5);
    }
    public static void main(int x) {
        System.out.println("Overloaded main: " + x);
    }
}
```

---

### 18. **Can we override static methods in Java?**

- ❌ No, static methods cannot be overridden.
- They can be **hidden** (method hiding).

---

### 19. **Can we change return type while overloading?**

- ✅ Yes (as long as parameter list is different).

---

### 20. **Can we change return type while overriding?**

- ✅ Yes, but only **covariant return type** (child type of original return type).

---

✅ This covers **all types of methods (inbuilt, user-defined, class methods)** + interview questions from beginner to advanced.

---
