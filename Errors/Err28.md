**Day 28**.

---

# 📅 Day 28 – Errors in **Inner Classes & Anonymous Classes**

Java supports several types of inner classes:

- **Member inner class**
- **Static nested class**
- **Local inner class** (inside a method)
- **Anonymous class**

Each has its **own set of errors**.

---

## 🔹 1. Member Inner Class Instantiation Errors

❌ Wrong:

```java
class Outer {
    class Inner {
        void show() { System.out.println("Inner"); }
    }
}

public class Test {
    public static void main(String[] args) {
        Inner i = new Inner(); // ❌ Error
    }
}
```

**Error:** `cannot find symbol: class Inner`

✅ Correct:

```java
Outer o = new Outer();
Outer.Inner i = o.new Inner();
i.show();
```

👉 Inner class requires an **outer class object** unless it is `static`.

---

## 🔹 2. Static Members Inside Inner Class

❌ Wrong:

```java
class Outer {
    class Inner {
        static int x = 10; // ❌
    }
}
```

**Error:** `modifier static not allowed here`

✅ Only **static final constants** are allowed in inner classes.

✅ Correct:

```java
class Outer {
    class Inner {
        static final int X = 10;
    }
}
```

---

## 🔹 3. Local Inner Class Scope Issues

❌ Wrong:

```java
class Test {
    void show() {
        int x = 10;
        class Local {
            void print() { System.out.println(x); }
        }
        x = 20; // ❌ not allowed, must be final or effectively final
    }
}
```

**Error:** `local variables referenced from an inner class must be final or effectively final`

✅ Correct:

```java
class Test {
    void show() {
        int x = 10; // effectively final
        class Local {
            void print() { System.out.println(x); }
        }
        new Local().print();
    }
}
```

---

## 🔹 4. Anonymous Class without Implementation

❌ Wrong:

```java
abstract class Animal { abstract void sound(); }

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal(); // ❌
    }
}
```

**Error:** `Animal is abstract; cannot be instantiated`

✅ Correct (using anonymous class):

```java
Animal a = new Animal() {
    void sound() { System.out.println("Dog"); }
};
a.sound();
```

---

## 🔹 5. Anonymous Class Cannot Have Constructor

❌ Wrong:

```java
interface A { void show(); }

public class Test {
    public static void main(String[] args) {
        A a = new A() {
            A() { System.out.println("Constructor"); } // ❌ not allowed
            public void show() { }
        };
    }
}
```

**Error:** `modifier A() not allowed here`

✅ Correct: Use an **instance block** instead:

```java
A a = new A() {
    { System.out.println("Instance block instead of constructor"); }
    public void show() { }
};
```

---

## 🔹 6. Accessing Outer Class Members

✅ Works:

```java
class Outer {
    private int x = 100;
    class Inner {
        void show() { System.out.println(x); }
    }
}
```

❌ Wrong:

```java
class Outer {
    private static int x = 100;
    class Inner {
        static void show() { System.out.println(x); } // ❌
    }
}
```

**Error:** `modifier static not allowed here`

👉 Only `static nested classes` can have static members.

---

## 🔹 7. Shadowing Variables in Inner Class

```java
class Outer {
    int x = 10;
    class Inner {
        int x = 20;
        void show(int x) {
            System.out.println(x);        // prints parameter
            System.out.println(this.x);   // prints 20
            System.out.println(Outer.this.x); // prints 10
        }
    }
}
```

✅ Always specify `Outer.this.x` to avoid shadowing confusion.

---

## 🔹 8. Static Nested Class Instantiation

✅ Correct:

```java
class Outer {
    static class Inner {
        void show() { System.out.println("Static inner"); }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner(); // ✅ no outer object needed
        i.show();
    }
}
```

❌ Wrong:

```java
Outer o = new Outer();
Outer.Inner i = o.new Inner(); // ❌ Error, because class is static
```

**Error:** `qualified new of static class`

---

## 🔹 9. Multiple Anonymous Classes

✅ Works:

```java
interface A { void show(); }

public class Test {
    public static void main(String[] args) {
        A a1 = new A() { public void show() { System.out.println("One"); } };
        A a2 = new A() { public void show() { System.out.println("Two"); } };

        a1.show();
        a2.show();
    }
}
```

👉 Each anonymous class is **a separate class file** at compile time (`Test$1.class`, `Test$2.class`).

---

## 🔹 10. Key Takeaways

- ✅ Non-static inner classes require an outer class object.
- ✅ Inner classes cannot have static members (except constants).
- ✅ Local inner classes can only use effectively final variables.
- ✅ Anonymous classes cannot have constructors, but can use **instance blocks**.
- ✅ Use `Outer.this.x` to access shadowed outer members.
- ✅ Static nested classes can be instantiated without an outer object.

---

✅ **Day 28 complete** – You’ve mastered **inner & anonymous class errors**.
