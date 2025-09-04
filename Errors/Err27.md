**Day 27**.

---

# 📅 Day 27 – Errors in **Polymorphism & Casting**

Polymorphism is core to OOP in Java (method overriding, dynamic dispatch, typecasting). But it introduces **frequent errors**. Let’s cover them systematically.

---

## 🔹 1. Upcasting (Safe) vs Downcasting (Risky)

✅ Correct (Upcasting):

```java
class Animal { void sound() { System.out.println("Animal"); } }
class Dog extends Animal { void sound() { System.out.println("Dog"); } }

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // ✅ upcasting (safe)
        a.sound(); // prints Dog
    }
}
```

❌ Wrong (Downcasting without check):

```java
Animal a = new Animal();
Dog d = (Dog) a; // ❌
```

**Runtime Error:** `ClassCastException: Animal cannot be cast to Dog`

👉 Always check with `instanceof` before downcasting:

```java
if (a instanceof Dog) {
    Dog d = (Dog) a;
}
```

---

## 🔹 2. Method Overriding Errors

### (a) Signature Mismatch

```java
class Parent { void show() { } }
class Child extends Parent {
    void Show() { } // ❌ different method (capital S)
}
```

👉 No compiler error, but **not overriding** → logical bug.

✅ Use `@Override` annotation to catch mistakes.

---

### (b) Overriding with Broader Checked Exception

```java
class Parent {
    void show() throws IOException {}
}
class Child extends Parent {
    void show() throws Exception {} // ❌ broader
}
```

**Error:** `overridden method does not throw Exception`

👉 Child can only throw **same or narrower checked exceptions**.

---

### (c) Overriding with Weaker Access Modifier

```java
class Parent { public void show() {} }
class Child extends Parent {
    void show() {} // ❌ weaker (default < public)
}
```

**Error:** `attempting to assign weaker access privileges; was public`

---

## 🔹 3. Static Methods Are Hidden, Not Overridden

```java
class Parent { static void hello() { System.out.println("Parent"); } }
class Child extends Parent { static void hello() { System.out.println("Child"); } }

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.hello(); // prints Parent ❌ not Child
    }
}
```

👉 Static methods are **hidden**, not polymorphic.

---

## 🔹 4. Instance Variable Hiding

```java
class Parent { int x = 10; }
class Child extends Parent { int x = 20; }

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x); // prints 10 ❌ not 20
    }
}
```

👉 Variables are **hidden**, not overridden.

---

## 🔹 5. `instanceof` Errors

❌ Wrong:

```java
String s = null;
if (s instanceof String) {
    System.out.println("true");
}
```

👉 Prints **false**. No error, but confusing.
Because `null` is not an instance of anything.

---

## 🔹 6. Abstract Class Polymorphism

❌ Wrong (instantiating abstract):

```java
abstract class Shape { abstract void draw(); }
public class Test {
    public static void main(String[] args) {
        Shape s = new Shape(); // ❌
    }
}
```

**Error:** `Shape is abstract; cannot be instantiated`

✅ Correct:

```java
Shape s = new Circle();
```

---

## 🔹 7. Casting Interface References

```java
interface A { void show(); }
class B implements A { public void show() { } }

public class Test {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a; // ✅ safe
        String s = (String) a; // ❌
    }
}
```

**Runtime Error:** `ClassCastException`

---

## 🔹 8. Final Methods Cannot Be Overridden

```java
class Parent { final void show() {} }
class Child extends Parent {
    void show() {} // ❌
}
```

**Error:** `cannot override final method from Parent`

---

## 🔹 9. Covariant Return Types

✅ Correct:

```java
class Parent { Object get() { return null; } }
class Child extends Parent { String get() { return "Hi"; } } // ✅ narrower
```

❌ Wrong:

```java
class Parent { String get() { return "Hi"; } }
class Child extends Parent { Object get() { return null; } } // ❌ broader
```

**Error:** `get() in Child cannot override get() in Parent`

---

## 🔹 10. Key Takeaways

- ✅ Upcasting is safe, downcasting needs `instanceof`.
- ✅ Overriding → same signature, same or weaker exception, **cannot reduce visibility**.
- ✅ Static methods & variables are hidden, not overridden.
- ✅ `final` methods cannot be overridden.
- ✅ Abstract classes require concrete subclass to instantiate.
- ✅ `instanceof` returns false on `null`.

---

✅ **Day 27 complete** – You now fully understand **polymorphism & casting errors**.
