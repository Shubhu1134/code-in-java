## **_ day 19 _**

# 📅 Day 19 – Java `this` and `super` Keyword Errors

Both `this` and `super` are very powerful in **OOP**, but if misused, they cause **compile-time errors**.
Today, we’ll analyze **all possible errors** related to these keywords.

---

## 🔹 1. Using `this` in Static Context

✅ Correct:

```java
class Test {
    int x = 10;
    void show() {
        System.out.println(this.x); // ✅ allowed in instance method
    }
}
```

❌ Wrong:

```java
class Test {
    int x = 10;
    public static void main(String[] args) {
        System.out.println(this.x); // ❌ ERROR
    }
}
```

**Error:** `non-static variable this cannot be referenced from a static context`

👉 `this` refers to the **current object** → static methods have **no object context**, so `this` is not allowed.

---

## 🔹 2. Calling Constructor with `this()` Incorrectly

✅ Correct:

```java
class Test {
    Test() { this(10); }
    Test(int x) { System.out.println(x); }
}
```

❌ Wrong (not first statement):

```java
class Test {
    Test() {
        System.out.println("Hello");
        this(10); // ❌ must be first statement
    }
    Test(int x) { }
}
```

**Error:** `call to this must be first statement in constructor`

---

## 🔹 3. Recursive `this()` Call

❌ Wrong:

```java
class Test {
    Test() {
        this(); // ❌ infinite recursion
    }
}
```

**Error:** `recursive constructor invocation`

---

## 🔹 4. Using `super` in Static Context

✅ Correct:

```java
class Parent {
    int x = 10;
}
class Child extends Parent {
    void show() {
        System.out.println(super.x); // ✅ access parent variable
    }
}
```

❌ Wrong:

```java
class Parent { }
class Child extends Parent {
    public static void main(String[] args) {
        System.out.println(super.toString()); // ❌ ERROR
    }
}
```

**Error:** `non-static variable super cannot be referenced from a static context`

👉 Like `this`, `super` is tied to **objects**, not `static`.

---

## 🔹 5. Calling `super()` Must Be First

✅ Correct:

```java
class Parent {
    Parent() { System.out.println("Parent"); }
}
class Child extends Parent {
    Child() {
        super(); // ✅ must be first
        System.out.println("Child");
    }
}
```

❌ Wrong:

```java
class Parent {
    Parent() { }
}
class Child extends Parent {
    Child() {
        System.out.println("Before super");
        super(); // ❌ ERROR
    }
}
```

**Error:** `call to super must be first statement in constructor`

---

## 🔹 6. No Parent Constructor Error

❌ Wrong:

```java
class Parent {
    Parent(int x) { }
}
class Child extends Parent {
    Child() {
        super(); // ❌ but parent has NO default constructor
    }
}
```

**Error:** `constructor Parent in class Parent cannot be applied to given types`

---

## 🔹 7. Using `super` Without Inheritance

❌ Wrong:

```java
class Test {
    void show() {
        super.toString(); // ❌ ERROR
    }
}
```

**Error:** `cannot use super in a class with no superclass`

👉 Every class has `Object` as parent, so `super` works only when inheritance exists.

---

## 🔹 8. Accessing Private Parent Members with `super`

✅ Parent private members **cannot** be accessed with `super`.

```java
class Parent {
    private int x = 10;
}
class Child extends Parent {
    void show() {
        System.out.println(super.x); // ❌ ERROR
    }
}
```

**Error:** `x has private access in Parent`

---

## 🔹 9. Using `this` Inside Constructor Call With `super()`

❌ Wrong:

```java
class Parent {
    Parent(int x) { }
}
class Child extends Parent {
    Child() {
        super(this.getValue()); // ❌ ERROR
    }
    int getValue() { return 10; }
}
```

**Error:** `cannot reference this before supertype constructor has been called`

👉 Because `this` is not available **before parent constructor executes**.

---

## 🔹 10. Key Takeaways

- `this` → refers to current object (not allowed in static).
- `super` → refers to parent (not allowed in static).
- `this()` and `super()` → must be **first statements** in constructors.
- Recursive `this()` → compile-time error.
- Parent’s **private members** cannot be accessed with `super`.
- Cannot use `this` before `super()` in constructor.

---
