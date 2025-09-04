**Day 24**.

---

# 📅 Day 24 – Errors in **Threads & Multithreading**

Java multithreading is powerful but also error-prone. Today we’ll cover **compiler errors + runtime errors + logical errors** you face when working with `Thread` and `Runnable`.

---

## 🔹 1. Extending Thread vs Implementing Runnable

✅ Correct:

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

class Test {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
```

❌ Wrong:

```java
class MyThread implements Runnable {
    // forgot run() method ❌
}
```

**Error:** `class MyThread must be declared abstract or implement abstract method run() in Runnable`

👉 If you implement `Runnable`, you **must override `run()`**.

---

## 🔹 2. Calling `run()` Instead of `start()`

❌ Wrong:

```java
class MyThread extends Thread {
    public void run() { System.out.println("Running"); }
}

class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run(); // ❌ runs in main thread, not a new thread
    }
}
```

👉 No compiler error, but logic error. Only `start()` creates a new thread.

---

## 🔹 3. Starting a Thread Twice

❌ Wrong:

```java
class MyThread extends Thread {
    public void run() { System.out.println("Running"); }
}

class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.start(); // ❌ second time
    }
}
```

**Runtime Error:** `IllegalThreadStateException`

👉 A thread can be started **only once**.

---

## 🔹 4. Overriding `start()` Without Calling `super.start()`

❌ Wrong:

```java
class MyThread extends Thread {
    public void start() {
        System.out.println("Start overridden");
    }
    public void run() {
        System.out.println("Run method");
    }
}

class Test {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
```

👉 No new thread will start → only prints `"Start overridden"`.
**Logical Error** – because `super.start()` was never called.

✅ Correct:

```java
@Override
public void start() {
    super.start(); // must call parent start
}
```

---

## 🔹 5. Not Handling InterruptedException

```java
class Test {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000); // ❌ checked exception
        } catch(Exception e) {
            // handle
        }
    }
}
```

❌ Wrong if you don’t handle:

```java
Thread.sleep(1000); // compiler error
```

**Error:** `unreported exception InterruptedException; must be caught or declared to be thrown`

---

## 🔹 6. Synchronization Mistakes

### ❌ Synchronizing Static + Non-Static Methods Separately

```java
class Counter {
    public synchronized void increment() { }  // object lock
    public static synchronized void decrement() { } // class lock
}
```

👉 Different locks → may cause **race conditions** if you think they’re the same.
(Not compiler error, but logical error).

---

### ❌ Synchronizing on Wrong Object

```java
class Test {
    Object lock1 = new Object();
    Object lock2 = new Object();

    void doWork() {
        synchronized(lock1) {
            synchronized(lock1) {  // ❌ deadlock risk if inconsistent usage
            }
        }
    }
}
```

👉 Not a compile-time error, but may **cause deadlock at runtime**.

---

## 🔹 7. Daemon Thread Error

❌ Wrong:

```java
Thread t = new Thread();
t.start();
t.setDaemon(true); // ❌ must be before start
```

**Runtime Error:** `IllegalThreadStateException`

👉 Must call `setDaemon(true)` **before starting** the thread.

---

## 🔹 8. Priority Out of Range

❌ Wrong:

```java
Thread t = new Thread();
t.setPriority(11); // ❌ max = 10
```

**Runtime Error:** `IllegalArgumentException`

---

## 🔹 9. Overriding `run()` with Wrong Signature

❌ Wrong:

```java
class MyThread extends Thread {
    public void run(int x) { System.out.println("Wrong"); } // not overriding
}
```

👉 No compiler error, but thread will execute an **empty default `run()`** → nothing happens.

✅ Correct:

```java
public void run() { ... }
```

---

## 🔹 10. Common Takeaways

- `start()` creates a thread; `run()` just calls a method.
- Thread cannot be restarted.
- Always handle `InterruptedException` from `sleep()` or `join()`.
- Daemon must be set before `start()`.
- Thread priority is only `1–10`.
- Wrong `run()` signature silently breaks execution.
- Synchronization bugs often cause deadlocks, not compile errors.

---

✅ **Day 24 complete** – You now know **thread & multithreading errors** from basics to advanced.
