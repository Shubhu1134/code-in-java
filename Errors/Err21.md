**Day 21**.

---

# 📅 Day 21 – Java Abstract Class & Interface Errors

Today we’ll go deep into **errors with abstract classes and interfaces**, which are the foundation for OOP abstraction and polymorphism.

---

## 🔹 1. Abstract Class Errors

### ✅ Correct:

```java
abstract class Shape {
    abstract void draw(); // no body
}

class Circle extends Shape {
    void draw() { System.out.println("Circle"); } // implemented
}
```

---

### ❌ Error 1: Abstract Method with Body

```java
abstract class Shape {
    abstract void draw() { System.out.println("Draw"); } // ❌ body not allowed
}
```

**Error:** `abstract methods cannot have a body`

👉 Abstract methods declare behavior but don’t define it.

---

### ❌ Error 2: Abstract Class Without Abstract Method (Not Error but Confusing)

```java
abstract class Shape {
    void draw() { } // ✅ allowed but unusual
}
```

👉 An abstract class **may have zero abstract methods**. Not an error, but can confuse learners.

---

### ❌ Error 3: Not Implementing Abstract Method in Subclass

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape { } // ❌ no draw() implemented
```

**Error:** `Circle is not abstract and does not override abstract method draw()`

👉 Either implement all abstract methods, or declare the subclass abstract too.

---

### ❌ Error 4: Private/Final/Static Abstract Methods

```java
abstract class Shape {
    private abstract void draw(); // ❌ not allowed
    final abstract void erase();  // ❌ not allowed
    static abstract void move();  // ❌ not allowed
}
```

**Errors:**

- `illegal combination of modifiers: abstract and private`
- `illegal combination of modifiers: abstract and final`
- `illegal combination of modifiers: abstract and static`

👉 Abstract = must be overridden → but `private`, `final`, `static` prevent overriding.

---

### ❌ Error 5: Instantiating Abstract Class

```java
abstract class Shape { }
class Main {
    public static void main(String[] args) {
        Shape s = new Shape(); // ❌ cannot create
    }
}
```

**Error:** `Shape is abstract; cannot be instantiated`

---

---

## 🔹 2. Interface Errors

### ✅ Correct:

```java
interface Shape {
    void draw(); // implicitly public & abstract
}
```

---

### ❌ Error 1: Interface Constructor

```java
interface Shape {
    Shape() { } // ❌ not allowed
}
```

**Error:** `modifier public not allowed here`
👉 Interfaces cannot have constructors because they are never instantiated directly.

---

### ❌ Error 2: Interface Variables Must Be `public static final`

```java
interface Shape {
    int x; // ❌ no initializer
}
```

**Error:** `= expected`
👉 Variables in an interface must be initialized → they are implicitly `public static final`.

✅ Correct:

```java
interface Shape {
    int x = 10; // constant
}
```

---

### ❌ Error 3: Multiple Inheritance Conflict

```java
interface A { default void show() { System.out.println("A"); } }
interface B { default void show() { System.out.println("B"); } }

class Test implements A, B {
    // ❌ conflict not resolved
}
```

**Error:** `class Test inherits unrelated defaults for show() from types A and B`

👉 Must explicitly override:

```java
class Test implements A, B {
    public void show() { A.super.show(); }
}
```

---

### ❌ Error 4: Interface Method with Body (Pre-Java 8)

```java
interface Shape {
    void draw() { System.out.println("Draw"); } // ❌ before Java 8
}
```

**Error:** `interface abstract methods cannot have body`

👉 Since Java 8 → only `default` or `static` methods may have body.

---

### ❌ Error 5: Functional Interface Violations

```java
@FunctionalInterface
interface Shape {
    void draw();
    void erase(); // ❌ more than one abstract method
}
```

**Error:** `Unexpected @FunctionalInterface annotation`

👉 Functional Interface = exactly **one abstract method**.

---

---

## 🔹 3. Key Takeaways

### Abstract Class Errors:

- Abstract methods cannot have a body.
- Must be implemented in subclass (unless subclass is abstract).
- Cannot be `private`, `final`, or `static`.
- Abstract classes cannot be instantiated.

### Interface Errors:

- Interfaces cannot have constructors.
- Variables are always `public static final`.
- Multiple inheritance conflict must be resolved manually.
- Before Java 8, methods cannot have body.
- Functional interface must have exactly 1 abstract method.

---

✅ **Day 21 complete** – We covered **all abstract & interface errors** in detail.
