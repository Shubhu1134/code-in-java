

---

# 📅 **Day 5 – Method-Related Errors**

---

### 🔹 **Error 1: Return type mismatch**

**Code:**

```java
public class Test {
    public static int add() {
        return "hello";   // invalid return type
    }
}
```

**Compiler Error:**

```
error: incompatible types: String cannot be converted to int
```

**Why?**

* Declared return type = `int`.
* Returned value = `String`.
* Types don’t match.

✅ **Fix:**

```java
public static int add() {
    return 10;
}
```

---

### 🔹 **Error 2: Missing return statement (method level)**

**Code:**

```java
public class Test {
    public static int check(int x) {
        if (x > 0) {
            return 1;
        }
        // missing return for x <= 0
    }
}
```

**Compiler Error:**

```
error: missing return statement
```

**Why?**

* Non-void methods must **return something for all paths**.

✅ **Fix:**

```java
public static int check(int x) {
    if (x > 0) return 1;
    else return -1;
}
```

---

### 🔹 **Error 3: Duplicate method (same signature)**

**Code:**

```java
public class Test {
    public void display(int a) {}
    public void display(int a) {}  // duplicate
}
```

**Compiler Error:**

```
error: method display(int) is already defined in class Test
```

**Why?**

* Method **signature (name + parameters)** must be unique.

✅ **Fix:** Change parameters or method name.

```java
public void display(int a) {}
public void display(double a) {} // valid overloading
```

---

### 🔹 **Error 4: Static vs Instance context**

**Code:**

```java
public class Test {
    public void show() {
        System.out.println("Instance");
    }
    public static void main(String[] args) {
        show();   // invalid
    }
}
```

**Compiler Error:**

```
error: non-static method show() cannot be referenced from a static context
```

**Why?**

* `main` is static (class-level).
* `show()` is instance method (object-level).

✅ **Fix:**

```java
new Test().show();
```

---

### 🔹 **Error 5: Ambiguous method call (overloading issue)**

**Code:**

```java
public class Test {
    public void print(Object o) {}
    public void print(String s) {}
    public static void main(String[] args) {
        new Test().print(null);  // ambiguous
    }
}
```

**Compiler Error:**

```
error: reference to print is ambiguous
```

**Why?**

* `null` can match both `Object` and `String`.
* Compiler cannot decide which method to call.

✅ **Fix:** Cast explicitly.

```java
new Test().print((String) null);
```

---

### 🔹 **Error 6: Override return type mismatch**

**Code:**

```java
class Parent {
    public int getValue() { return 10; }
}
class Child extends Parent {
    public String getValue() { return "hello"; } // invalid
}
```

**Compiler Error:**

```
error: getValue() in Child cannot override getValue() in Parent
  return type String is not compatible with int
```

**Why?**

* Overriding requires **same return type** (or a covariant type).

✅ **Fix:**

```java
public int getValue() { return 20; }
```

---

### 🔹 **Error 7: Constructor/method confusion**

**Code:**

```java
class Test {
    public void Test() {   // looks like constructor, but it’s a method
        System.out.println("This is not a constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        Test t = new Test(); // no constructor defined → compiler adds default
    }
}
```

**No compiler error, but logical error.**
👉 Many beginners think this is a **constructor**, but it’s just a method with return type `void`.

✅ **Fix:** Remove return type for constructor.

```java
public Test() { 
    System.out.println("Real constructor");
}
```

---

# ✅ Day 5 Summary – Method Errors

1. **Return type mismatch** → `incompatible types`
2. **Missing return statement** → `missing return statement`
3. **Duplicate method** → `method ... is already defined`
4. **Static vs Instance context** → `non-static method cannot be referenced from a static context`
5. **Ambiguous method call** → `reference ... is ambiguous`
6. **Override return type mismatch** → `return type ... is not compatible`
7. **Constructor mistaken as method** → *logical mistake*

---

