**Day 20**.

---

# 📅 Day 20 – Java Method Overloading & Overriding Errors

Today we cover **all errors possible in method overloading and overriding** — the two pillars of **OOP polymorphism**.

---

## 🔹 1. Method Overloading Errors

**Definition:** Same method name, different parameter list (number or type).

✅ Correct:

```java
class Test {
    void show(int x) { System.out.println("int"); }
    void show(String s) { System.out.println("String"); }
}
```

---

### ❌ Error 1: Same Parameters → Duplicate Method

```java
class Test {
    void show(int x) { }
    void show(int y) { } // ❌ same signature
}
```

**Error:** `method show(int) is already defined in class Test`

👉 Overloading requires a **different parameter list**, not just variable names.

---

### ❌ Error 2: Ambiguous Call

```java
class Test {
    void show(int x, long y) { }
    void show(long x, int y) { }
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10, 10); // ❌ compiler confusion
    }
}
```

**Error:** `reference to show is ambiguous`

👉 Compiler can’t decide which method to call.

---

### ❌ Error 3: Return Type Alone Doesn’t Differentiate

```java
class Test {
    int show() { return 1; }
    double show() { return 2.0; } // ❌ same parameters
}
```

**Error:** `method show() is already defined in class Test`

👉 Return type doesn’t count for overloading.

---

---

## 🔹 2. Method Overriding Errors

**Definition:** Child class method has the **same name, parameters, and return type** as parent.

✅ Correct:

```java
class Parent {
    void display() { }
}
class Child extends Parent {
    @Override
    void display() { } // ✅ override
}
```

---

### ❌ Error 1: Return Type Mismatch

```java
class Parent {
    int display() { return 1; }
}
class Child extends Parent {
    @Override
    double display() { return 2.0; } // ❌ mismatch
}
```

**Error:** `display() in Child cannot override display() in Parent`
👉 Only **covariant return types** allowed (child class of parent’s return type).

---

### ❌ Error 2: Weaker Access Privileges

```java
class Parent {
    public void display() { }
}
class Child extends Parent {
    @Override
    private void display() { } // ❌ weaker access
}
```

**Error:** `attempting to assign weaker access privileges; was public`

👉 You can make access **more visible**, but not less.

---

### ❌ Error 3: Static Method Overriding (Method Hiding)

```java
class Parent {
    static void display() { }
}
class Child extends Parent {
    @Override
    static void display() { } // ❌ cannot override static
}
```

**Error:** `method does not override or implement a method from a supertype`

👉 Static methods are **hidden, not overridden**.

---

### ❌ Error 4: Final Method Overriding

```java
class Parent {
    final void display() { }
}
class Child extends Parent {
    @Override
    void display() { } // ❌ not allowed
}
```

**Error:** `display() in Child cannot override display() in Parent; overridden method is final`

---

### ❌ Error 5: Private Method Overriding

```java
class Parent {
    private void display() { }
}
class Child extends Parent {
    @Override
    void display() { } // ❌ not actually overriding
}
```

**Error:** No compiler error, but **this is NOT overriding** → it’s a new method.
👉 Because parent’s private methods are not inherited.

---

### ❌ Error 6: Throws Clause Incompatibility

```java
class Parent {
    void display() throws Exception { }
}
class Child extends Parent {
    @Override
    void display() throws Throwable { } // ❌ broader exception
}
```

**Error:** `overridden method does not throw Throwable`

👉 In overriding, child cannot throw **new/broader checked exceptions**.

---

---

## 🔹 3. Annotation `@Override` Errors

❌ Wrong:

```java
class Test {
    void show(int x) { }
    @Override
    void show(String s) { } // ❌ not overriding, only overloading
}
```

**Error:** `method does not override or implement a method from a supertype`

👉 `@Override` works only if method matches parent.

---

---

## 🔹 4. Key Takeaways

### Overloading Errors:

- Same signature → duplicate method.
- Return type difference not enough.
- Ambiguous calls cause compile errors.

### Overriding Errors:

- Must match parameter list + return type (covariant allowed).
- Access level cannot be weaker.
- Final & private methods cannot be overridden.
- Static methods are hidden, not overridden.
- Throws clause must be same or narrower.

---

✅ **Day 20 complete** – Covered **all errors in overloading & overriding**.
