**complete detailed explanation of Inheritance in Java** with **OOP concepts**, **access modifiers (public, private, protected, default)**, and **security aspects**.

---

# 📘 Object-Oriented Programming (OOP) Basics

Java is an **Object-Oriented Programming Language**. The four main pillars are:

1. **Encapsulation** → Wrapping data (fields/variables) and methods into a single unit (class).
2. **Abstraction** → Hiding implementation details, showing only the necessary functionality.
3. **Inheritance** → Reusing code by acquiring properties from parent classes.
4. **Polymorphism** → Many forms: method overloading (compile-time) & method overriding (runtime).

---

# 📘 Inheritance in Java

### 🔹 Definition

Inheritance allows a **class (child/subclass)** to **reuse and extend** the properties and methods of another **class (parent/superclass)**.

In Java, we use the `extends` keyword for inheritance.

---

### 🔹 Types of Inheritance in Java

1. **Single Inheritance**

   - One child inherits from one parent.

   ```java
   class Parent {
       void display() {
           System.out.println("I am parent");
       }
   }

   class Child extends Parent {
       void show() {
           System.out.println("I am child");
       }
   }

   public class Test {
       public static void main(String[] args) {
           Child c = new Child();
           c.display(); // from parent
           c.show();    // from child
       }
   }
   ```

2. **Multilevel Inheritance**

   ```java
   class Grandparent {
       void greet() {
           System.out.println("Hello from Grandparent");
       }
   }

   class Parent extends Grandparent {
       void work() {
           System.out.println("Parent is working");
       }
   }

   class Child extends Parent {
       void play() {
           System.out.println("Child is playing");
       }
   }

   public class Test {
       public static void main(String[] args) {
           Child c = new Child();
           c.greet(); // from grandparent
           c.work();  // from parent
           c.play();  // child
       }
   }
   ```

3. **Hierarchical Inheritance**

   ```java
   class Parent {
       void speak() {
           System.out.println("I am the parent");
       }
   }

   class Child1 extends Parent {
       void study() {
           System.out.println("Child1 is studying");
       }
   }

   class Child2 extends Parent {
       void play() {
           System.out.println("Child2 is playing");
       }
   }

   public class Test {
       public static void main(String[] args) {
           Child1 c1 = new Child1();
           Child2 c2 = new Child2();
           c1.speak();
           c1.study();
           c2.speak();
           c2.play();
       }
   }
   ```

⚠️ Java **does not support multiple inheritance** with classes (to avoid **diamond problem**). Instead, we use **Interfaces**.

---

# 📘 Access Modifiers in Inheritance (Security)

Java provides **4 access levels** for controlling visibility:

| Modifier      | Same Class | Same Package | Subclass (different package) | Other Package |
| ------------- | ---------- | ------------ | ---------------------------- | ------------- |
| **public**    | ✅ Yes     | ✅ Yes       | ✅ Yes                       | ✅ Yes        |
| **protected** | ✅ Yes     | ✅ Yes       | ✅ Yes                       | ❌ No         |
| **default**   | ✅ Yes     | ✅ Yes       | ❌ No                        | ❌ No         |
| **private**   | ✅ Yes     | ❌ No        | ❌ No                        | ❌ No         |

---

### 🔹 Example: Protected Access in Inheritance

```java
package animals;

public class Animal {
    protected void sound() {
        System.out.println("Animal makes sound");
    }
}
```

```java
package dogs;
import animals.Animal;

public class Dog extends Animal {
    public void bark() {
        sound(); // Allowed because 'protected'
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
```

✅ Protected allows child classes (even in different packages) to access.

---

# 📘 Method Overriding in Inheritance

Child class can **override** parent’s method to provide its own implementation.

```java
class Parent {
    void message() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    @Override
    void message() {
        System.out.println("Message from Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child(); // Upcasting
        p.message(); // runtime polymorphism → Child's method runs
    }
}
```

---

# 📘 The `super` Keyword

1. Call parent class method:

   ```java
   class Parent {
       void show() {
           System.out.println("Parent method");
       }
   }

   class Child extends Parent {
       void show() {
           super.show(); // Calls parent method
           System.out.println("Child method");
       }
   }
   ```

2. Call parent class constructor:

   ```java
   class Parent {
       Parent() {
           System.out.println("Parent constructor");
       }
   }

   class Child extends Parent {
       Child() {
           super(); // calls parent constructor
           System.out.println("Child constructor");
       }
   }
   ```

---

# 📘 Security in Inheritance

- **Encapsulation** + **Access Modifiers** prevent **unauthorized access**.
- **private** fields are **not inherited** (secure).
- Use **protected** when you want to share with subclasses but not outside.
- **final** keyword can prevent overriding:

  ```java
  class Parent {
      final void secureMethod() {
          System.out.println("This cannot be overridden");
      }
  }
  ```

---

# 📘 Key Interview Points

- Java supports **single, multilevel, and hierarchical** inheritance.
- **Multiple inheritance** is not supported (to avoid ambiguity) but can be achieved via **interfaces**.
- **Constructors are not inherited**, but they can be called with `super()`.
- **Private members are never inherited**.
- **Polymorphism** + **Method overriding** come from inheritance.

---
