**Day 29**.

---

# 📅 Day 29 – Errors in **Advanced Multithreading & Synchronization**

Today we’ll cover **common mistakes, runtime exceptions, and logical errors** in multithreading, focusing on **synchronization, deadlocks, wait/notify, and thread states**.

---

## 🔹 1. Starting a Thread Twice

❌ Wrong:

```java
class MyThread extends Thread {
    public void run() { System.out.println("Running"); }
}

class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.start(); // ❌ second start
    }
}
```

**Runtime Error:** `IllegalThreadStateException`

✅ Fix: Always create a **new thread object** for each start.

---

## 🔹 2. Overriding `start()` Improperly

❌ Wrong:

```java
class MyThread extends Thread {
    public void start() {
        System.out.println("Start overridden");
    }
}
```

👉 No new thread created → logical error.

✅ Correct:

```java
@Override
public void start() {
    super.start(); // call parent start()
}
```

---

## 🔹 3. Deadlock

```java
class Test {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(lock1) {
                synchronized(lock2) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(lock2) {
                synchronized(lock1) {}
            }
        });

        t1.start();
        t2.start(); // ❌ possible deadlock
    }
}
```

**Logical Error:** program may freeze → deadlock.

✅ Fix: Lock objects in **same order**.

---

## 🔹 4. Synchronizing on Wrong Object

❌ Wrong:

```java
class Counter {
    void increment() {
        synchronized(new Object()) { // ❌ each thread has different lock
        }
    }
}
```

👉 Threads don’t block each other → race condition.

✅ Correct:

```java
synchronized(this) { } // or use a shared lock object
```

---

## 🔹 5. Calling `wait()`/`notify()` Incorrectly

❌ Wrong:

```java
Object lock = new Object();
lock.wait(); // ❌ IllegalMonitorStateException
```

**Runtime Error:** `IllegalMonitorStateException`

✅ Must hold the lock:

```java
synchronized(lock) {
    lock.wait();
    lock.notify();
}
```

---

## 🔹 6. Thread Sleep & InterruptedException

❌ Wrong:

```java
Thread.sleep(1000); // ❌ unhandled checked exception
```

**Error:** `unreported exception InterruptedException`

✅ Fix:

```java
try { Thread.sleep(1000); }
catch (InterruptedException e) { e.printStackTrace(); }
```

---

## 🔹 7. Daemon Thread Misuse

❌ Wrong:

```java
Thread t = new Thread();
t.start();
t.setDaemon(true); // ❌ must be before start
```

**Runtime Error:** `IllegalThreadStateException`

✅ Correct:

```java
Thread t = new Thread();
t.setDaemon(true);
t.start();
```

---

## 🔹 8. Priority Out of Range

❌ Wrong:

```java
Thread t = new Thread();
t.setPriority(11); // ❌ max = 10
```

**Runtime Error:** `IllegalArgumentException`

✅ Valid range: 1–10

---

## 🔹 9. Modifying Collections Without Synchronization

❌ Wrong:

```java
List<Integer> list = new ArrayList<>();
// multiple threads modify list without lock
```

**Logical Error:** race condition → inconsistent data

✅ Fix:

```java
Collections.synchronizedList(new ArrayList<>());
```

---

## 🔹 10. Thread Interruption

```java
Thread t = new Thread(() -> {
    try { Thread.sleep(5000); }
    catch (InterruptedException e) { System.out.println("Interrupted!"); }
});

t.start();
t.interrupt(); // signals interruption
```

❌ Wrong if you ignore `InterruptedException` → thread continues wrongly.

---

## 🔹 11. Key Takeaways

- ✅ Always use **`start()`**, not `run()`.
- ✅ Deadlocks happen if threads lock in **different order**.
- ✅ `wait()`/`notify()` require **monitor lock**.
- ✅ Daemon threads must be set **before start**.
- ✅ Handle `InterruptedException` correctly.
- ✅ Synchronize shared mutable data → prevent race conditions.

---
