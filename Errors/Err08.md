**Day 8**.
Today’s focus: **Interface & Abstract Class Errors** → functional interfaces, multiple default methods, ambiguity, missing `@Override`, static method hiding, illegal modifiers, etc.

---

# 📅 **Day 8 – Interface & Abstract Class Errors**

---

## 🔹 **Error 1: Interface cannot have instance variables**

**Code:**

```java
interface Test {
    int x; // invalid
}
```

**Compiler Error:**

```
error: = expected
```

**Why?**

- In interface, all variables are **public static final** by default.
- Must be initialized.

✅ **Fix:**

```java
interface Test {
    int x = 10;
}
```

---

## 🔹 **Error 2: Multiple default methods conflict**

**Code:**

```java
interface A {
    default void hello() { System.out.println("A"); }
}
interface B {
    default void hello() { System.out.println("B"); }
}
class C implements A, B {}  // conflict
```

**Compiler Error:**

```
error: class C inherits unrelated defaults for hello() from types A and B
```

**Why?**

- Two interfaces provide same default method → ambiguity.

✅ **Fix:** Override and resolve explicitly:

```java
class C implements A, B {
    public void hello() {
        A.super.hello(); // or B.super.hello()
    }
}
```

---

## 🔹 **Error 3: Interface static method is hidden, not overridden**

**Code:**

```java
interface A {
    static void show() { System.out.println("A"); }
}
class B implements A {
    public static void show() { System.out.println("B"); }
}
```

**No error**, but ❌ **not overriding**.

- Static methods in interface **cannot be overridden**, only hidden.
- Must be called using interface name → `A.show()`.

---

## 🔹 **Error 4: Functional interface with 2 abstract methods**

**Code:**

```java
@FunctionalInterface
interface MyFunc {
    void fun1();
    void fun2(); // invalid
}
```

**Compiler Error:**

```
error: Unexpected @FunctionalInterface annotation
  multiple non-overriding abstract methods found in interface MyFunc
```

**Why?**

- A functional interface must have exactly **one abstract method**.

✅ **Fix:**

```java
@FunctionalInterface
interface MyFunc {
    void fun1();
}
```

---

## 🔹 **Error 5: Abstract class instantiation**

**Code:**

```java
abstract class Shape {}
public class Test {
    public static void main(String[] args) {
        Shape s = new Shape();  // invalid
    }
}
```

**Compiler Error:**

```
error: Shape is abstract; cannot be instantiated
```

**Why?**

- Abstract classes cannot be directly created.

✅ **Fix:**

- Create subclass, or use anonymous class.

```java
Shape s = new Shape() {}; // anonymous
```

---

## 🔹 **Error 6: Abstract method with body**

**Code:**

```java
abstract class Test {
    abstract void run() {
        System.out.println("Running");
    }
}
```

**Compiler Error:**

```
error: abstract methods cannot have a body
```

**Why?**

- Abstract methods only declare signature, no implementation.

✅ **Fix:**

```java
abstract void run();
```

---

## 🔹 **Error 7: Class not abstract but missing abstract method**

**Code:**

```java
abstract class Parent {
    abstract void draw();
}
class Child extends Parent { } // forgot to implement
```

**Compiler Error:**

```
error: Child is not abstract and does not override abstract method draw() in Parent
```

**Why?**

- Any concrete class must implement all abstract methods.

✅ **Fix:**

```java
class Child extends Parent {
    void draw() { System.out.println("Drawing"); }
}
```

---

## 🔹 **Error 8: Illegal modifiers in interface methods**

**Code:**

```java
interface A {
    protected void hello();  // invalid
}
```

**Compiler Error:**

```
error: modifier protected not allowed here
```

**Why?**

- In interface → methods are implicitly `public abstract`.
- Cannot use `protected`, `private` (until Java 9), or `final`.

✅ **Fix:**

```java
public void hello();
```

---

## 🔹 **Error 9: Diamond problem with interfaces**

**Code:**

```java
interface A { default void show() { System.out.println("A"); } }
interface B { default void show() { System.out.println("B"); } }
class C implements A, B {}  // conflict
```

**Compiler Error:**

```
error: class C inherits unrelated defaults for show() from types A and B
```

**Why?**

- Same default method in multiple interfaces → must resolve manually.

✅ **Fix:**

```java
class C implements A, B {
    public void show() {
        A.super.show();
    }
}
```

---

# ✅ Day 8 Summary – Interface & Abstract Errors

| Error                                 | Type         | Message                                         |
| ------------------------------------- | ------------ | ----------------------------------------------- |
| Interface variable without init       | Compile-time | `= expected`                                    |
| Default method conflict               | Compile-time | `inherits unrelated defaults`                   |
| Interface static method override      | Logical      | Hidden, not overridden                          |
| Functional interface multiple methods | Compile-time | `Unexpected @FunctionalInterface`               |
| Abstract class instantiation          | Compile-time | `... is abstract; cannot be instantiated`       |
| Abstract method with body             | Compile-time | `abstract methods cannot have a body`           |
| Missing abstract method in subclass   | Compile-time | `... is not abstract and does not override ...` |
| Illegal modifiers in interface        | Compile-time | `modifier ... not allowed`                      |
| Diamond problem with interfaces       | Compile-time | `inherits unrelated defaults`                   |

---
