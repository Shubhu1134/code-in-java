---
# 📅 Day 14 – Errors in Constructors
---

## 🔹 1. **Constructor With Return Type**

```java
class Test {
    void Test() {   // ❌ Looks like constructor, but has return type
        System.out.println("Not a constructor");
    }
}
```

✅ Compiles fine, but **this is not a constructor**, it’s a method.
⚠️ Common logic bug: programmer thinks it’s a constructor.

🔎 **Why**: Constructors **cannot have return type** (not even `void`).

---

## 🔹 2. **Missing Default Constructor**

```java
class Test {
    Test(int x) {}  // parameterized constructor only
    public static void main(String[] args) {
        Test t = new Test();  // ❌ ERROR
    }
}
```

❌ **Error**:
`error: constructor Test in class Test cannot be applied to given types`

🔎 **Why**: When you define a parameterized constructor, Java does **not** create a default one.

✅ Fix: Manually add a no-arg constructor.

---

## 🔹 3. **Private Constructor (Restricted Access)**

```java
class Test {
    private Test() {}
    public static void main(String[] args) {
        Test t = new Test(); // ❌ ERROR inside main
    }
}
```

❌ **Error**:
`Test() has private access in Test`

🔎 **Why**: Private constructor cannot be called outside the class (used in **Singleton pattern**).

---

## 🔹 4. **Calling `this()` or `super()` Incorrectly**

```java
class A {
    A(int x) {}
}
class B extends A {
    B() {
        this(5);
        super(10);  // ❌ ERROR
    }
    B(int y) { super(y); }
}
```

❌ **Error**:
`call to super must be first statement in constructor`

🔎 **Why**: `this()` or `super()` must be the **first statement** in a constructor, and only one can be used.

---

## 🔹 5. **Recursive Constructor Invocation**

```java
class Test {
    Test() {
        this();  // ❌ ERROR → infinite loop if allowed
    }
}
```

❌ **Error**:
`recursive constructor invocation`

🔎 **Why**: A constructor cannot directly/indirectly call itself.

---

## 🔹 6. **Abstract/Final Constructor**

```java
class Test {
    abstract Test() {}   // ❌ ERROR
}
```

❌ **Error**:
`modifier abstract not allowed here`

🔎 **Why**: Constructors cannot be `abstract`, `static`, `final`, or `synchronized`.

---

## 🔹 7. **Exception in Constructor Without Declaration**

```java
class Test {
    Test() {
        throw new Exception("Error"); // ❌ ERROR
    }
}
```

❌ **Error**:
`unreported exception Exception; must be caught or declared to be thrown`

🔎 **Why**: If constructor throws a **checked exception**, it must be declared.

✅ Fix:

```java
Test() throws Exception {
    throw new Exception("Error");
}
```

---

# ✅ Day 14 Summary

- Constructors **cannot have return types**.
- If you declare a parameterized constructor → Java won’t add a default one.
- `this()` / `super()` must be the **first line**, and only one can be used.
- Recursive constructor invocation is illegal.
- Constructors cannot be `abstract`, `static`, or `final`.
- Checked exceptions in constructor → must be declared.

---
