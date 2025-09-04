**_ day 18 _**

---

# 📅 Day 18 – Java Constructor Errors

Constructors are **special methods** in Java used to initialize objects.
They look like methods but have unique rules — and if we violate them, we get **compile-time errors**.

Today we’ll cover **all possible constructor-related errors** with examples.

---

## 🔹 1. Constructor Name Errors

✅ Correct:

```java
class Test {
    Test() {  // constructor same as class name
        System.out.println("Hello");
    }
}
```

❌ Wrong:

```java
class Test {
    test() {   // looks like constructor but lowercase = treated as method
        System.out.println("Hello");
    }
}
```

**Error:** _No error at compile time, but this is NOT a constructor, just a method._
👉 Object won’t initialize as expected.

---

## 🔹 2. Constructor Cannot Have Return Type

✅ Correct:

```java
class Test {
    Test() { }
}
```

❌ Wrong:

```java
class Test {
    void Test() { } // ❌ this is a method, not constructor
}
```

👉 If we **add a return type**, even `void`, it becomes a **method**, not a constructor.

---

## 🔹 3. Missing Constructor (Default Constructor)

If you don’t define a constructor, Java creates a **default constructor**.
But if you define **any constructor**, Java won’t add the default one.

❌ Example:

```java
class Test {
    Test(int x) { }  // only parameterized constructor
}
class Main {
    public static void main(String[] args) {
        Test t = new Test(); // ❌ no default constructor
    }
}
```

**Error:** `constructor Test in class Test cannot be applied to given types`

---

## 🔹 4. Private Constructor Error

Used in **Singleton classes** or to prevent object creation.

```java
class Test {
    private Test() { }
}
class Main {
    public static void main(String[] args) {
        Test t = new Test(); // ❌ cannot access
    }
}
```

**Error:** `Test() has private access in Test`

---

## 🔹 5. Calling Constructor Directly

You cannot call a constructor like a method.

❌ Wrong:

```java
class Test {
    Test() { }
    public static void main(String[] args) {
        Test(); // ❌ error
    }
}
```

**Error:** `invalid method declaration; return type required`

✅ Correct way:

```java
class Test {
    Test() { }
    public static void main(String[] args) {
        Test t = new Test(); // ✅ object creation
    }
}
```

---

## 🔹 6. Recursive Constructor Invocation

Using `this()` incorrectly leads to infinite recursion.

❌ Wrong:

```java
class Test {
    Test() {
        this();  // ❌ constructor calling itself
    }
}
```

**Error:** `recursive constructor invocation`

✅ Correct:

```java
class Test {
    Test() { System.out.println("Default"); }
    Test(int x) { this(); System.out.println(x); } // ✅ safe
}
```

---

## 🔹 7. Superclass Constructor Error

If parent doesn’t have a **no-arg constructor**, child must explicitly call `super(...)`.

❌ Wrong:

```java
class Parent {
    Parent(int x) { }
}
class Child extends Parent {
    Child() { }  // ❌ compiler error
}
```

**Error:** `constructor Parent in class Parent cannot be applied to given types`

✅ Fix:

```java
class Child extends Parent {
    Child() { super(10); }
}
```

---

## 🔹 8. Abstract Class Constructor Error

Abstract classes **can have constructors**, but you can’t instantiate them.

❌ Wrong:

```java
abstract class Test {
    Test() { }
}
class Main {
    public static void main(String[] args) {
        Test t = new Test(); // ❌ cannot create object
    }
}
```

**Error:** `Test is abstract; cannot be instantiated`

---

## 🔹 9. Interface Constructor Error

Interfaces **cannot** have constructors.

❌ Wrong:

```java
interface Test {
    Test() { } // ❌ not allowed
}
```

**Error:** `modifier public not allowed here`

---

## 🔹 10. Key Takeaways

- Constructor = same name as class, **no return type**.
- If **no constructor defined → compiler gives default**.
- If **any constructor defined → no default added**.
- Can be **private**, but not called outside.
- Cannot call constructor directly (only via `new`).
- `this()` and `super()` must be **first statements** in a constructor.
- Interfaces cannot have constructors.

---
