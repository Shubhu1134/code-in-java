# 🧠 Core Java: Theory, Philosophy & How It Works

If you're not just interested in *how* to code in Java, but *why* Java works the way it does, this guide will walk you through the **theory**, **philosophy**, and **core mechanisms** behind Java.

---

## 🔍 1. Philosophy Behind Java

### 🧠 Java's Design Goals (by James Gosling & Team)

| Goal                 | What It Means                                                      |
|----------------------|--------------------------------------------------------------------|
| **Simple**           | Easy to learn and use — reduce complexity                         |
| **Object-Oriented**  | Everything is an object; helps model real-world problems          |
| **Robust**           | Strong memory handling, type safety, error checking               |
| **Secure**           | Safe for running code across networks or unknown sources          |
| **Portable**         | Write once, run anywhere — thanks to JVM                          |
| **High Performance** | Compiled to bytecode, JIT compilation helps speed                 |
| **Multithreaded**    | Supports multiple tasks at the same time                          |
| **Architecture Neutral** | Not dependent on a specific machine or OS                    |

---

## ⚙️ 2. How Java Code is Processed

### From Source Code to Execution:

1. **Write Code** – You write `.java` files (source code).
2. **Compile** – The Java compiler (`javac`) converts them into `.class` files (bytecode).
3. **Run on JVM** – The Java Virtual Machine executes this bytecode.

### 🔄 Why Bytecode?
- Portable across OSes.
- Efficient and secure.
- Allows **JVM** to optimize code at runtime using **JIT (Just-In-Time Compilation)**.

---

## 🧱 3. Object-Oriented Programming (OOP) in Java

| Principle          | Purpose                                                                |
|--------------------|------------------------------------------------------------------------|
| **Abstraction**     | Hides complexity behind simple APIs (e.g., `car.drive()`)             |
| **Encapsulation**   | Keeps internal data hidden; provides public access only as needed     |
| **Inheritance**     | Reuse code by creating subclasses from a parent class                 |
| **Polymorphism**    | Objects can take many forms; enables flexibility and clean interfaces |

---

## 🛠 4. Classes, Objects & Methods

### 🔸 Class
A **blueprint** for creating objects. Defines structure (fields) and behavior (methods).

```java
public class Car {
    String color;
    int year;

    void drive() {
        System.out.println("The car is driving");
    }
}
