Awesome ⚡ Let’s go **step by step with practice code** for **Inheritance in Java**.
I’ll give you **small examples for each case** so you can **code → run → understand** one by one.

---

# 🟢 Step 1: Single Inheritance

```java
// Single Inheritance Example
class Parent {
    void display() {
        System.out.println("I am the Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("I am the Child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // from Parent
        c.show();    // from Child
    }
}
```

✅ Output:

```
I am the Parent class
I am the Child class
```

---

# 🟢 Step 2: Multilevel Inheritance

```java
// Multilevel Inheritance Example
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
        c.greet(); // from Grandparent
        c.work();  // from Parent
        c.play();  // from Child
    }
}
```

✅ Output:

```
Hello from Grandparent
Parent is working
Child is playing
```

---

# 🟢 Step 3: Hierarchical Inheritance

```java
// Hierarchical Inheritance Example
class Parent {
    void speak() {
        System.out.println("I am the Parent");
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

✅ Output:

```
I am the Parent
Child1 is studying
I am the Parent
Child2 is playing
```

---

# 🟢 Step 4: Protected Members in Inheritance

```java
// Protected Access Example
class Animal {
    protected void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        sound(); // accessible because protected
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

✅ Output:

```
Animal makes sound
Dog barks
```

---

# 🟢 Step 5: Method Overriding (Polymorphism)

```java
// Method Overriding Example
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
        p.message(); // Child's method runs at runtime
    }
}
```

✅ Output:

```
Message from Child
```

---

# 🟢 Step 6: Using `super`

```java
// super keyword Example
class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // calls parent method
        System.out.println("Child method");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
```

✅ Output:

```
Parent method
Child method
```

---

# 🟢 Step 7: Final Method (Security)

```java
// final prevents overriding
class Parent {
    final void secureMethod() {
        System.out.println("This method cannot be overridden");
    }
}

class Child extends Parent {
    // void secureMethod() { } ❌ ERROR - cannot override
    void normalMethod() {
        System.out.println("Child normal method");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.secureMethod();
        c.normalMethod();
    }
}
```

✅ Output:

```
This method cannot be overridden
Child normal method
```

---

# 🟢 Step 8: Real-World Example (Bank Accounts)

```java
// Real-world Inheritance Example
class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accNo, double bal) {
        this.accountNumber = accNo;
        this.balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.05;

    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 1000;

    CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000);
        sa.deposit(1000);
        sa.addInterest();

        CurrentAccount ca = new CurrentAccount("CA456", 2000);
        ca.withdraw(2500); // allowed because overdraft
        ca.withdraw(2000); // exceeds overdraft
    }
}
```

---

👉 These 8 steps cover **every case of inheritance in Java**:
✅ Single, Multilevel, Hierarchical
✅ protected usage
✅ Method Overriding + super
✅ final (security)
✅ Real-world project-style

---
