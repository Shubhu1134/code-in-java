**Concept 8: `static` and `final` keywords in Java**.

---

## 🔹 Why `static` and `final`?

- Sometimes you want **something shared across all objects** → `static`.
- Sometimes you want **something unchangeable** → `final`.
- They help in **memory efficiency, code safety, and controlling behavior**.

---

## 🔹 What is `static`?

- **Static** means **belongs to the class**, not the object.
- Static members (variables, methods, blocks, nested classes) are **shared by all objects**.

### Example: Static Variable

```java
class Student {
    static String school = "DPS"; // shared
    String name;                  // unique for each object

    Student(String n) { name = n; }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Amit");

        System.out.println(s1.school); // DPS
        System.out.println(s2.school); // DPS
    }
}
```

---

### Example: Static Method

```java
class Calculator {
    static int add(int a, int b) { return a + b; }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5, 10)); // no object needed
    }
}
```

---

### Key Points of `static`

- Memory allocated **once** → efficient.
- Can **access only static members** inside a static method.
- Used in **utility classes** (`Math`, `Collections`).
- Static block → executes when class is **loaded**, useful for initialization.

---

## 🔹 What is `final`?

- **Final** means **cannot be changed**.
- Can be applied to:

  1. **Variable** → value cannot change (constant).
  2. **Method** → cannot be overridden.
  3. **Class** → cannot be inherited.

### Example: Final Variable

```java
final double PI = 3.14159;
// PI = 3.14; // Error! Cannot change
```

### Example: Final Method

```java
class Vehicle {
    final void start() { System.out.println("Starting..."); }
}
class Car extends Vehicle {
    // void start(){} // Error! Cannot override
}
```

### Example: Final Class

```java
final class Constants {}
// class MathConstants extends Constants {} // Error!
```

---

## 🔹 How `static` and `final` connect

- **Static final** → combination → constant at class level.

```java
class Constants {
    static final double PI = 3.14159;
}
```

- **Use case**: `Math.PI`

- `static` → memory sharing

- `final` → immutability / security

---

## 🔹 Interview Questions

1. Difference between `static` and `instance` members?
2. Can a **static method be final**?

   - ✅ Yes, but final **prevents overriding**, static **cannot be overridden anyway**, so final has no effect on static method.

3. Can we make **class final and static**?

   - ❌ Top-level class cannot be static.

4. Difference between **final variable and constant**?

   - Constant = `static final` → same for all objects.

5. Explain **static block vs instance block**.

---

## 🔹 Tricky Points

- Static method **cannot use `this` keyword**.
- Final variables **must be initialized** (either inline, constructor, or block).
- Static final variable → called **constant**, naming convention is **UPPER_CASE**.

---

✅ **Memory Trick / Mind Map**

```
Static → Shared by all objects → Memory efficient
Final → Cannot change → Immutable
Static + Final → Constant → Class-level unchangeable value
```

---
