**Day 30**.

---

# 📅 Day 30 – Errors in **Exception Hierarchy & Advanced Exception Handling**

Java’s exception handling has **checked**, **unchecked**, and **error classes**. Misusing them causes compile-time or runtime errors. Today we’ll go deep.

---

## 🔹 1. Checked vs Unchecked Exception

- **Checked:** must be **caught** or **declared** (`IOException`, `SQLException`)
- **Unchecked:** optional catch (`RuntimeException`, `NullPointerException`)

❌ Wrong:

```java
void readFile() {
    FileReader fr = new FileReader("test.txt"); // ❌ unhandled
}
```

**Error:** `unreported exception FileNotFoundException`

✅ Correct:

```java
void readFile() throws FileNotFoundException { }
```

or

```java
try { FileReader fr = new FileReader("test.txt"); }
catch (FileNotFoundException e) { e.printStackTrace(); }
```

---

## 🔹 2. Catching Subclass After Superclass

❌ Wrong:

```java
try {
    int a = 5/0;
} catch (ArithmeticException e) {
    System.out.println("Divide by zero");
} catch (Exception e) { // ❌ unreachable
    System.out.println("Exception");
}
```

**Error:** `exception ArithmeticException has already been caught`

✅ Correct: **child first, then parent**

---

## 🔹 3. Try Without Catch or Finally

❌ Wrong:

```java
try { int a = 5; } // ❌ no catch/finally
```

**Error:** `‘try’ without ‘catch’, ‘finally’ or resource specification`

✅ Fix:

```java
try { int a = 5; } catch(Exception e) { }
```

or

```java
try (BufferedReader br = new BufferedReader(new FileReader("f"))) { }
```

---

## 🔹 4. Throwing Non-Throwable

❌ Wrong:

```java
throw "Error"; // ❌ string cannot be thrown
```

**Error:** `incompatible types: java.lang.String cannot be converted to Throwable`

✅ Fix: throw **Throwable subclass**:

```java
throw new Exception("Error");
```

---

## 🔹 5. Multiple Exceptions in One Catch (Java 7+)

✅ Correct:

```java
try {
    int[] arr = new int[5];
    arr[10] = 5;
} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
    e.printStackTrace();
}
```

❌ Wrong: mixing **parent and child exception**

```java
catch (Exception | ArithmeticException e) { } // ❌
```

**Error:** `exception ArithmeticException is already handled by Exception`

---

## 🔹 6. Finally Block Errors

- Finally **always executes** (except `System.exit()` or JVM crash).

❌ Wrong:

```java
try { return; } finally { return; } // ❌
```

**Logical Error:** original return ignored → confusing behavior

✅ Fix: avoid `return` in finally

---

## 🔹 7. Suppressed Exceptions (try-with-resources)

✅ Correct:

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    throw new Exception("Try Exception");
} catch(Exception e) {
    e.printStackTrace();
}
```

- If `br.close()` throws → exception is **suppressed**, stored in `e.getSuppressed()`.

---

## 🔹 8. Throwing Checked Exception in Overridden Method

❌ Wrong:

```java
class Parent {
    void show() throws IOException {}
}
class Child extends Parent {
    void show() throws Exception {} // ❌ broader
}
```

**Error:** cannot override with broader checked exception

✅ Correct: same or narrower exception.

---

## 🔹 9. RuntimeException Errors

- **NullPointerException**
- **ArrayIndexOutOfBoundsException**
- **ArithmeticException**
- **ClassCastException**
- **IllegalArgumentException**

❌ Wrong:

```java
String s = null;
s.length(); // ❌ NPE
```

---

## 🔹 10. Key Takeaways

- ✅ Checked → must handle; Unchecked → optional.
- ✅ Catch **child before parent**.
- ✅ Try must have **catch/finally** unless try-with-resources.
- ✅ Only **Throwable** objects can be thrown.
- ✅ Avoid `return` in finally (logical confusion).
- ✅ Suppressed exceptions are stored automatically in try-with-resources.

---

✅ **Day 30 complete** – You now understand **all advanced exception handling errors**.

---
