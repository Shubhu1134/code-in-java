---
# 📅 **Day 2 – Type Casting & Type Mismatch Errors**
---

### 🔹 **Error 1: Incompatible types**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = "hello";
    }
}
```

**Compiler Error:**

```
error: incompatible types: String cannot be converted to int
```

**Why?**

- Java is **strongly typed** → can’t assign a `String` to an `int`.
- Compiler checks **type compatibility at compile time**.

✅ **Fix:**

```java
int x = 10;
String s = "hello";
```

---

### 🔹 **Error 2: Possible lossy conversion**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int x = 1000;
        byte y = x;   // trying to assign int to byte
    }
}
```

**Compiler Error:**

```
error: incompatible types: possible lossy conversion from int to byte
```

**Why?**

- `int` is **32-bit**, `byte` is **8-bit**.
- Direct assignment may lose data → compiler blocks it.

✅ **Fix:** Explicit cast

```java
byte y = (byte) x;  // works but may overflow
```

---

### 🔹 **Error 3: Cannot cast between unrelated types**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        String s = "hello";
        Integer i = (Integer) s;  // invalid cast
    }
}
```

**Compiler Error:**

```
error: incompatible types: String cannot be converted to Integer
```

**Why?**

- `String` and `Integer` are unrelated types.
- Java only allows casting **within an inheritance hierarchy**.

✅ **Fix:** Use parsing instead:

```java
String s = "123";
Integer i = Integer.parseInt(s);
```

---

### 🔹 **Error 4: ClassCastException (Runtime Error)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        Object obj = "hello";
        Integer i = (Integer) obj; // compiles fine, fails at runtime
    }
}
```

**Runtime Error:**

```
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
```

**Why?**

- Compiler allows cast (both are objects).
- At runtime → JVM checks actual type → fails.

✅ **Fix:**

```java
Object obj = "hello";
if (obj instanceof String) {
    String s = (String) obj;
    System.out.println(s);
}
```

---

### 🔹 **Error 5: Narrowing primitive conversion without cast**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        double d = 10.5;
        int i = d;  // narrowing conversion
    }
}
```

**Compiler Error:**

```
error: incompatible types: possible lossy conversion from double to int
```

**Why?**

- Narrowing (larger → smaller type) needs **explicit cast**.

✅ **Fix:**

```java
int i = (int) d; // value becomes 10
```

---

### 🔹 **Error 6: Numeric overflow (not compiler error, but logical mistake)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        byte b = (byte) 130;
        System.out.println(b);
    }
}
```

**Output:**

```
-126
```

**Why?**

- 130 is out of byte range (-128 to 127).
- JVM wraps around (overflow).

✅ **Fix:**

- Use correct data type:

```java
int b = 130;
```

---

# ✅ Day 2 Summary – Errors Covered

1. **Incompatible types** → `String cannot be converted to int`
2. **Possible lossy conversion** → `possible lossy conversion from int to byte`
3. **Cannot cast between unrelated types** → `String cannot be converted to Integer`
4. **ClassCastException (runtime)**
5. **Narrowing primitive conversion without cast** → `possible lossy conversion from double to int`
6. **Numeric overflow (logical error, not compiler error)**

---
