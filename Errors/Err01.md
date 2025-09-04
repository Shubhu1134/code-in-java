---
# 📅 **Day 1 – Variable Definition Errors**
---

### 🔹 **Error 1: Variable not initialized**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x;
        System.out.println(x);
    }
}
```

**Compiler Error:**

```
error: variable x might not have been initialized
```

**Why?**

- Local variables in Java **must be explicitly initialized** before use.
- Java does **not** assign a default value to local variables (unlike instance variables).

✅ **Fix:**

```java
int x = 0;
System.out.println(x);
```

---

### 🔹 **Error 2: Duplicate variable definition**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int a = 5;
        int a = 10;
    }
}
```

**Compiler Error:**

```
error: variable a is already defined in method main(String[])
```

**Why?**

- You **cannot redeclare a variable in the same scope**.
- Compiler sees two variables with the same name → **naming conflict**.

✅ **Fix:**
Rename or reuse:

```java
int a = 5;
a = 10; // reuse same variable
```

---

### 🔹 **Error 3: Non-static variable cannot be referenced from a static context**

**Code:**

```java
public class Test {
    int a = 5;
    public static void main(String[] args) {
        System.out.println(a);
    }
}
```

**Compiler Error:**

```
error: non-static variable a cannot be referenced from a static context
```

**Why?**

- `main` is **static** → belongs to class.
- `a` is an **instance variable** → belongs to object.
- You can’t directly use instance data inside static methods.

✅ **Fix:**

```java
Test obj = new Test();
System.out.println(obj.a);
```

---

### 🔹 **Error 4: Illegal forward reference**

**Code:**

```java
public class Test {
    static int a = b;
    static int b = 10;
    public static void main(String[] args) {
        System.out.println(a);
    }
}
```

**Compiler Error:**

```
error: illegal forward reference
```

**Why?**

- Static variables are initialized in order.
- When `a = b;` runs, `b` is **not yet defined**.

✅ **Fix:**

```java
static int b = 10;
static int a = b;
```

---

### 🔹 **Error 5: Final variable not initialized**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        final int x;
        System.out.println(x);
    }
}
```

**Compiler Error:**

```
error: variable x might not have been initialized
```

**Why?**

- A `final` variable must be assigned a value **once and before use**.

✅ **Fix:**

```java
final int x = 100;
System.out.println(x);
```

---

# ✅ Day 1 Summary – Errors Covered

1. **Variable not initialized** → `variable x might not have been initialized`
2. **Duplicate variable** → `variable a is already defined`
3. **Non-static variable in static context** → `non-static variable cannot be referenced from a static context`
4. **Illegal forward reference** → `illegal forward reference`
5. **Final variable not initialized** → `variable might not have been initialized`

---
