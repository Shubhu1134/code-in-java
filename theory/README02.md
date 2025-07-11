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
