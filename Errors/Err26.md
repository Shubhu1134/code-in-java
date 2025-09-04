**Day 26**.

---

# 📅 Day 26 – Errors in **Collections Framework & Generics**

Java Collections (`List`, `Set`, `Map`, etc.) are very powerful but also prone to **runtime and compile-time errors**. Today we’ll explore **common mistakes, exceptions, and their causes**.

---

## 🔹 1. IndexOutOfBounds in Lists

❌ Wrong:

```java
import java.util.*;
class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        System.out.println(list.get(2)); // ❌ index 2 doesn’t exist
    }
}
```

**Runtime Error:** `IndexOutOfBoundsException: Index 2 out of bounds for length 1`

👉 Always check `list.size()` before accessing.

---

## 🔹 2. Null in Collections

- **Allowed in `ArrayList`, `HashMap` (one null key, many null values)**.
- **Not allowed in `Hashtable` or `ConcurrentHashMap`**.

❌ Wrong:

```java
import java.util.*;
class Test {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(null, "A"); // ❌
    }
}
```

**Runtime Error:** `NullPointerException`

---

## 🔹 3. ClassCastException

❌ Wrong:

```java
import java.util.*;
class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        Integer n = (Integer) list.get(0); // ❌ string cast to int
    }
}
```

**Runtime Error:** `ClassCastException: java.lang.String cannot be cast to java.lang.Integer`

👉 Use **generics** to avoid:

```java
List<String> list = new ArrayList<>();
```

---

## 🔹 4. ConcurrentModificationException

❌ Wrong:

```java
import java.util.*;
class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);

        for (Integer i : list) {
            list.remove(i); // ❌ modifies during iteration
        }
    }
}
```

**Runtime Error:** `ConcurrentModificationException`

✅ Fix → use **Iterator**:

```java
Iterator<Integer> it = list.iterator();
while(it.hasNext()) {
    it.next();
    it.remove();
}
```

---

## 🔹 5. UnsupportedOperationException

❌ Wrong:

```java
import java.util.*;
class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");
        list.add("D"); // ❌ fixed-size list
    }
}
```

**Runtime Error:** `UnsupportedOperationException`

👉 `Arrays.asList()` creates a fixed-size list.
Use `new ArrayList<>(...)` instead.

---

## 🔹 6. Duplicate Keys in Maps

❌ Wrong (if expecting multiple values):

```java
import java.util.*;
class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(1,"B"); // replaces value
        System.out.println(map); // {1=B}
    }
}
```

👉 No error, but logical mistake: duplicate keys overwrite values.

---

## 🔹 7. Generics Type Safety Errors

### (a) Raw Types (No Generics)

```java
List list = new ArrayList(); // ❌ unsafe
list.add("abc");
list.add(10); // mix types
```

👉 Causes runtime `ClassCastException`.

---

### (b) Wrong Generic Declaration

```java
List<Object> list = new ArrayList<String>(); // ❌ incompatible
```

**Error:** `incompatible types: ArrayList<String> cannot be converted to List<Object>`

👉 Generics are **invariant** → types must match exactly.

---

### (c) Mixing Generic Methods Wrongly

```java
List<?> list = new ArrayList<String>();
list.add("abc"); // ❌ cannot add
```

**Error:** `no suitable method found for add(String)`

👉 Wildcards (`?`) are **read-only**.

---

## 🔹 8. Empty Collection Operations

❌ Wrong:

```java
Queue<Integer> q = new LinkedList<>();
System.out.println(q.remove()); // ❌ empty queue
```

**Runtime Error:** `NoSuchElementException`

✅ Use `poll()` → returns `null` if empty.

---

## 🔹 9. Immutable Collections

```java
List<String> list = List.of("A","B");
list.add("C"); // ❌
```

**Runtime Error:** `UnsupportedOperationException`

👉 `List.of()` creates immutable list.

---

## 🔹 10. Key Takeaways

- ✅ **List** → watch for `IndexOutOfBounds`.
- ✅ **Map** → no duplicate keys, `Hashtable` doesn’t allow null.
- ✅ **Generics** → avoid raw types, ensure type-safety.
- ✅ **Iteration** → don’t modify during enhanced-for loop.
- ✅ **Immutable collections** → can’t add/remove.

---

✅ **Day 26 complete** – You now know **all major errors in Collections & Generics**.
