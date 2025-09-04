---
# 📅 **Day 4 – Control Structure Errors**
---

### 🔹 **Error 1: Missing return statement (in control flow)**

**Code:**

```java
public class Test {
    public static int check(int x) {
        if (x > 0) {
            return 1;
        }
        // no return for other cases
    }
}
```

**Compiler Error:**

```
error: missing return statement
```

**Why?**

- A method with a return type **must guarantee** returning a value on **all paths**.

✅ **Fix:**

```java
public static int check(int x) {
    if (x > 0) return 1;
    return -1; // default return
}
```

---

### 🔹 **Error 2: Incompatible types in `if` condition**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 5;
        if (x) {  // invalid
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

- In Java, `if` condition must be **boolean**.
- Unlike C/C++, non-boolean values (like `int`) are not allowed.

✅ **Fix:**

```java
if (x != 0) {
    System.out.println("Hello");
}
```

---

### 🔹 **Error 3: Duplicate case label in `switch`**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 2: System.out.println("Duplicate"); break;
        }
    }
}
```

**Compiler Error:**

```
error: duplicate case label
```

**Why?**

- Each `case` must be **unique** inside the same `switch`.

✅ **Fix:**

```java
case 3: System.out.println("Three"); break;
```

---

### 🔹 **Error 4: Case expressions must be constant**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        switch (x) {
            case y: System.out.println("Hello"); break; // invalid
        }
    }
}
```

**Compiler Error:**

```
error: constant expression required
```

**Why?**

- `case` labels must be **compile-time constants** (like `final static int`).

✅ **Fix:**

```java
final int y = 2;
switch (x) {
    case y: System.out.println("Hello"); break;
}
```

---

### 🔹 **Error 5: Unreachable statement (loop/control misuse)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        while (false) {
            System.out.println("This will never run");
        }
    }
}
```

**Compiler Error:**

```
error: unreachable statement
```

**Why?**

- Compiler detects that `while(false)` body will **never execute**.

✅ **Fix:**

```java
boolean flag = false;
while (flag) {
    System.out.println("Runs if flag true");
}
```

---

### 🔹 **Error 6: Break/Continue outside loop or switch**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        break;  // invalid
    }
}
```

**Compiler Error:**

```
error: break outside switch or loop
```

**Why?**

- `break` and `continue` can only be used inside **loops** or a **switch**.

✅ **Fix:**

```java
for (int i = 0; i < 3; i++) {
    if (i == 1) break;
}
```

---

### 🔹 **Error 7: Enhanced for-loop type mismatch**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (String s : arr) {   // invalid type
            System.out.println(s);
        }
    }
}
```

**Compiler Error:**

```
error: incompatible types: int cannot be converted to String
```

**Why?**

- The loop variable type must match the array/collection element type.

✅ **Fix:**

```java
for (int s : arr) {
    System.out.println(s);
}
```

---

# ✅ Day 4 Summary – Control Structure Errors

1. **Missing return statement** → `missing return statement`
2. **If condition not boolean** → `int cannot be converted to boolean`
3. **Duplicate case label** → `duplicate case label`
4. **Case expression must be constant** → `constant expression required`
5. **Unreachable statement** → `unreachable statement`
6. **Break/continue outside loop** → `break outside switch or loop`
7. **Enhanced for-loop type mismatch** → `incompatible types`

---
