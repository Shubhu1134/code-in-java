---
# 🔹 Concept 5: Variables in Java
---

## 1. **Why Variables?**

👉 Imagine a box in which you store something to use later. Similarly, in programs, we need a place to **store data temporarily in memory (RAM)**.
Without variables, we would have to hardcode values everywhere (not reusable, not flexible).

---

## 2. **What are Variables?**

A **variable** is simply a **name given to a memory location** that stores a value.

💡 Example:

```java
int age = 25;  // variable age stores value 25
```

Here:

- `int` → Data type (decides kind of data stored, size in memory).
- `age` → Variable name (identifier).
- `25` → Value assigned.

---

## 3. **How Variables Work (Step by Step in Memory)**

1. When you write `int age = 25;`

   - JVM allocates **4 bytes** (because int = 32-bit = 4 bytes) in memory.
   - Variable `age` points to that memory.
   - Value `25` is stored there.

2. If you later do:

   ```java
   age = 30;
   ```

   Now the same memory location contains `30`.

---

## 4. **Types of Variables**

### (A) Based on **Scope (where they are declared):**

1. **Local Variable**

   - Declared inside a method, constructor, or block.
   - Created when method starts, destroyed when it ends.
   - Must be **initialized before use**.

   ```java
   void test() {
       int x = 10;  // local variable
       System.out.println(x);
   }
   ```

2. **Instance Variable (Non-Static Field)**

   - Declared inside a class but outside methods.
   - Each object has its **own copy**.
   - Default values given by JVM (0 for int, null for objects, false for boolean).

   ```java
   class Student {
       int rollNo;  // instance variable
   }
   ```

3. **Static Variable (Class Variable)**

   - Declared with `static` keyword inside a class.
   - Shared across all objects of that class.
   - Memory allocated once when class is loaded.

   ```java
   class Student {
       static String schoolName = "DPS";
   }
   ```

---

### (B) Based on **Data Type**

1. **Primitive Variables** → store actual value (e.g., int, float, char, boolean).
   Example: `int num = 100;`

2. **Reference Variables** → store reference (address) of objects.
   Example:

   ```java
   String s = new String("Hello");
   ```

---

## 5. **Variable Declaration Rules**

✅ Must start with letter, `_`, or `$`.
✅ Cannot start with digit.
✅ Cannot use Java keywords (`int`, `class`, etc.).
✅ Case-sensitive.

Examples:

- Valid → `age`, `roll_number`, `$salary`.
- Invalid → `2value`, `class`.

---

## 6. **Connections with Other Concepts**

- **Data Types (Concept 4)** → Variables always need a type.
- **Memory Management** → Variables tell JVM how much memory to allocate.
- **OOP (Classes/Objects)** → Instance vs Static variables.
- **Access Modifiers (Concept 6)** → Decide accessibility of variables.

---

## 7. **Common Mistakes / Tricky Parts**

❌ Using uninitialized local variables → Compiler error.
❌ Confusing between instance and static variables.
❌ Shadowing → When local variable hides instance variable.

Example:

```java
class Test {
    int x = 10;
    void show() {
        int x = 20;
        System.out.println(x);  // prints 20 (local hides instance)
    }
}
```

---

## 8. **Interview Questions on Variables**

### Beginner:

1. What are local, instance, and static variables?
2. What is the default value of instance variables?
3. Can a local variable have default values?

### Intermediate:

4. Difference between primitive and reference variables?
5. When are static variables created and destroyed?
6. Explain variable shadowing with an example.

### Tricky:

7. Can we declare static variables inside methods?

   - ❌ No, only **final static constants** are allowed inside methods.

8. What happens if we use a variable before initializing it?

   - Local variables → compile-time error.
   - Instance/static → JVM provides default value.

---

## 9. **Mini Coding Examples**

### Instance vs Static:

```java
class Student {
    int rollNo;              // instance
    static String college = "IIT";  // static

    Student(int r) { rollNo = r; }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);

        System.out.println(s1.rollNo); // 101
        System.out.println(s2.rollNo); // 102
        System.out.println(Student.college); // IIT
    }
}
```

---
