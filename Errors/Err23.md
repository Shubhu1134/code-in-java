**Day 23**.

---

# 📅 Day 23 – Errors in **Custom Exceptions**

Today we’ll cover all **common mistakes and compiler errors** when creating and using **user-defined exceptions**.

---

## 🔹 1. Custom Exception Must Extend `Throwable`

✅ Correct:

```java
class MyException extends Exception { // checked exception
    MyException(String msg) {
        super(msg);
    }
}
```

❌ Wrong:

```java
class MyException { } // ❌ does not extend Throwable

class Test {
    public static void main(String[] args) throws MyException {
        throw new MyException();
    }
}
```

**Error:** `incompatible types: MyException cannot be converted to Throwable`

👉 Every exception must extend **`Exception`** (checked) or **`RuntimeException`** (unchecked).

---

## 🔹 2. Checked Exception Must Be Declared or Caught

✅ Correct:

```java
class MyException extends Exception {
    MyException(String msg) { super(msg); }
}

class Test {
    public static void main(String[] args) throws MyException {
        throw new MyException("Custom error");
    }
}
```

❌ Wrong:

```java
class MyException extends Exception { }

class Test {
    public static void main(String[] args) {
        throw new MyException(); // ❌ unhandled checked exception
    }
}
```

**Error:** `unreported exception MyException; must be caught or declared to be thrown`

👉 Because `MyException` extends **Exception**, it’s **checked**.

---

## 🔹 3. Unchecked Exception

If you extend **`RuntimeException`**, you don’t need to declare it.

✅ Correct:

```java
class MyRuntimeEx extends RuntimeException {
    MyRuntimeEx(String msg) { super(msg); }
}

class Test {
    public static void main(String[] args) {
        throw new MyRuntimeEx("Unchecked error"); // ✅ no compiler error
    }
}
```

---

## 🔹 4. Wrong `throws` Declaration

❌ Wrong:

```java
class MyException extends Exception { }

class Test {
    public static void main(String[] args) throws Throwable { // ❌ too broad
        throw new MyException();
    }
}
```

**Error:** `unreported exception MyException; must be caught or declared to be thrown`

👉 You **cannot declare parent `Throwable`** unless you actually throw something of type `Throwable`.

---

## 🔹 5. Throwing Exception Without `new`

❌ Wrong:

```java
class MyException extends Exception { }

class Test {
    public static void main(String[] args) throws MyException {
        throw MyException("error"); // ❌ like method call
    }
}
```

**Error:** `cannot find symbol: method MyException(String)`

👉 Must use `new`:

```java
throw new MyException("error");
```

---

## 🔹 6. Catching Wrong Exception

```java
class MyException extends Exception { }

class Test {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch(RuntimeException e) {  // ❌ will not catch checked exception
            System.out.println("Caught");
        }
    }
}
```

👉 No compiler error, but **exception not caught at runtime** → program crashes.

---

## 🔹 7. Custom Exception Without Constructor

✅ Correct:

```java
class MyException extends Exception { }

class Test {
    public static void main(String[] args) throws MyException {
        throw new MyException(); // ✅ default constructor works
    }
}
```

❌ Wrong:

```java
class MyException extends Exception {
    MyException(String msg) { super(msg); }
}

class Test {
    public static void main(String[] args) throws MyException {
        throw new MyException(); // ❌ no default constructor
    }
}
```

**Error:** `constructor MyException in class MyException cannot be applied to given types`

---

## 🔹 8. Misusing `throw` vs `throws`

- **`throw`** → to throw an exception object.
- **`throws`** → in method declaration.

❌ Wrong:

```java
class Test {
    public static void main(String[] args) {
        throw Exception; // ❌ missing `new`
    }
}
```

**Error:** `cannot find symbol: variable Exception`

✅ Correct:

```java
throw new Exception("error");
```

---

## 🔹 9. Overriding Method Exception Rules

When overriding a method:

- You cannot throw a **broader checked exception**.
- You can throw the same or narrower.

```java
class Parent {
    void show() throws IOException { }
}

class Child extends Parent {
    @Override
    void show() throws Exception { } // ❌ broader
}
```

**Error:** `overridden method does not throw Exception`

✅ Correct:

```java
class Child extends Parent {
    @Override
    void show() throws FileNotFoundException { } // ✅ narrower
}
```

---

## 🔹 10. Key Takeaways

- Custom exception **must extend Throwable**.
- Checked exceptions must be **declared or caught**.
- Unchecked exceptions (`RuntimeException`) don’t need `throws`.
- Always use `new` with `throw`.
- Constructor mismatch can cause errors.
- Overriding methods cannot widen checked exceptions.

---

✅ **Day 23 complete** – We mastered **custom exception errors**.
