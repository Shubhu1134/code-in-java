**Concept 9: Loops & Control Flow in Java**
W

---

# 🔹 Concept 9: Loops & Control Flow

---

## 1️⃣ Why Control Flow & Loops?

- Programs need to **make decisions** or **repeat actions**.
- Without control flow: your program would **run line by line** with no logic or repetition.
- Loops → **repeat tasks efficiently**.
- Conditional statements → **choose paths** based on conditions.

---

## 2️⃣ What is Control Flow?

Control flow decides **which code executes when**.

### Types:

1. **Decision Making** → `if`, `if-else`, `if-else-if`, `switch`
2. **Loops** → `for`, `while`, `do-while`
3. **Branching** → `break`, `continue`, `return`

---

## 3️⃣ Decision Making Statements

### (a) `if` Statement

```java
int age = 18;
if (age >= 18) {
    System.out.println("Adult");
}
```

### (b) `if-else`

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### (c) `if-else-if` Ladder

```java
int marks = 75;
if (marks >= 90) System.out.println("A+");
else if (marks >= 75) System.out.println("A");
else System.out.println("B");
```

### (d) `switch`

```java
int day = 3;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid Day");
}
```

---

## 4️⃣ Loops

### (a) `for` Loop

- Known number of iterations.

```java
for (int i=1; i<=5; i++) {
    System.out.println("Hello " + i);
}
```

### (b) `while` Loop

- Unknown iterations, condition-based.

```java
int i = 1;
while(i<=5) {
    System.out.println("Hi " + i);
    i++;
}
```

### (c) `do-while` Loop

- Executes **at least once**, then checks condition.

```java
int i = 1;
do {
    System.out.println("Hey " + i);
    i++;
} while(i <= 5);
```

---

## 5️⃣ Branching Keywords

1. **break** → exits loop or switch immediately.
2. **continue** → skips current iteration, goes to next.
3. **return** → exits from method.

Example:

```java
for(int i=1; i<=5; i++) {
    if(i==3) continue; // skip 3
    if(i==5) break;    // exit loop
    System.out.println(i);
}
```

Output: 1, 2, 4

---

## 6️⃣ Connections

- **Variables** → loop counters, conditions.
- **Operators** → logical (`&&`, `||`), relational (`>`, `<`) used in conditions.
- **Type casting** → sometimes needed in calculations inside loops.
- **Static & Final** → constants in loops.

---

## 7️⃣ Use Cases

- Iterating arrays, lists, or strings.
- Menu-driven programs (using `switch`).
- Validating user input.
- Repeating tasks until a condition is met.

---

## 8️⃣ Tricky / Interview Questions

1. Difference between `while` and `do-while`?

   - `do-while` executes **at least once**, `while` may not execute if condition false.

2. Infinite loop example?

```java
for(;;) { System.out.println("Hello"); }
```

3. Difference between `break` and `continue`?

4. Can we use `switch` with String in Java 8?

   - ✅ Yes, since Java 7.

5. Nested loops → calculate sum, pattern printing, etc.

---

## 9️⃣ Tips / Tricks

- Always update loop counter to avoid **infinite loops**.
- Use **break carefully** inside nested loops (can break only the current loop).
- For pattern printing → master nested loops.
- Think **loop + condition + variable** as three pillars: “control flow logic”.

---
