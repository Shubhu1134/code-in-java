**Concept 12: Methods (Functions) in Java**

---

# 🔹 Concept 12: Methods in Java

---

## 1️⃣ Why Methods?

- Programs can become **very long** if we write all code in `main()`.
- **Methods allow code reuse**, **modularity**, and **better readability**.
- Helps in **breaking complex problems** into smaller tasks.

---

## 2️⃣ What is a Method?

- A **method is a block of code** that performs a specific task.
- Can take **parameters** (input) and may **return a value** (output).

### Syntax:

```java
returnType methodName(parameters) {
    // body
}
```

- `returnType` → type of value returned (`void` if nothing)
- `methodName` → valid identifier
- `parameters` → optional inputs

---

## 3️⃣ How Methods Work

1. Declared in a class.
2. Called from **main()** or other methods.
3. **Pass values** → parameters.
4. **Return values** → use `return`.

### Example:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum = c.add(5, 10);
        System.out.println(sum); // 15
    }
}
```

---

## 4️⃣ Types of Methods

### (a) Based on Return Type

1. **void** → no value returned

```java
void greet() {
    System.out.println("Hello!");
}
```

2. **Non-void** → returns a value

```java
int square(int n) { return n*n; }
```

### (b) Based on Parameters

1. **No parameters**

```java
void sayHi() { System.out.println("Hi!"); }
```

2. **With parameters**

```java
void greet(String name) { System.out.println("Hello " + name); }
```

---

## 5️⃣ Method Calling

- **Direct call** (same class, static method)

```java
static void greet() { ... }
greet();
```

- **Object call** (non-static method)

```java
Calculator c = new Calculator();
c.add(5, 10);
```

- **From another class**

```java
OtherClass obj = new OtherClass();
obj.methodName();
```

---

## 6️⃣ Method Overloading (Compile-Time Polymorphism)

- **Same method name**, **different parameters**.

```java
int add(int a, int b) { return a+b; }
double add(double a, double b) { return a+b; }
```

- Compiler decides **which method to call** → based on argument types.

---

## 7️⃣ Connections

- **Variables** → used as method parameters and local variables.
- **Loops & Conditions** → often used inside methods.
- **Static & Final** → `static methods` do not need object, `final methods` cannot be overridden.
- **OOP** → Methods inside classes → abstraction & encapsulation.

---

## 8️⃣ Use Cases

- Performing calculations (sum, factorial, prime check).
- Reusable tasks (printing menus, validating input).
- Dividing large programs into small manageable parts.
- API methods (Java library methods like `Math.max()`).

---

## 9️⃣ Interview Questions

### Basic

1. Difference between **static and non-static methods**?
2. What is **method overloading**?
3. Difference between **method overloading and overriding**?

### Intermediate / Tricky

1. Can a method return multiple values?

   - ❌ Not directly, but can return **array, object, or List**.

2. Can a method be recursive?

   - ✅ Yes, calling itself inside body.

3. Difference between **pass by value and pass by reference** in Java methods?

   - Primitive → pass by value
   - Object → pass object reference (still pass by value of reference)

4. What is **varargs**?

```java
void sum(int... nums) { ... }
```

- Accepts **variable number of arguments**.

---

## 10️⃣ Example: Method with Parameters & Return

```java
class Calculator {
    int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) fact *= i;
        return fact;
    }
}

class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.factorial(5)); // 120
    }
}
```

---

✅ **Memory / Mind Map**

```
Method → Block of code → performs task
Return type → void / value
Parameters → optional inputs
Calling → object/static/direct
Overloading → same name, different parameters
```

---
