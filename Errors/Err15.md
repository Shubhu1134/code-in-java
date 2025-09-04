## **_ day 15 _**

# 📅 Day 15 – Errors in Object Creation & Usage

---

## 🔹 1. **Using Object Without `new`**

```java
class Test {
    int x = 10;
    public static void main(String[] args) {
        Test t;
        System.out.println(t.x); // ❌ ERROR
    }
}
```

❌ **Error**:
`variable t might not have been initialized`

🔎 **Why**: `t` is just a reference, not an object. Must use `new`.

✅ Fix:

```java
Test t = new Test();
```

---

## 🔹 2. **Null Reference Access**

```java
class Test {
    int x = 10;
    public static void main(String[] args) {
        Test t = null;
        System.out.println(t.x);  // ❌ RUNTIME ERROR
    }
}
```

❌ **Runtime Error**:
`Exception in thread "main" java.lang.NullPointerException`

🔎 **Why**: `t` points to `null`, so accessing `x` crashes.

---

## 🔹 3. **Object Created but Reference Lost (Memory Leak-like Bug)**

```java
class Test {}
class Demo {
    public static void main(String[] args) {
        new Test(); // ❌ no reference stored
    }
}
```

⚠️ No error, but object becomes **unreachable immediately** → GC will clean it.
🔎 Common beginner bug: create objects without references.

---

## 🔹 4. **Multiple Objects Confusion**

```java
class Test {
    int x = 5;
}
class Demo {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.x = 20;
        System.out.println(t2.x); // Prints 5, ❌ NOT 20
    }
}
```

⚠️ **Logic Bug**: Each `new` creates a separate object, not shared data.

---

## 🔹 5. **Class Without Accessible Constructor**

```java
class Test {
    private Test() {} // ❌ only private constructor
}
class Demo {
    public static void main(String[] args) {
        Test t = new Test(); // ERROR
    }
}
```

❌ **Error**:
`Test() has private access in Test`

🔎 **Why**: Cannot call private constructor outside → used in Singleton patterns.

---

## 🔹 6. **Static Reference to Non-Static Objects**

```java
class Test {
    int x = 100;
}
class Demo {
    static Test t = new Test();
    public static void main(String[] args) {
        System.out.println(t.x); // ✅ Works
    }
}
```

⚠️ If you forget initialization:

```java
static Test t;
System.out.println(t.x); // ❌ NPE
```

❌ **Runtime Error**:
`NullPointerException`

---

## 🔹 7. **Final Object Reference Reassignment**

```java
class Test {}
class Demo {
    public static void main(String[] args) {
        final Test t1 = new Test();
        t1 = new Test();  // ❌ ERROR
    }
}
```

❌ **Error**:
`cannot assign a value to final variable t1`

🔎 **Why**: Final reference cannot be reassigned.

✅ But note:

```java
final Test t1 = new Test();
t1.hashCode(); // Allowed, state of object can change
```

---

# ✅ Day 15 Summary

- Using object without `new` → compile error.
- Accessing `null` object → NPE at runtime.
- Losing object reference → GC cleanup.
- Multiple `new` creates separate objects (not shared).
- Private constructor blocks object creation.
- Forgetting to initialize static object → NPE.
- Final reference cannot be reassigned.

---
