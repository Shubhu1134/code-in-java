**Concept 10: Arrays in Java**

---

# 🔹 Concept 10: Arrays in Java

---

## 1️⃣ Why Arrays?

- Suppose you need to store **100 student marks**.
- Using **100 separate variables** is impractical.
- **Array** → allows you to **store multiple values of the same type under one name**.
- Makes **looping, sorting, searching** much easier.

---

## 2️⃣ What is an Array?

- An **array is a container** that holds **fixed number of values of the same type**.
- Each value is called an **element**.
- Each element has an **index** starting from 0.

---

## 3️⃣ How to Declare & Initialize Arrays?

### (a) Declaration

```java
int[] marks;   // preferred
int marks2[];  // also valid
```

### (b) Memory Allocation

```java
marks = new int[5]; // array of size 5
```

### (c) Initialization

```java
marks[0] = 10;
marks[1] = 20;
```

### (d) Combined

```java
int[] marks = {10, 20, 30, 40, 50};
```

---

## 4️⃣ How Arrays Work in Memory

- Array name → reference pointing to memory block.
- All elements stored **contiguously**.
- Fixed size → cannot grow dynamically (for dynamic arrays use **ArrayList**).

---

## 5️⃣ Looping through Arrays

```java
int[] nums = {5, 10, 15, 20};
for(int i=0; i<nums.length; i++) {
    System.out.println(nums[i]);
}
```

- Can also use **enhanced for loop**:

```java
for(int num : nums) {
    System.out.println(num);
}
```

---

## 6️⃣ Common Array Operations

1. **Sum / Average**

```java
int sum = 0;
for(int n : nums) sum += n;
double avg = sum / nums.length;
```

2. **Finding Max / Min**

```java
int max = nums[0];
for(int n : nums) if(n>max) max = n;
```

3. **Reverse Array**
4. **Search** → linear search, binary search (sorted array)
5. **Sort** → bubble, selection, insertion

---

## 7️⃣ Connections

- **Loops** → essential for traversing arrays.
- **Variables & Operators** → array elements are variables; arithmetic used on them.
- **Type Casting** → sometimes needed when performing operations on arrays.
- **OOP** → arrays of objects (Student\[] students).

---

## 8️⃣ Interview Questions

1. Difference between **array and ArrayList**?
2. How to find the **largest element** in an array?
3. How to reverse an array in Java?
4. Can an array store **different data types**?

   - ❌ No, primitive arrays store only one type; Object arrays can store objects of same type.

5. Explain **array index out of bounds** exception.
6. Difference between **length (array) and length() (String)**?

---

## 9️⃣ Tricky / Edge Cases

- Empty array → length = 0
- Accessing negative index → `ArrayIndexOutOfBoundsException`
- Declaring array but not initializing → `NullPointerException`
- Multi-dimensional arrays → `int[][] matrix = new int[3][3];`

---

## 10️⃣ Example: Array of Objects

```java
class Student {
    String name;
    Student(String n){ name=n; }
}
class Test {
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student("Rahul");
        students[1] = new Student("Amit");
        students[2] = new Student("Sneha");

        for(Student s : students){
            System.out.println(s.name);
        }
    }
}
```

---

✅ **Memory Tip / Mind Map**

```
Array → Contiguous memory
Index → starts 0
Fixed size → cannot grow
Loop → traverse elements
Operations → sum, max, min, reverse, search
```

---
