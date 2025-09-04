**Day 11**

# 📅 Day 11 – Errors in `switch-case`

---

### 1. **Type Restriction on Switch Expression**

```java
class Test {
    public static void main(String[] args) {
        double d = 2.0;
        switch (d) {   // ❌ ERROR
            case 2.0: System.out.println("Two");
        }
    }
}
```

❌ **Error**: `incompatible types: possible lossy conversion from double to int`
🔎 **Why**: Before Java 7 → only `byte, short, char, int, enum`.
From Java 7 → `String` also allowed.
But **float/double/long/boolean** ❌ not allowed.

✅ Fix: Use `int`, `char`, `String`, or enum.

---

### 2. **Duplicate Case Labels**

```java
class Test {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1: System.out.println("One");
            case 1: System.out.println("Duplicate"); // ❌ ERROR
        }
    }
}
```

❌ **Error**: `error: duplicate case label`
🔎 **Why**: Case labels must be unique.

---

### 3. **Case Constant Must Be Compile-Time Constant**

```java
class Test {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        switch (x) {
            case y: System.out.println("Y"); // ❌ ERROR
        }
    }
}
```

❌ **Error**: `constant expression required`
🔎 **Why**: Case labels must be **final compile-time constants**.
✅ Fix:

```java
final int y = 2;
switch (x) {
    case y: System.out.println("Y"); // ✅ Works
}
```

---

### 4. **Fallthrough Without Break**

```java
class Test {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1: System.out.println("One");
            case 2: System.out.println("Two");
        }
    }
}
```

⚠️ **Problem**: Not a compile-time error, but logic bug → executes case 1 & 2 both.
🔎 **Why**: Missing `break`.

✅ Fix: Add `break`.

---

### 5. **Default Placement Confusion**

```java
class Test {
    public static void main(String[] args) {
        int x = 5;
        switch (x) {
            default: System.out.println("Default"); // Works anywhere
            case 1: System.out.println("One");
        }
    }
}
```

⚠️ No **error**, but tricky.
👉 `default` can appear anywhere, but executes only if no match (unless fall-through).

---

### 6. **Switch Expression in Java 14+ (Modern Error)**

```java
class Test {
    public static void main(String[] args) {
        int day = 1;
        String result = switch(day) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            // ❌ Missing default
        };
    }
}
```

❌ **Error**: `error: the switch expression does not cover all possible input values`
🔎 **Why**: Switch **expression** must handle **all possible values** (use `default`).

---

# ✅ Day 11 Summary

- Switch supports limited types (`int`, `char`, `String`, `enum`).
- Duplicate `case` ❌ not allowed.
- Case labels must be **compile-time constants**.
- Missing `break` causes fall-through.
- `default` works anywhere but may confuse.
- Switch expressions (Java 14+) must cover all inputs.

---
