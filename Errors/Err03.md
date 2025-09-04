---
# 📅 **Day 3 – Operator-Related Errors**
---

### 🔹 **Error 1: Bad operand types for binary operator**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 10;
        String y = "hello";
        int z = x + y;   // invalid
    }
}
```

**Compiler Error:**

```
error: bad operand types for binary operator '+'
  first type:  int
  second type: String
```

**Why?**

- `+` between `int` and `String` is **not allowed** unless concatenating with `String`.
- Here compiler expects **both operands numeric**.

✅ **Fix:**

```java
String z = x + y; // valid because result is String
```

---

### 🔹 **Error 2: Assignment in condition (common beginner mistake)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 5;
        if (x = 10) {   // trying to assign instead of compare
            System.out.println("Hello");
        }
    }
}
```

**Compiler Error:**

```
error: incompatible types: int cannot be converted to boolean
```

**Why?**

- `if` expects a boolean.
- `x = 10` assigns `10` to `x` and gives `int`, not `boolean`.

✅ **Fix:**

```java
if (x == 10) {
    System.out.println("Hello");
}
```

---

### 🔹 **Error 3: Division by zero (compile-time for constants)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 10 / 0;
    }
}
```

**Compiler Error:**

```
error: division by zero
```

**Why?**

- If denominator is a **constant zero**, compiler detects it.

✅ **Fix:** Avoid constant zero denominator.

```java
int y = 0;
System.out.println(10 / y); // compiles but throws runtime error
```

---

### 🔹 **Error 4: ArithmeticException (runtime)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int y = 0;
        System.out.println(10 / y);
    }
}
```

**Runtime Error:**

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

**Why?**

- Division by **variable with value zero** is caught only at runtime.

✅ **Fix:** Check before dividing.

```java
if (y != 0) {
    System.out.println(10 / y);
}
```

---

### 🔹 **Error 5: Increment/decrement misuse**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 10;
        ++(x + 1); // invalid
    }
}
```

**Compiler Error:**

```
error: unexpected type
  required: variable
  found:    value
```

**Why?**

- `++` can only be applied to a **variable**, not to an expression.

✅ **Fix:**

```java
++x;  // valid
```

---

### 🔹 **Error 6: Unreachable code (operator misuse in loops/if)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello");
        } else {
            System.out.println("World"); // unreachable
        }
    }
}
```

**Compiler Error:**

```
error: unreachable statement
```

**Why?**

- Compiler sees `if (true)` → else block can never execute.

✅ **Fix:** Use variable-based condition.

```java
boolean flag = true;
if (flag) {
    System.out.println("Hello");
} else {
    System.out.println("World");
}
```

---

# ✅ Day 3 Summary – Operator Errors

1. **Bad operand types** → `bad operand types for binary operator '+'`
2. **Assignment in condition** → `int cannot be converted to boolean`
3. **Division by zero (compile-time)** → `division by zero`
4. **ArithmeticException (runtime)** → `/ by zero`
5. **Increment/decrement misuse** → `unexpected type`
6. **Unreachable code** → `unreachable statement`

---
