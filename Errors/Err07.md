**Day 7**.
Today’s focus: **Inheritance & Polymorphism Errors** → casting, overriding, constructor chaining, `super`, `final`, `abstract` usage issues.

---

# 📅 **Day 7 – Inheritance & Polymorphism Errors**

---

## 🔹 **Error 1: Parent reference cannot access child-specific methods**

**Code:**

```java
class Parent {
    void show() {}
}
class Child extends Parent {
    void play() {}
}
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.play();  // invalid
    }
}
```

**Compiler Error:**

```
error: cannot find symbol
  symbol:   method play()
  location: variable p of type Parent
```

**Why?**

- Reference type (`Parent`) decides accessible methods.
- `play()` is not in `Parent`.

✅ **Fix 1:** Cast explicitly

```java
((Child)p).play();
```

✅ **Fix 2:** Use `Child` reference

```java
Child c = new Child();
c.play();
```

---

## 🔹 **Error 2: Invalid type casting**

**Code:**

```java
class Parent {}
class Child extends Parent {}
class AnotherChild extends Parent {}
public class Test {
    public static void main(String[] args) {
        Parent p = new AnotherChild();
        Child c = (Child) p; // invalid cast
    }
}
```

**Runtime Error:**

```
Exception in thread "main" java.lang.ClassCastException: class AnotherChild cannot be cast to class Child
```

**Why?**

- `p` actually points to `AnotherChild`, not `Child`.

✅ **Fix:** Check before casting

```java
if (p instanceof Child) {
    Child c = (Child) p;
}
```

---

## 🔹 **Error 3: Overriding with weaker access modifier**

**Code:**

```java
class Parent {
    public void display() {}
}
class Child extends Parent {
    void display() {}  // default access
}
```

**Compiler Error:**

```
error: display() in Child cannot override display() in Parent
  attempting to assign weaker access privileges; was public
```

**Why?**

- Overridden method **cannot reduce visibility**.

✅ **Fix:**

```java
public void display() {}
```

---

## 🔹 **Error 4: Static method hiding vs overriding confusion**

**Code:**

```java
class Parent {
    static void hello() {}
}
class Child extends Parent {
    void hello() {}  // non-static
}
```

**Compiler Error:**

```
error: hello() in Child cannot override hello() in Parent
  overridden method is static
```

**Why?**

- `static` methods are **hidden**, not overridden.
- Cannot mix static & instance method with same signature.

✅ **Fix:** Keep both static or both instance.

---

## 🔹 **Error 5: Abstract method not implemented**

**Code:**

```java
abstract class Parent {
    abstract void run();
}
class Child extends Parent {
    // forgot to implement run()
}
```

**Compiler Error:**

```
error: Child is not abstract and does not override abstract method run() in Parent
```

**Why?**

- Any concrete class extending abstract must implement all abstract methods.

✅ **Fix:**

```java
class Child extends Parent {
    void run() { System.out.println("Running"); }
}
```

---

## 🔹 **Error 6: `super()` constructor call missing**

**Code:**

```java
class Parent {
    Parent(int x) {}
}
class Child extends Parent {
    Child() { }  // no explicit super()
}
```

**Compiler Error:**

```
error: constructor Parent in class Parent cannot be applied to given types;
  required: int
  found: no arguments
```

**Why?**

- Parent has **only parameterized constructor**.
- Java automatically inserts `super()`, but no default constructor exists.

✅ **Fix:**

```java
class Child extends Parent {
    Child() {
        super(10);
    }
}
```

---

## 🔹 **Error 7: Final method cannot be overridden**

**Code:**

```java
class Parent {
    final void hello() {}
}
class Child extends Parent {
    void hello() {} // invalid
}
```

**Compiler Error:**

```
error: hello() in Child cannot override hello() in Parent
  overridden method is final
```

**Why?**

- `final` methods cannot be changed in child class.

✅ **Fix:** Remove `final` or don’t override.

---

## 🔹 **Error 8: Final class inheritance**

**Code:**

```java
final class Parent {}
class Child extends Parent {} // invalid
```

**Compiler Error:**

```
error: cannot inherit from final Parent
```

**Why?**

- `final` class cannot be extended.

✅ **Fix:** Remove `final` if inheritance needed.

---

## 🔹 **Error 9: Multiple inheritance with classes**

**Code:**

```java
class A {}
class B {}
class C extends A, B {}  // invalid
```

**Compiler Error:**

```
error: '{' expected
```

**Why?**

- Java doesn’t allow multiple class inheritance → ambiguity problem (diamond problem).

✅ **Fix:** Use interfaces instead.

---

# ✅ Day 7 Summary – Inheritance & Polymorphism Errors

| Error                               | Type         | Message                                                 |
| ----------------------------------- | ------------ | ------------------------------------------------------- |
| Parent ref cannot call child method | Compile-time | `cannot find symbol`                                    |
| Invalid type casting                | Runtime      | `ClassCastException`                                    |
| Overriding weaker access            | Compile-time | `attempting to assign weaker access privileges`         |
| Static vs instance override         | Compile-time | `overridden method is static`                           |
| Abstract method not implemented     | Compile-time | `is not abstract and does not override abstract method` |
| Missing super() call                | Compile-time | `constructor ... cannot be applied`                     |
| Final method overridden             | Compile-time | `cannot override ... final`                             |
| Final class inheritance             | Compile-time | `cannot inherit from final`                             |
| Multiple class inheritance          | Compile-time | `‘{’ expected`                                          |

---
