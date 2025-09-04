**Day 9**.
Today’s focus: **Exception Handling Errors (Part 1 – Basics)** → structure of `try-catch-finally`, order of catches, `throw` vs `throws`, checked vs unchecked.

---

# 📅 **Day 9 – Exception Handling Errors (Part 1)**

---

## 🔹 **Error 1: `try` without `catch` or `finally`**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        }
    }
}
```

**Compiler Error:**

```
error: 'try' without 'catch', 'finally' or resource declarations
```

**Why?**

- A `try` block **must** be followed by either `catch` or `finally`.

✅ **Fix:**

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Divide by zero");
}
```

---

## 🔹 **Error 2: `catch` without `try`**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        catch(Exception e) {
            System.out.println("error");
        }
    }
}
```

**Compiler Error:**

```
error: 'catch' without 'try'
```

**Why?**

- `catch` block must always be linked to a `try`.

✅ **Fix:** Put inside a `try-catch` structure.

---

## 🔹 **Error 3: Unreachable `catch` block (parent before child)**

**Code:**

```java
try {
    int x = 10 / 0;
} catch (Exception e) {
    System.out.println("General");
} catch (ArithmeticException e) {
    System.out.println("Specific");
}
```

**Compiler Error:**

```
error: exception ArithmeticException has already been caught
```

**Why?**

- `Exception` (parent) is caught before `ArithmeticException` (child).
- Child block is unreachable.

✅ **Fix:** Order from **child → parent**.

```java
catch (ArithmeticException e) { ... }
catch (Exception e) { ... }
```

---

## 🔹 **Error 4: Unhandled checked exception**

**Code:**

```java
import java.io.*;

public class Test {
    public static void main(String[] args) {
        FileReader fr = new FileReader("abc.txt"); // checked exception
    }
}
```

**Compiler Error:**

```
error: unreported exception FileNotFoundException; must be caught or declared to be thrown
```

**Why?**

- `FileReader` constructor throws **checked exception**.
- Must handle with `try-catch` or declare with `throws`.

✅ **Fix 1 – try-catch:**

```java
try {
    FileReader fr = new FileReader("abc.txt");
} catch (FileNotFoundException e) {
    System.out.println("File not found");
}
```

✅ **Fix 2 – throws:**

```java
public static void main(String[] args) throws FileNotFoundException {
    FileReader fr = new FileReader("abc.txt");
}
```

---

## 🔹 **Error 5: Using `throw` without an exception object**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        throw;  // invalid
    }
}
```

**Compiler Error:**

```
error: not a statement
```

**Why?**

- `throw` must be followed by a **new Exception object**.

✅ **Fix:**

```java
throw new RuntimeException("Something went wrong");
```

---

## 🔹 **Error 6: `throw` vs `throws` confusion**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        throws new Exception("error");  // invalid
    }
}
```

**Compiler Error:**

```
error: illegal start of expression
```

**Why?**

- `throw` = used inside method to actually throw an exception.
- `throws` = used in method signature to declare possible exceptions.

✅ **Fix:**

```java
public static void main(String[] args) throws Exception {
    throw new Exception("error");
}
```

---

## 🔹 **Error 7: Finally block return confusion**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        System.out.println(method());
    }
    static int method() {
        try {
            return 1;
        } finally {
            return 2; // overrides try return
        }
    }
}
```

**No compiler error, but Logical Trap.**
👉 Output = `2` (finally return always overrides try return).

---

## 🔹 **Error 8: Catching unrelated types (pre-Java 7)**

**Code:**

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException | NullPointerException e) { // multi-catch
    System.out.println("Error");
}
```

✅ Works in Java 7+,
❌ Error in Java 6 or lower.

**Compiler Error (Java 6):**

```
error: '|' not valid in catch block
```

---

# ✅ Day 9 Summary – Exception Handling Errors (Part 1)

| Error                         | Type         | Message                                               |                              |
| ----------------------------- | ------------ | ----------------------------------------------------- | ---------------------------- |
| `try` without `catch/finally` | Compile-time | `'try' without 'catch', 'finally'...`                 |                              |
| `catch` without `try`         | Compile-time | `'catch' without 'try'`                               |                              |
| Wrong catch order             | Compile-time | `exception ... has already been caught`               |                              |
| Unhandled checked exception   | Compile-time | `unreported exception ... must be caught or declared` |                              |
| `throw` without object        | Compile-time | `not a statement`                                     |                              |
| `throw` vs `throws` misuse    | Compile-time | `illegal start of expression`                         |                              |
| `finally` overrides return    | Logical      | No error, wrong assumption                            |                              |
| Multi-catch in old Java       | Compile-time | \`'                                                   | ' not valid in catch block\` |

---
