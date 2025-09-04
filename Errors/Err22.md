**Day 22**.

---

# 📅 Day 22 – Java Exception Handling Errors

Today we’ll focus on **errors in try–catch–finally blocks**, and **checked vs unchecked exception handling**. This is a big area where beginners often struggle.

---

## 🔹 1. `try` Without `catch` or `finally`

✅ Correct:

```java
class Test {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        } catch(ArithmeticException e) {
            System.out.println("Error");
        }
    }
}
```

❌ Wrong:

```java
class Test {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        }
    }
}
```

**Error:** `try without catch or finally`

👉 Every `try` must be followed by **catch** or **finally** (or both).

---

## 🔹 2. `catch` Without `try`

```java
class Test {
    public static void main(String[] args) {
        catch(Exception e) { } // ❌ no try
    }
}
```

**Error:** `catch without try`

---

## 🔹 3. `finally` Without `try`

```java
class Test {
    public static void main(String[] args) {
        finally { System.out.println("End"); } // ❌ no try
    }
}
```

**Error:** `finally without try`

---

## 🔹 4. Order of Catch Blocks (Parent–Child Rule)

✅ Correct:

```java
try {
    int x = 10/0;
} catch(ArithmeticException e) {
    System.out.println("Arithmetic");
} catch(Exception e) {
    System.out.println("General");
}
```

❌ Wrong:

```java
try {
    int x = 10/0;
} catch(Exception e) {           // ❌ parent first
    System.out.println("General");
} catch(ArithmeticException e) { // unreachable
    System.out.println("Arithmetic");
}
```

**Error:** `exception ArithmeticException has already been caught`

👉 Always go from **child → parent**.

---

## 🔹 5. Unreachable Catch Block

If two `catch` blocks handle the **same exception type**, the second is unreachable.

```java
try {
    int x = 10/0;
} catch(ArithmeticException e) { }
catch(ArithmeticException e) { } // ❌ duplicate
```

**Error:** `exception ArithmeticException has already been caught`

---

## 🔹 6. Checked Exception Not Handled

✅ Correct:

```java
import java.io.*;

class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // ✅ handled
    }
}
```

❌ Wrong:

```java
import java.io.*;

class Test {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // ❌ unhandled IOException
    }
}
```

**Error:** `unreported exception IOException; must be caught or declared to be thrown`

👉 **Checked exceptions** must be either **caught** or **declared** with `throws`.

---

## 🔹 7. Throwing Checked Exception Without Handling

```java
class Test {
    public static void main(String[] args) {
        throw new Exception("Error"); // ❌ must be handled
    }
}
```

**Error:** `unreported exception Exception; must be caught or declared to be thrown`

---

## 🔹 8. Throwing `null`

```java
class Test {
    public static void main(String[] args) {
        throw null; // ❌ invalid
    }
}
```

**Error:** `incompatible types: <null> cannot be converted to Throwable`

---

## 🔹 9. Invalid Multi-Catch

✅ Correct:

```java
try {
    int x = 10/0;
} catch(ArithmeticException | NullPointerException e) {
    System.out.println("Caught");
}
```

❌ Wrong:

```java
try {
    int x = 10/0;
} catch(ArithmeticException | Exception e) { } // ❌ parent & child in one
```

**Error:** `Alternatives in a multi-catch statement cannot be related by subclassing`

---

## 🔹 10. Finally Block Errors

- `finally` always executes **even if exception occurs**, except for `System.exit(0)`.

❌ Wrong use:

```java
try {
    int x = 10/0;
} finally {
    int y = 5/0; // ❌ error thrown inside finally
}
```

👉 The **original exception is lost** because `finally` throws a new one.

---

## 🔹 11. Key Takeaways

- `try` must be followed by `catch` or `finally`.
- Catch blocks must be in **child → parent** order.
- **Duplicate or unreachable catch** is a compile error.
- **Checked exceptions** must be caught or declared.
- `throw null` and invalid multi-catch are compile errors.
- Errors inside `finally` can hide the original exception.

---

✅ **Day 22 complete** – We covered **all exception handling errors** (try–catch–finally + checked/unchecked).
