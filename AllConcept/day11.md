**Concept 11: Strings in Java**

---

# 🔹 Concept 11: Strings in Java

---

## 1️⃣ Why Strings?

- Strings are used to **store text**, like names, messages, passwords.
- Text is everywhere in programs → input/output, file handling, messages, UI.
- Strings are **objects in Java**, not primitive types.

---

## 2️⃣ What is a String?

- A **String is a sequence of characters**.
- Immutable → once created, its value **cannot be changed**.
- Stored in **String Pool** for memory optimization.

### Example:

```java
String name = "Rahul";
```

---

## 3️⃣ How Strings Work

- **Immutable objects** → `"Rahul"` cannot be modified.
- Operations that modify a string **create a new string object**.
- Stored in **String Pool** (for literals) and heap (for `new String()`).

### Example: String Pool vs Heap

```java
String s1 = "Hello";          // String Pool
String s2 = "Hello";          // points to same object in pool
String s3 = new String("Hello"); // Heap, different object
System.out.println(s1==s2);  // true
System.out.println(s1==s3);  // false
```

---

## 4️⃣ Common String Operations (Methods)

| Method                            | Description             | Example                               |
| --------------------------------- | ----------------------- | ------------------------------------- |
| `length()`                        | Length of string        | `"Hello".length()` → 5                |
| `charAt(int index)`               | Character at index      | `"Hello".charAt(1)` → 'e'             |
| `concat(String s)`                | Join two strings        | `"Hi".concat(" There")` → "Hi There"  |
| `substring(int, int)`             | Extract part of string  | `"Hello".substring(1,4)` → "ell"      |
| `equals(String s)`                | Compare contents        | `"Hi".equals("hi")` → false           |
| `equalsIgnoreCase()`              | Compare ignoring case   | `"Hi".equalsIgnoreCase("hi")` → true  |
| `toUpperCase()` / `toLowerCase()` | Convert case            | `"hello".toUpperCase()` → "HELLO"     |
| `trim()`                          | Remove spaces           | `"  Hello  ".trim()` → "Hello"        |
| `replace(char, char)`             | Replace characters      | `"Hello".replace('l','p')` → "Heppo"  |
| `split(String)`                   | Split string into array | `"a,b,c".split(",")` → \["a","b","c"] |

---

## 5️⃣ String Concatenation

- Using `+` operator → `"Hello" + " World"` → "Hello World"
- Using `concat()` method → `"Hello".concat(" World")` → "Hello World"
- Using `StringBuilder` → efficient for **many modifications**.

### Example: StringBuilder

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```

---

## 6️⃣ String Immutability Example

```java
String s = "Hello";
s.concat(" World");
System.out.println(s); // Hello (original unchanged)
```

- To change, assign back: `s = s.concat(" World");`

---

## 7️⃣ Connections

- **Variables** → Strings are reference variables.
- **Arrays** → Strings can be converted to char arrays.
- **Loops** → Often used to iterate through characters.
- **Operators** → `+` for concatenation.
- **Type Casting** → Convert primitive → string using `String.valueOf()`

---

## 8️⃣ Interview Questions

### Basic

1. Difference between `==` and `equals()` for strings?
2. What is string immutability and why is it important?
3. How to convert String → int? → `Integer.parseInt(str)`
4. How to convert int → String? → `String.valueOf(num)`

### Intermediate / Tricky

1. Difference between `String`, `StringBuilder`, `StringBuffer`?

   - String → immutable
   - StringBuilder → mutable, non-thread-safe
   - StringBuffer → mutable, thread-safe

2. Why use `StringBuilder` over `String` in loops?

   - To avoid **creating multiple objects** → better performance

3. What is the difference between `substring()` and `charAt()`?
4. What happens if `s1 == s2` is true but `s1.equals(s2)` is false?

   - Impossible → content same if `==` true for strings in pool

---

## 9️⃣ Example: String Operations

```java
String str = " Java ";
System.out.println(str.length());        // 6
System.out.println(str.trim());          // "Java"
System.out.println(str.toUpperCase());  // " JAVA "
System.out.println(str.charAt(2));      // 'J'
String s2 = str.concat(" Programming");
System.out.println(s2);                 // " Java  Programming"
```

---

✅ **Memory / Mind Map**

```
String → Immutable object
Stored → String Pool (literal) / Heap (new String)
Concatenation → + / concat()
Modification → creates new object
Use StringBuilder for efficient modifications
```

---
