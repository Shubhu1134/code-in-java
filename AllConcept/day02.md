---

## 🔹 Concept 2: Data Types and Variables

### 1️⃣ Why do we need Data Types and Variables?

* In real life, we deal with different types of information:

  * Age → number (integer)
  * Salary → number (decimal)
  * Name → text (string)
  * True/False → boolean
* Computers need a way to **differentiate** these values.
* **Data type** = tells Java what kind of data we are storing.
* **Variable** = container (memory location) that stores the value.

👉 Without data types, Java won’t know how much memory to reserve or what operations are allowed.

---

### 2️⃣ What are Data Types?

Java has **two categories**:

#### 🔹 Primitive Data Types (8)

| Type    | Size    | Example      | Use case                 |
| ------- | ------- | ------------ | ------------------------ |
| byte    | 1 byte  | 127, -128    | Save memory in arrays    |
| short   | 2 bytes | 32,000       | Small int ranges         |
| int     | 4 bytes | 1,000,000    | Default integer type     |
| long    | 8 bytes | 9,223,372…   | Very large numbers       |
| float   | 4 bytes | 3.14f        | Decimal (less precision) |
| double  | 8 bytes | 3.14159      | Default decimal type     |
| char    | 2 bytes | 'A', '9'     | Single character         |
| boolean | 1 bit   | true / false | Conditions               |

⚡ Trick: "b-s-i-l-f-d-c-b" → **byte, short, int, long, float, double, char, boolean**

---

#### 🔹 Non-Primitive (Reference) Types

- String
- Arrays
- Classes
- Interfaces
  (These are **objects** stored in heap, not stack.)

---

### 3️⃣ What are Variables?

A **variable** is just a name to access a memory location.

Syntax:

```java
dataType variableName = value;
```

Example:

```java
int age = 21;       // integer variable
double salary = 35000.75; // decimal
String name = "Rahul";   // object reference
```

---

### 4️⃣ Types of Variables

1. **Local Variable** → Declared inside methods, destroyed after method ends.
2. **Instance Variable** → Declared in class, each object has its own copy.
3. **Static Variable** → Shared across all objects of the class.

---

### 5️⃣ How memory works

- Primitive variables → stored in **stack** memory.
- Reference variables → store memory **address** of object in heap.

---

### 6️⃣ Use Cases

- **Primitive** → Fast calculations, lightweight memory usage.
- **Reference** → Real-world data like Strings, Lists, Objects.
- **Static variable** → To share data between objects (like a counter for how many objects created).

---

### 7️⃣ Connection with Concept 1

- **Java Basics (Concept 1)** gave us environment (JVM, compiler).
- **Data types & variables (Concept 2)** give us raw building blocks to store and process information inside that environment.

---

### 8️⃣ Interview Questions (Normal + Tricky)

1. **Q:** Difference between primitive and reference data types?
   **A:** Primitive → store actual values, faster, stored in stack.
   Reference → store memory address of object, stored in heap.

2. **Q:** Why is `String` not a primitive in Java?
   **A:** Because String is a class (object) that provides many useful methods like `length()`, `concat()`, etc.

3. **Q:** Default values of instance variables?
   **A:**

   - int → 0
   - double → 0.0
   - boolean → false
   - object → null
     (⚡ Tricky: local variables have **no default value**, they must be initialized before use.)

4. **Q:** What’s the difference between `==` and `.equals()` for Strings?
   **A:** `==` → checks reference (memory address).
   `.equals()` → checks actual value inside object.

5. **Q:** Why does `float` require `f` at the end (like `3.14f`)?
   **A:** Because decimal literals default to `double` in Java.

---

### 9️⃣ Tricks to Remember

- Primitive → small and fixed size → like "atoms".
- Reference → bigger, expandable → like "molecules".
- Think: Variable = **box**, Data type = **label** on the box.

  - "int age = 21;" → a box labeled "int" with value "21".

---
