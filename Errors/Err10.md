## **Day 10**

# 📅 Day 10 – Errors in Nested Loops & Infinite Loops

### 1. **Infinite Loop (Unintentional)**

```java
class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ) {
            System.out.println(i);
            // forgot to increment i
        }
    }
}
```

❌ **Problem**: `i` never changes → infinite loop.
🔎 **Why**: Condition never becomes false.
✅ **Fix**:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

### 2. **Unreachable Statement Inside Loop**

```java
class Test {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Looping");
            break;
            System.out.println("Unreachable"); // ERROR
        }
    }
}
```

❌ **Error**: `error: unreachable statement`
🔎 **Why**: After `break`, control **cannot** reach next statement.

---

### 3. **Misusing Break/Continue**

```java
class Test {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            continue; // i never increments
            i++;
        }
    }
}
```

❌ **Problem**: Infinite loop, because `i++` is **never executed**.
✅ Fix: Put increment **before** `continue`.

---

### 4. **Nested Loops Misuse**

```java
class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; i++) { // BUG: i++ instead of j++
                System.out.println(i + " " + j);
            }
        }
    }
}
```

❌ **Problem**: Inner loop condition never progresses → infinite loop.
🔎 **Why**: Programmer used wrong increment variable.

---

### 5. **Label Misuse with Break/Continue**

```java
class Test {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) break outer;
            }
        }
        System.out.println("Exited outer loop");
    }
}
```

✅ Correct usage.
⚠️ Common mistake → using label name incorrectly:

```java
break wrongLabel; // ERROR: label not found
```

❌ **Error**: `error: undefined label: wrongLabel`

---
