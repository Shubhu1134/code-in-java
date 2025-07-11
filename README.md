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


---------------------------------------------
# 📘 Core Java – Day 2: Java Type System, Variables, and Memory Model

---

## 🧠 1. Java Type System: Static, Strong, and Safe

Java is a **statically typed** and **strongly typed** language.

| Concept           | What It Means |
|-------------------|---------------|
| **Statically Typed** | You must declare variable types at compile-time |
| **Strongly Typed**   | You can't mix incompatible types (e.g., `int + String`) without conversion |

### 📦 Primitive Data Types

Java has 8 primitive types (basic data types that are not objects):

| Type     | Size    | Example         | Purpose                  |
|----------|---------|------------------|---------------------------|
| `byte`   | 1 byte  | `byte b = 100;`  | Small integers            |
| `short`  | 2 bytes | `short s = 500;` | Medium integers           |
| `int`    | 4 bytes | `int x = 123;`   | Default for integers      |
| `long`   | 8 bytes | `long l = 1000L;`| Large integers            |
| `float`  | 4 bytes | `float f = 2.5f;`| Decimal values (less precise) |
| `double` | 8 bytes | `double d = 2.5;`| Decimal values (more precise) |
| `char`   | 2 bytes | `char c = 'A';`  | Single characters         |
| `boolean`| 1 bit   | `boolean b = true;` | True/false values     |

### 🧰 Reference Types

- All **objects** are reference types (e.g., `String`, `Scanner`, `Car`, etc.).
- When you use a class, you're using a **reference to an object** in memory.

---

## 📥 2. Variables in Java

### 🔹 Declaration and Initialization

```java
int age = 25;
String name = "Alice";


------------------------------------------------

# 🔄 Core Java – Day 3: Control Flow, Loops & Logical Operators

---

## 🧠 1. Why Control Flow?

Control flow allows your Java programs to make **decisions**, **repeat actions**, and **react to input** — just like humans do.

---

## 🔀 2. Conditional Statements (`if`, `else`, `switch`)

### ✅ `if`, `else if`, `else`

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
} else if (age >= 13) {
    System.out.println
<<<<<<< HEAD
=======

