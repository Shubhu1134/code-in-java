**Day 12**

---

# 📅 Day 12 – Runtime Errors in Loops & Switch

---

## 🔹 1. **NullPointerException in Switch (with Strings)**

```java
class Test {
    public static void main(String[] args) {
        String s = null;
        switch (s) {   // ❌ RUNTIME ERROR
            case "hi": System.out.println("Hi");
        }
    }
}
```

❌ **Error at runtime**: `Exception in thread "main" java.lang.NullPointerException`
🔎 **Why**: Switch on a `String` requires `s.hashCode()` internally.
If `s` is `null` → NPE.

✅ Fix: Always check for `null` before switch.

---

## 🔹 2. **InputMismatchException (Scanner in Loops)**

```java
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // user enters "hello"
    }
}
```

❌ **Error**: `Exception in thread "main" java.util.InputMismatchException`
🔎 **Why**: Scanner expected `int` but got `"hello"`.
✅ Fix: Validate input before reading.

---

## 🔹 3. **ArithmeticException in Loops**

```java
class Test {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println(10 / i); // ❌ i=0 → divide by zero
        }
    }
}
```

❌ **Error**: `java.lang.ArithmeticException: / by zero`
🔎 **Why**: Division by zero at runtime.
✅ Fix: Add condition check.

---

## 🔹 4. **ArrayIndexOutOfBounds in Loops**

```java
class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i <= arr.length; i++) { // ❌ should be <
            System.out.println(arr[i]);
        }
    }
}
```

❌ **Error**: `Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException`
🔎 **Why**: Accessed index `3`, but last valid index is `2`.

---

## 🔹 5. **Infinite Loop with Wrong Condition**

```java
class Test {
    public static void main(String[] args) {
        int i = 5;
        while (i < 10 && i > 20) { // ❌ logical mistake → never updates
            System.out.println(i);
        }
    }
}
```

⚠️ No compile-time error, but **infinite loop or no execution**.
🔎 **Why**: Wrong condition logic.

---

## 🔹 6. **Switch with Non-Matching Case**

```java
class Test {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
        }
        // ❌ No case matched → nothing prints, possible logic error
    }
}
```

⚠️ Not an exception, but a **runtime logic bug**.
✅ Always use `default` for safety.

---

# ✅ Day 12 Summary

- `NullPointerException` when switching on `null` Strings.
- `InputMismatchException` with Scanner.
- `ArithmeticException` (divide by zero).
- `ArrayIndexOutOfBoundsException` in loops.
- Infinite/no loop due to wrong condition.
- Switch with no matching case → silent bug.

---
