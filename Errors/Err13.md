**_ day 13 _**

---

# 📅 Day 13 – Errors in Class & Object Definitions

---

## 🔹 1. **Filename vs Public Class Name Mismatch**

```java
// File: MyTest.java
public class Test {   // ❌ ERROR
    public static void main(String[] args) {}
}
```

❌ **Error**:
`error: class Test is public, should be declared in a file named Test.java`

🔎 **Why**: If a class is `public`, its name **must match the filename**.

✅ Fix:

- Either rename file → `Test.java`,
- Or remove `public`.

---

## 🔹 2. **Multiple Public Classes in One File**

```java
public class A {}
public class B {}   // ❌ ERROR
```

❌ **Error**:
`error: class B is public, should be declared in a file named B.java`

🔎 **Why**: Only **one public class per file** is allowed.

---

## 🔹 3. **Class Without `main` Method**

```java
class Test {}
```

⚠️ Compiles fine, but when running:

```sh
java Test
```

❌ **Error at runtime**:
`Error: Main method not found in class Test, please define the main method as: public static void main(String[] args)`

🔎 **Why**: JVM needs `public static void main(String[] args)` as entry point.

---

## 🔹 4. **Static Context Cannot Reference Non-Static**

```java
class Test {
    int x = 10;
    public static void main(String[] args) {
        System.out.println(x); // ❌ ERROR
    }
}
```

❌ **Error**:
`error: non-static variable x cannot be referenced from a static context`

🔎 **Why**: `main` is static, belongs to class. `x` belongs to object.

✅ Fix:

```java
Test t = new Test();
System.out.println(t.x);
```

---

## 🔹 5. **Illegal Class Modifiers**

```java
private class Test {}   // ❌ ERROR
```

❌ **Error**:
`modifier private not allowed here`

🔎 **Why**: A **top-level class** can only be `public`, `abstract`, or `final`.

---

## 🔹 6. **Duplicate Class Definitions**

```java
class Test {}
class Test {}   // ❌ ERROR
```

❌ **Error**:
`error: duplicate class: Test`

🔎 **Why**: Two classes with the same name in the same package are not allowed.

---

## 🔹 7. **Instance Creation Without Constructor**

```java
class Test {
    private Test() {}  // ❌ private constructor
    public static void main(String[] args) {
        Test t = new Test(); // ERROR
    }
}
```

❌ **Error**:
`Test() has private access in Test`

🔎 **Why**: Constructor is private → cannot be called outside.

---

# ✅ Day 13 Summary

- Public class name must match filename.
- Only one `public` class per file.
- Missing `main` → runtime error.
- Static context cannot access instance variables.
- Illegal class modifiers.
- Duplicate class names.
- Private constructor blocking object creation.

---
