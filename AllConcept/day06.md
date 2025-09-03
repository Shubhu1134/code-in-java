---
# 🔹 Concept 6: Type Casting in Java
---

## 1. **Why do we need Type Casting?**

- In Java, every variable has a **data type** (int, float, double, char, etc.).
- Sometimes, we need to **store a value of one type into another type**.
- Example:

  - Adding `int` and `double` → result becomes `double`.
  - Assigning a `double` to an `int` is not direct → needs **casting**.

- Without type casting, data might be **incompatible** or cause **loss of precision**.

👉 In short: Type casting helps us **convert data types safely** so we can use them together.

---

## 2. **What is Type Casting?**

Type casting = **converting one data type into another**.

There are **two types**:

### (a) **Widening (Implicit Casting / Type Promotion)**

- Smaller type → Bigger type (automatic, no data loss).
- Done by compiler.
- Example:

  ```java
  int num = 10;
  double val = num; // int → double (automatic)
  ```

- Order of widening:
  **byte → short → int → long → float → double**

---

### (b) **Narrowing (Explicit Casting)**

- Bigger type → Smaller type (may cause data loss).
- Requires explicit `(type)` casting by programmer.
- Example:

  ```java
  double val = 10.75;
  int num = (int) val;  // double → int (decimal part lost)
  ```

---

### (c) **Reference Type Casting (Objects)**

- When dealing with **inheritance**.
- **Upcasting**: Child → Parent (automatic).
- **Downcasting**: Parent → Child (explicit, needs cast).

Example:

```java
class Parent {}
class Child extends Parent {}

Parent p = new Child();    // Upcasting (safe)
Child c = (Child) p;       // Downcasting (must be explicit)
```

---

## 3. **How does Type Casting Work?**

- Compiler checks if casting is **safe** or **requires explicit mention**.
- Primitive casting follows **size hierarchy**.
- Object casting follows **is-a relationship**.

👉 **Rule**: You can only cast if there is a **possible relationship**.

```java
String s = (String) new Object();  // Error (not related)
```

---

## 4. **Examples (Primitive Casting)**

### Widening (Automatic)

```java
int a = 100;
long b = a;   // int → long
float c = b;  // long → float
```

### Narrowing (Explicit)

```java
double x = 99.99;
int y = (int) x;  // 99 (loses decimal)
```

---

## 5. **Examples (Object Casting)**

### Upcasting

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}

Animal a = new Dog(); // Upcasting
a.sound(); // Output: Bark (runtime polymorphism)
```

### Downcasting

```java
Animal a = new Dog(); // Upcasting first
Dog d = (Dog) a;      // Downcasting
d.sound();            // Bark
```

⚠️ If downcasting wrongly:

```java
Animal a = new Animal();
Dog d = (Dog) a;   // ClassCastException at runtime
```

---

## 6. **Where is Type Casting Used?**

- Mathematical calculations (mixing int, float, double).
- Inheritance-based polymorphism (upcasting/downcasting).
- Converting `Object` to specific types (common in Collections, Generics).
- Handling legacy code with type differences.

---

## 7. **Interview Questions**

### Normal

1. What is type casting in Java?
2. Difference between widening and narrowing casting?
3. Can we lose data during type casting? Give example.
4. What is the difference between primitive casting and reference casting?

### Tricky

1. What will be the output?

   ```java
   double d = 10.5;
   int i = (int) d;
   System.out.println(i);
   ```

   👉 Output: `10` (decimal truncated).

2. What will happen here?

   ```java
   Animal a = new Animal();
   Dog d = (Dog) a;
   ```

   👉 **Runtime error**: `ClassCastException`.

3. Is downcasting safe?
   👉 Only if the object **really is** of the child type at runtime.

4. Why is upcasting automatic but downcasting not?
   👉 Because **every child is a parent**, but **not every parent is a child**.

---

✅ **Connected Mind Map**:

- Variables → Data Types → Type Casting → Widening/Narrowing → Upcasting/Downcasting → Polymorphism → Runtime Errors (ClassCastException).

---
