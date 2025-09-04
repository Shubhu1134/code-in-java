**Day 6**.

---

# 📅 **Day 6 – Array & String Errors**

---

## 🔹 **Error 1: Array index out of bounds (Runtime)**

**Code:**

```java
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[3] = 10; // invalid index
    }
}
```

**Runtime Error:**

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
```

**Why?**

- Valid indices for `new int[3]` are `0, 1, 2`.
- Index `3` is invalid.

✅ **Fix:**

```java
arr[2] = 10;
```

---

## 🔹 **Error 2: Negative array size (Runtime)**

**Code:**

```java
int[] arr = new int[-5];
```

**Runtime Error:**

```
Exception in thread "main" java.lang.NegativeArraySizeException
```

**Why?**

- Array size must be non-negative.

✅ **Fix:**

```java
int[] arr = new int[5];
```

---

## 🔹 **Error 3: Incompatible array types (Compile-time)**

**Code:**

```java
Object[] objArr = new String[5];
objArr[0] = 100;  // invalid, String[] cannot hold Integer
```

**Runtime Error:**

```
Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
```

**Why?**

- `objArr` is declared as `Object[]` but **actually created as String\[]**.
- Java prevents storing wrong types at runtime.

✅ **Fix:**

```java
objArr[0] = "Hello";
```

---

## 🔹 **Error 4: Array initialization type mismatch (Compile-time)**

**Code:**

```java
int[] arr = {1, 2, "three"};
```

**Compiler Error:**

```
error: incompatible types: String cannot be converted to int
```

**Why?**

- Array elements must be of the same type.

✅ **Fix:**

```java
int[] arr = {1, 2, 3};
```

---

## 🔹 **Error 5: String index out of bounds (Runtime)**

**Code:**

```java
String str = "java";
System.out.println(str.charAt(4)); // invalid
```

**Runtime Error:**

```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 4 out of range for length 4
```

**Why?**

- `"java"` has indices `0 to 3`.
- Accessing index `4` is invalid.

✅ **Fix:**

```java
System.out.println(str.charAt(3)); // 'a'
```

---

## 🔹 **Error 6: Null reference with String (Runtime)**

**Code:**

```java
String s = null;
System.out.println(s.length());
```

**Runtime Error:**

```
Exception in thread "main" java.lang.NullPointerException
```

**Why?**

- `s` is `null`, no object is created.

✅ **Fix:**

```java
String s = "";
System.out.println(s.length()); // 0
```

---

## 🔹 **Error 7: Immutable String modification confusion (Logical mistake)**

**Code:**

```java
String s = "hello";
s.concat(" world");
System.out.println(s); // prints "hello"
```

**No compiler/runtime error, but logical error.**

**Why?**

- Strings are immutable → `concat` creates a new object.
- Original string `s` remains unchanged.

✅ **Fix:**

```java
s = s.concat(" world");
System.out.println(s); // "hello world"
```

---

## 🔹 **Error 8: Wrong array declaration (Compile-time)**

**Code:**

```java
int arr(5);  // like C++ style
```

**Compiler Error:**

```
error: ';' expected
```

**Why?**

- In Java → arrays use `[]`, not `()`.

✅ **Fix:**

```java
int[] arr = new int[5];
```

---

# ✅ Day 6 Summary – Array & String Errors

| Error                        | Type         | Message                           |
| ---------------------------- | ------------ | --------------------------------- |
| Array index out of bounds    | Runtime      | `ArrayIndexOutOfBoundsException`  |
| Negative array size          | Runtime      | `NegativeArraySizeException`      |
| Wrong type stored in array   | Runtime      | `ArrayStoreException`             |
| Wrong type in initialization | Compile-time | `incompatible types`              |
| String index out of bounds   | Runtime      | `StringIndexOutOfBoundsException` |
| Null string reference        | Runtime      | `NullPointerException`            |
| String immutability          | Logical      | No error, wrong assumption        |
| Wrong declaration syntax     | Compile-time | `';' expected`                    |

---
