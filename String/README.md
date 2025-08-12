---

## 📌 Part 1 — Fundamentals

### 1. What is a String?

- A sequence of characters.
- **Immutable** — once created, cannot be changed.
- Stored in **String Pool** if created with literals.
- `new String()` stores object in **Heap** (not in pool by default).

```java
String s1 = "Hello";           // String literal
String s2 = new String("Hi");  // Using new keyword
```
````

---

### 2. String Creation

- **Literal**
- **new keyword**
- From `char[]` array
- From `byte[]` array

```java
char[] chars = {'J', 'a', 'v', 'a'};
String str = new String(chars);

byte[] bytes = {65, 66, 67};
String str2 = new String(bytes);
```

---

### 3. Basic Methods

| Method                 | Description                        | Example                                |
| ---------------------- | ---------------------------------- | -------------------------------------- |
| `length()`             | Returns length of string           | `"Java".length()` → 4                  |
| `charAt(int index)`    | Returns char at given index        | `"Java".charAt(0)` → `'J'`             |
| `substring(start)`     | Substring from start index         | `"Java".substring(2)` → `"va"`         |
| `substring(start,end)` | Substring between indexes          | `"Java".substring(1,3)` → `"av"`       |
| `concat()` / `+`       | Concatenates strings               | `"Hi".concat(" Java")` → `"Hi Java"`   |
| `equals()`             | Compares content                   | `"abc".equals("abc")` → true           |
| `equalsIgnoreCase()`   | Ignores case                       | `"abc".equalsIgnoreCase("ABC")` → true |
| `compareTo()`          | Lexicographic comparison           | `"a".compareTo("b")` → -1              |
| `isEmpty()`            | Checks if empty string             | `"".isEmpty()` → true                  |
| `isBlank()` (Java 11)  | Checks if empty or only whitespace | `"  ".isBlank()` → true                |

---

## 📌 Part 2 — Searching & Checking

### 1. Searching

- `indexOf(char/string)`
- `lastIndexOf(char/string)`
- `contains(CharSequence)`

```java
String s = "Hello World";
System.out.println(s.indexOf('o'));     // 4
System.out.println(s.lastIndexOf("o")); // 7
System.out.println(s.contains("World")); // true
```

---

### 2. Checking

- `startsWith(String)`
- `endsWith(String)`
- Case-sensitive vs ignoring case
- Empty/null checks

---

### 3. Case Conversion

```java
String s = "java";
System.out.println(s.toUpperCase()); // JAVA
System.out.println(s.toLowerCase()); // java
```

---

### 4. Trimming

- `trim()` → removes leading/trailing spaces
- Removing all spaces → `replace(" ", "")`

---

## 📌 Part 3 — Modifying Strings

### 1. Replace & Remove

- `replace(char, char)`
- `replace(String, String)`
- `replaceAll(regex, replacement)`
- `replaceFirst(regex, replacement)`

---

### 2. Splitting

```java
String data = "one,two,three";
String[] parts = data.split(",");
```

---

### 3. Joining

```java
String joined = String.join("-", "2025", "08", "12");
System.out.println(joined); // 2025-08-12
```

---

## 📌 Part 4 — Performance & Special Classes

### 1. StringBuilder

- Mutable
- Non-synchronized → faster
- Methods: `append`, `insert`, `delete`, `reverse`

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Rocks");
System.out.println(sb);
```

---

### 2. StringBuffer

- Synchronized → thread-safe
- Slower than StringBuilder

---

### 3. String Pool & Interning

```java
String s1 = "Hello";
String s2 = new String("Hello").intern();
System.out.println(s1 == s2); // true
```

---

## 📌 Part 5 — Advanced & Edge Cases

### 1. Null vs Empty

- `null` → No object reference
- `""` → Empty string (length 0)
- `" "` → Space character (length 1)

---

### 2. Regex in Strings

```java
System.out.println("abc123".matches("[a-z]+\\d+")); // true
```

---

### 3. Unicode & Encoding

```java
String text = "नमस्ते";
byte[] bytes = text.getBytes();
String decoded = new String(bytes);
```

---
