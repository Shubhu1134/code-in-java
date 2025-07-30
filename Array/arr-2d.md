Here is the complete content of **`arr-2d.md`** (copy-paste ready):

---

````markdown
# 2D Array and Matrix Problems in Java

This guide contains common 2D array concepts, patterns, and problems typically asked in interviews or competitive coding.

---

## 📌 1. What is a 2D Array?

A 2D array is an array of arrays:

```java
int[][] matrix = new int[3][3];
```
````

---

## 📌 2. Input and Output of 2D Array

```java
Scanner sc = new Scanner(System.in);
int[][] arr = new int[3][3];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        arr[i][j] = sc.nextInt();
    }
}
```

---

## 📌 3. Printing 2D Array

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

---

## 🔁 4. Transpose of Matrix

Swapping rows and columns:

```java
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
```

---

## 🔁 5. Rotate Matrix 90 Degrees Clockwise

Steps:

1. Transpose
2. Reverse each row

---

## 📌 6. Spiral Order Traversal

Print elements in a spiral format (top row → right col → bottom row → left col).

---

## 🔍 7. Search in Row & Column Sorted Matrix

Start from top-right or bottom-left:

```java
int i = 0, j = m-1;
while (i < n && j >= 0) {
    if (matrix[i][j] == key) return true;
    else if (matrix[i][j] > key) j--;
    else i++;
}
```

---

## 💧 8. Trapping Rainwater (2D version)

Advanced version of 1D rainwater problem using heaps and visited matrix.

---

## 🔣 9. Prefix Sum in 2D Arrays

Used for fast submatrix sum queries.

---

## ⭐ 10. Advanced Matrix Problems

- Diagonal Traversal
- Boundary Traversal
- Maximum rectangle in binary matrix
- Boolean Matrix problem

---

## 🚀 Practice Ideas

- Rotate matrix
- Search key in 2D matrix
- Diagonal sum
- Saddle point
- Matrix multiplication
- Boolean matrix set rows/cols

---
