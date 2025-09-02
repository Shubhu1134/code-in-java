**Concept 3: Variables & Data Types in Java**.
(We’ll go with the **Why → What → How → Use cases → Interview Q\&A → Tricks to remember → Connections** approach as you asked.)

---

## 🔹 1. Why Variables & Data Types?

- **Why Variables?**
  Imagine solving math without symbols like `x` or `y`. Hard, right? In programming, variables are names that store data for reuse.
- **Why Data Types?**
  Java is **strongly typed**. This means the compiler must know what type of data a variable holds to avoid errors (e.g., can’t add a string and an integer directly).

---

## 🔹 2. What are Variables & Data Types?

- **Variable** = A named memory location that stores data.
- **Data Type** = Defines _what kind of data_ can be stored and _how much memory_ it needs.

### Types of Variables:

1. **Local Variable** – Declared inside a method, constructor, or block. Scope is limited.
2. **Instance Variable** – Declared inside a class but outside methods, belongs to objects.
3. **Static Variable** – Declared with `static`, belongs to class, shared across all objects.

### Data Types:

#### 🔸 Primitive Types (8 in Java):

- `byte` → 1 byte (small numbers, -128 to 127)
- `short` → 2 bytes
- `int` → 4 bytes (default for integers)
- `long` → 8 bytes
- `float` → 4 bytes (decimal, less precision)
- `double` → 8 bytes (decimal, high precision, default for decimals)
- `char` → 2 bytes (Unicode character)
- `boolean` → 1 bit (true/false)

#### 🔸 Non-Primitive Types:

- Strings, Arrays, Classes, Interfaces, Enums, Objects, Collections, etc.

---

## 🔹 3. How Variables Work?

When you declare a variable:

```java
int age = 25;
```

- `int` → tells JVM the type.
- `age` → variable name.
- `25` → value stored.

The JVM allocates **4 bytes in memory** for `age`.

---

## 🔹 4. Use Cases

- Store user input (name, age, salary).
- Temporary values in loops.
- Constants with `final`.
- Sharing values across objects using `static`.

Example:

```java
class Student {
    String name;  // Instance variable
    static String school = "DPS";  // Static variable

    void setName(String n) {
        String greeting = "Hello"; // Local variable
        name = n;
        System.out.println(greeting + " " + name);
    }
}
```

---

## 🔹 5. Common Interview Questions

1. Difference between **local, instance, and static variables**?
2. Default values of instance variables?

   - `int=0`, `float=0.0`, `boolean=false`, `String=null`
     (⚡ Local variables have **no default values**, must be initialized).

3. Why is `String` not a primitive?

   - Because it’s an object with many methods.

4. What’s the difference between **float and double**?

   - Double has more precision.

5. Why does Java have **boolean** instead of using `int 0/1` like C?

   - For readability and type-safety.

---

## 🔹 6. Tricks to Remember

- **Primitives = "B S I L F D C B"** (Byte, Short, Int, Long, Float, Double, Char, Boolean).
- **Default values** = Think of “empty version”: numbers → 0, boolean → false, objects → null.
- **Scope** → Local (method), Instance (object), Static (class).

---

## 🔹 7. Connection with Next Topics

- Variables → needed to **control flow** (if, loops).
- Data types → affect **operators** (arithmetic, logical).
- Objects (non-primitives) → will lead us into **OOP**.

---

⚡ Quick Brain Exercise (Interview Style):

```java
class Test {
    int x;        // Instance
    static int y; // Static

    void show() {
        int z = 10; // Local
        System.out.println(x + " " + y + " " + z);
    }
}
```

👉 Q: What are the default values of `x`, `y`, and `z` if not initialized?

- `x=0`, `y=0`, but `z` → ERROR (must initialize local variable).

---
