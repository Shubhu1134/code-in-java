**Concept 7: Access Modifiers in Java**

---

## 🔹 Why Access Modifiers?

- Imagine you have a **bank account class** → balance, account number.
- You don’t want everyone to **directly change the balance**.
- Instead, you want control → only certain classes/methods can access it.
- That’s why **Access Modifiers** exist → they define **who can access what**.

---

## 🔹 What are Access Modifiers?

They are **keywords** in Java that decide the **visibility/scope** of classes, methods, variables, and constructors.

Types in Java:

1. **public** → visible everywhere.
2. **protected** → visible inside package + subclasses (even outside package).
3. **default (package-private)** → visible only inside the same package.
4. **private** → visible only inside the same class.

---

## 🔹 How Access Modifiers Work?

| Modifier  | Class | Same Package | Subclass (other package) | World (everywhere) |
| --------- | ----- | ------------ | ------------------------ | ------------------ |
| public    | ✔     | ✔            | ✔                        | ✔                  |
| protected | ✔     | ✔            | ✔                        | ❌                 |
| default   | ✔     | ✔            | ❌                       | ❌                 |
| private   | ✔     | ❌           | ❌                       | ❌                 |

---

## 🔹 Connected Concepts

- **Encapsulation** → access modifiers protect data.
- **Inheritance** → protected helps subclasses reuse code.
- **Abstraction** → you expose only necessary methods as `public`.
- **Packages** → default modifier is all about package-level access.

---

## 🔹 Examples

### 1. Public

```java
public class Bank {
    public String bankName = "SBI";
    public void showBank() {
        System.out.println("Bank: " + bankName);
    }
}
```

👉 Can be accessed **from anywhere**.

---

### 2. Private

```java
class Account {
    private double balance = 5000;

    // Only controlled access
    public double getBalance() {
        return balance;
    }
}
```

👉 `balance` cannot be accessed directly, only via getter.

---

### 3. Default (no modifier)

```java
class Loan {
    String type = "Home Loan"; // default
}
```

👉 Accessible only **inside same package**.

---

### 4. Protected

```java
class Employee {
    protected String name = "Rahul";
}

class Manager extends Employee {
    public void show() {
        System.out.println("Manager: " + name);
    }
}
```

👉 Subclass (even in another package if extended) can access.

---

## 🔹 Real-Life Use Cases

- **private** → sensitive data like passwords, salary.
- **protected** → framework design (allow subclass customization).
- **public** → APIs, libraries, methods for general use.
- **default** → hide from outside, but keep package-wide visibility (like utility classes).

---

## 🔹 Tricky / Interview Questions

1. Can we make a **constructor private**?
   👉 Yes, used in **Singleton Pattern**.

2. What’s the **difference between protected and default**?
   👉 Default → only same package.
   👉 Protected → same package + subclasses outside package.

3. Can a **top-level class** be private or protected?
   👉 ❌ No. Only **public** or **default** is allowed.

4. What if no modifier is given?
   👉 It becomes **default** (package-private).

5. Why do we declare instance variables as private?
   👉 To achieve **encapsulation** (control access via getters/setters).

---

✅ **Memory Trick**:

- **public** → "Open for All"
- **protected** → "Family + Relatives"
- **default** → "Only Society People (Package)"
- **private** → "Only Me (Class)"

---
