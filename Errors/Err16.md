**Day 16**

---

# 📅 Day 16 – Errors in Constructor Chaining & Overloading

---

## 🔹 1. **Overloading vs Method Mistaken for Constructor**

```java
class Test {
    void Test() { // ❌ This is a method, not a constructor
        System.out.println("Method, not constructor");
    }
    public static void main(String[] args) {
        new Test(); // ✅ Compiles, but constructor is hidden (default one)
    }
}
```

⚠️ **Logic bug**: Developer thinks they defined a constructor, but actually created a method.

---

## 🔹 2. **Ambiguous Constructor Overloading**

```java
class Test {
    Test(int x, double y) {}
    Test(double x, int y) {}
    public static void main(String[] args) {
        new Test(10, 20); // ❌ ERROR
    }
}
```

❌ **Error**:
`reference to Test is ambiguous`

🔎 **Why**: Both constructors match `(int, int)` with type promotion.

✅ Fix: Use explicit cast.

---

## 🔹 3. **Chaining `this()` and `super()` Together**

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

🔎 **Why**: You can only call **one of `this()` or `super()`**, and it must be the **first line**.

---

## 🔹 4. **Recursive Constructor Invocation**

```java
class Test {
    Test() {
        this();  // ❌ ERROR → infinite recursion
    }
}
```

❌ **Error**:
`recursive constructor invocation`

🔎 **Why**: Constructor ends up calling itself infinitely.

---

## 🔹 5. **Wrong Order of Statements in Constructor**

```java
class Test {
    int x;
    Test() {
        System.out.println("Hello");
        this(5);  // ❌ ERROR
    }
    Test(int a) { x = a; }
}
```

❌ **Error**:
`call to this must be first statement in constructor`

🔎 **Why**: `this()` / `super()` must always come **before any statement**.

---

## 🔹 6. **Private Constructor Blocks Chaining**

```java
class Test {
    private Test(int x) {}
    Test() {
        this(5);  // ❌ ERROR
    }
}
```

❌ **Error**:
`Test(int) has private access in Test`

🔎 **Why**: You cannot chain to a private constructor unless inside same class.

---

## 🔹 7. **Checked Exception in Constructor Chain**

```java
class Test {
    Test() throws Exception {
        this(5); // ❌ ERROR
    }
    Test(int x) throws Exception {
        throw new Exception("Error");
    }
}
```

❌ **Error**:
`unreported exception Exception; must be caught or declared to be thrown`

🔎 **Why**: If one constructor throws a checked exception, any constructor chaining into it must also declare/handle it.

---

# ✅ Day 16 Summary

- Methods with same name as class but with return type ≠ constructor.
- Ambiguous constructor overloading with type promotion.
- Only **one** of `this()` or `super()`, and always first line.
- Recursive constructor calls not allowed.
- `this()` / `super()` cannot come after any statements.
- Private constructor may break chaining.
- Checked exception in one constructor → must propagate in all chains.

---
