### 📅 Day 17 – Java Error Handling Roadmap (Advanced Flow Control: `break`, `continue`, `return`)

Now we move deeper into **control flow**. Today, we’ll analyze errors related to **`break`, `continue`, and `return` statements**. These are small keywords but can cause **compile-time** and **runtime** errors if misused.

---

## 🔹 1. `break` Statement Errors

The `break` is used to exit from a **loop** or **switch**.

### ✅ Valid Example:

```java
class Test {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            if(i == 2) break;
            System.out.println(i);
        }
    }
}
```

### ❌ Errors:

1. **Illegal break outside loop/switch**

```java
class Test {
    public static void main(String[] args) {
        break;  // ❌ Compile-time error
    }
}
```

**Error:** `break outside switch or loop`
👉 `break` must only be used inside a **loop** (`for`, `while`, `do-while`) or \*\*switch\`.

---

## 🔹 2. `continue` Statement Errors

The `continue` skips the rest of the loop iteration and goes to the **next iteration**.

### ✅ Valid Example:

```java
class Test {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            if(i == 2) continue;
            System.out.println(i);
        }
    }
}
```

### ❌ Errors:

1. **Illegal continue outside loop**

```java
class Test {
    public static void main(String[] args) {
        continue;  // ❌ Compile-time error
    }
}
```

**Error:** `continue outside of loop`
👉 `continue` is only allowed inside **loops**, not in `switch`.

---

## 🔹 3. `return` Statement Errors

The `return` statement is used to **exit a method** and optionally send a value back.

### ✅ Valid Example:

```java
class Test {
    public static int add(int a, int b) {
        return a + b;  // correct
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }
}
```

### ❌ Errors:

1. **Missing return in non-void method**

```java
class Test {
    public static int add(int a, int b) {
        if(a > b)
            return a;
        // ❌ No return for case when a <= b
    }
}
```

**Error:** `missing return statement`
👉 Every code path in a non-`void` method **must return a value**.

2. **Return type mismatch**

```java
class Test {
    public static int add(int a, int b) {
        return "Hello"; // ❌ wrong type
    }
}
```

**Error:** `incompatible types: String cannot be converted to int`
👉 The return type must match the **method’s declared return type**.

3. **Returning value from void method**

```java
class Test {
    public static void display() {
        return 100; // ❌ cannot return value from void method
    }
}
```

**Error:** `cannot return a value from method whose result type is void`

---

## 🔹 4. Key Takeaways

- `break` → only in loops/switch.
- `continue` → only in loops (not in switch).
- `return` → must match method type, and all paths must return in non-`void`.
- Using them incorrectly → **Compile-time errors**.

---

✅ So Day 17 is about **flow-control errors with break/continue/return**.
👉 These errors are common when beginners misuse `return` or write `break/continue` outside loops.

---
