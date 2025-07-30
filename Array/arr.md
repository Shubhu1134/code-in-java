Here’s the full content of the **`arr.md`** file with all Java array concepts:

---

````markdown
# 📚 Java Array Concepts for Problem Solving

This guide covers essential concepts used to solve array-related problems in Java, from basics to advanced techniques.

---

## ✅ 1. Array Declaration and Initialization

```java
int[] arr = new int[5];         // Declaration with size
int[] arr = {1, 2, 3, 4, 5};    // Initialization with values
```
````

---

## ✅ 2. Taking Input Using Loop

```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}
```

---

## ✅ 3. Array Traversal

```java
for(int i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");
}
```

---

## ✅ 4. Conditional Checks (Even/Odd)

```java
if(arr[i] % 2 == 0) {
    // even
} else {
    // odd
}
```

---

## ✅ 5. Using Counters and Accumulators

```java
int sum = 0, evenCount = 0;
for(int i = 0; i < n; i++) {
    sum += arr[i];
    if(arr[i] % 2 == 0) evenCount++;
}
```

---

## ✅ 6. Comparisons (Find Max/Min)

```java
int max = arr[0];
for(int i = 1; i < n; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}
```

---

## ✅ 7. Searching an Element

```java
boolean found = false;
for(int i = 0; i < n; i++) {
    if(arr[i] == key) {
        found = true;
        break;
    }
}
```

---

## ✅ 8. Sorting Using Built-in Function

```java
Arrays.sort(arr); // Ascending order
```

---

## ✅ 9. Swapping Elements

```java
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
```

---

## ✅ 10. Nested Loops (For Pairs or Duplicates)

```java
for(int i = 0; i < n; i++) {
    for(int j = i+1; j < n; j++) {
        if(arr[i] == arr[j]) {
            // duplicate found
        }
    }
}
```

---

## ✅ 11. Reverse Traversal

```java
for(int i = n-1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```

---

## ✅ 12. Two Pointer Technique

```java
int i = 0, j = n - 1;
while(i < j) {
    if(arr[i] + arr[j] == target) {
        // pair found
    }
    i++;
    j--;
}
```

---

## ✅ 13. Prefix Sum / Running Sum

```java
int[] prefix = new int[n];
prefix[0] = arr[0];
for(int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
```

---

## ✅ 14. Sliding Window Technique

```java
int windowSum = 0;
for(int i = 0; i < k; i++) windowSum += arr[i];
int maxSum = windowSum;

for(int i = k; i < n; i++) {
    windowSum += arr[i] - arr[i-k];
    maxSum = Math.max(maxSum, windowSum);
}
```

---

## ✅ 15. Frequency Count (Hashing)

```java
int[] freq = new int[100];
for(int i = 0; i < n; i++) {
    freq[arr[i]]++;
}
```

---

## ✅ 16. Marking Visited Elements

```java
boolean[] visited = new boolean[n];
for(int i = 0; i < n; i++) {
    if(visited[arr[i]]) {
        // already visited
    }
    visited[arr[i]] = true;
}
```

---

## ✅ 17. Binary Search (After Sorting)

```java
Arrays.sort(arr);
int idx = Arrays.binarySearch(arr, key);
```

---

## ✅ 18. Kadane's Algorithm (Max Subarray Sum)

```java
int maxSoFar = arr[0], currMax = arr[0];
for(int i = 1; i < n; i++) {
    currMax = Math.max(arr[i], currMax + arr[i]);
    maxSoFar = Math.max(maxSoFar, currMax);
}
```

---

## ✅ 19. In-place Array Reversal

```java
int left = 0, right = n - 1;
while(left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++;
    right--;
}
```

---

## ✅ 20. 2D Arrays (Matrix Operations)

```java
int[][] mat = new int[3][3];
for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
        mat[i][j] = sc.nextInt();
    }
}
```

---

## ✅ 21. Manual Sorting (Bubble Sort)

```java
for(int i = 0; i < n-1; i++) {
    for(int j = 0; j < n-i-1; j++) {
        if(arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
```

---

## ✅ 22. Shifting Elements

```java
for(int i = pos; i < n-1; i++) {
    arr[i] = arr[i+1];
}
n--;
```

---

## ✅ 23. Remove Duplicates

```java
Set<Integer> set = new HashSet<>();
for(int i = 0; i < n; i++) {
    if(!set.contains(arr[i])) {
        set.add(arr[i]);
    }
}
```

---

## ✅ 24. Longest Increasing Subarray

```java
int maxLen = 1, len = 1;
for(int i = 1; i < n; i++) {
    if(arr[i] > arr[i-1]) len++;
    else len = 1;
    maxLen = Math.max(maxLen, len);
}
```

---

## 🧠 Tip for Beginners

Always solve problems in these steps:

1. Understand the problem
2. Identify input/output
3. Choose the correct concept from this list
4. Write, dry-run, then test your code

---
