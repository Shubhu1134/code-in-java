Let’s structure this like a **full study guide**, so you can revise step by step. I’ll categorize into **Beginner → Intermediate → Advanced → Tricky/Real Interview Scenarios**.

---

# 🚀 Java String Interview Questions & Answers

---

## 🟢 Beginner-Level Questions

### 1. **What is a String in Java?**

**Answer:**

- In Java, a `String` is a **sequence of characters**.
- It is represented by the `java.lang.String` class.
- Strings in Java are **objects** (not primitive types).
- Example:

  ```java
  String s1 = "Hello";      // String literal
  String s2 = new String("Hello"); // String object
  ```

**Key Point:** Strings are **immutable**, meaning once created, they cannot be changed.

---

### 2. **Why are Strings immutable in Java?**

**Answer:**

- **Security:** Sensitive data like passwords shouldn’t be altered.
- **Caching/Performance:** String literals are stored in the **String Constant Pool (SCP)**, and immutability allows reuse.
- **Thread-safety:** Multiple threads can safely use the same String object.

Example:

```java
String s = "Java";
s.concat(" World");
System.out.println(s); // Output: Java (original unchanged)
```

---

### 3. **What is the difference between `==` and `.equals()` in Strings?**

**Answer:**

- `==` → Compares **reference (memory address)**.
- `.equals()` → Compares **content (values)**.

Example:

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2);      // true (both in SCP)
System.out.println(s1 == s3);      // false (different objects)
System.out.println(s1.equals(s3)); // true (content same)
```

---

### 4. **What is the difference between `String`, `StringBuilder`, and `StringBuffer`?**

**Answer:**

- `String` → Immutable.
- `StringBuilder` → Mutable, not synchronized (faster).
- `StringBuffer` → Mutable, synchronized (thread-safe, slower).

Example:

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" World");
System.out.println(sb); // Java World (changed)
```

---

### 5. **What is String Constant Pool (SCP)?**

**Answer:**

- Special memory area in Java Heap where String literals are stored.
- If a new literal already exists in SCP, JVM reuses it.

Example:

```java
String s1 = "Hello";
String s2 = "Hello"; // reused from SCP
System.out.println(s1 == s2); // true
```

---

## 🟡 Intermediate-Level Questions

### 6. **How do you reverse a String in Java?**

**Answer 1: Using `StringBuilder`**

```java
String str = "Java";
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(reversed); // avaJ
```

**Answer 2: Using loop**

```java
String str = "Java";
String rev = "";
for(int i=str.length()-1; i>=0; i--){
    rev += str.charAt(i);
}
System.out.println(rev); // avaJ
```

---

### 7. **How to check if a String is a palindrome?**

**Answer:**

```java
String str = "madam";
String rev = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(rev)); // true
```

---

### 8. **Difference between `substring()` and `subSequence()`?**

**Answer:**

- `substring(int start, int end)` → returns a new **String**.
- `subSequence(int start, int end)` → returns a **CharSequence** (interface).

Example:

```java
String str = "HelloWorld";
System.out.println(str.substring(0,5));   // Hello
System.out.println(str.subSequence(5,10)); // World
```

---

### 9. **How do you convert String to `char[]`, `int`, `double`, etc.?**

**Answer:**

- `toCharArray()`:

  ```java
  String str = "Java";
  char[] arr = str.toCharArray();
  ```

- `parseInt()`:

  ```java
  int num = Integer.parseInt("123");
  ```

- `parseDouble()`:

  ```java
  double d = Double.parseDouble("12.34");
  ```

---

### 10. **How to split and join Strings in Java?**

**Answer:**

```java
String str = "Java,Python,C++";
String[] arr = str.split(",");
for(String s : arr) System.out.println(s);

String joined = String.join("-", arr);
System.out.println(joined); // Java-Python-C++
```

---

## 🔵 Advanced-Level Questions

### 11. **What is the difference between `intern()` and normal String creation?**

**Answer:**

- `intern()` adds the String to **SCP** if not already present.
- Ensures only one copy of a literal exists.

Example:

```java
String s1 = new String("Hello");
String s2 = s1.intern();
String s3 = "Hello";
System.out.println(s2 == s3); // true
```

---

### 12. **How does `String.hashCode()` work?**

**Answer:**

- Hash code is computed based on characters. Formula:

  ```
  s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
  ```

- Used in HashMaps for storing keys.

Example:

```java
String str = "Java";
System.out.println(str.hashCode());
```

---

### 13. **How to count occurrences of each character in a String?**

**Answer:**

```java
String str = "programming";
Map<Character, Integer> map = new HashMap<>();
for(char c : str.toCharArray()){
    map.put(c, map.getOrDefault(c,0)+1);
}
System.out.println(map);
```

---

### 14. **How to remove duplicate characters from a String?**

**Answer:**

```java
String str = "programming";
StringBuilder sb = new StringBuilder();
Set<Character> set = new HashSet<>();
for(char c : str.toCharArray()){
    if(!set.contains(c)){
        sb.append(c);
        set.add(c);
    }
}
System.out.println(sb.toString()); // progamin
```

---

### 15. **Why are Strings final in Java?**

**Answer:**

- To maintain immutability.
- Prevents subclass overriding that could break security or caching.
- Ensures `hashCode()` consistency when used as keys in collections.

---

## 🔴 Tricky/Real Interview Scenarios

### 16. **Check if two Strings are anagrams.**

```java
String s1 = "listen";
String s2 = "silent";

char[] a1 = s1.toCharArray();
char[] a2 = s2.toCharArray();
Arrays.sort(a1);
Arrays.sort(a2);

System.out.println(Arrays.equals(a1,a2)); // true
```

---

### 17. **Find the first non-repeating character in a String.**

```java
String str = "swiss";
Map<Character, Integer> map = new LinkedHashMap<>();
for(char c : str.toCharArray())
    map.put(c, map.getOrDefault(c,0)+1);

for(Map.Entry<Character,Integer> e : map.entrySet()){
    if(e.getValue() == 1){
        System.out.println("First non-repeating: " + e.getKey());
        break;
    }
}
```

---

### 18. **Reverse words in a sentence.**

```java
String str = "Java is fun";
String[] words = str.split(" ");
StringBuilder sb = new StringBuilder();
for(int i=words.length-1; i>=0; i--){
    sb.append(words[i]).append(" ");
}
System.out.println(sb.toString().trim()); // fun is Java
```

---

### 19. **Check if a String contains only digits.**

```java
String str = "12345";
System.out.println(str.matches("\\d+")); // true
```

---

### 20. **Find the longest substring without repeating characters.**

```java
String str = "abcabcbb";
Set<Character> set = new HashSet<>();
int left = 0, max = 0;
for(int right=0; right<str.length(); right++){
    while(set.contains(str.charAt(right))){
        set.remove(str.charAt(left++));
    }
    set.add(str.charAt(right));
    max = Math.max(max, right-left+1);
}
System.out.println(max); // 3 (abc)
```

---

✅ This covers **beginner → intermediate → advanced → tricky interview questions**.
