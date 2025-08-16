---

````markdown
# Two Sum Problem – Solution Comparison

This document explains and compares **two different approaches** to solving the classic *Two Sum* problem in Java.

---

## 📌 Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

---

## 📝 Solution 1: Brute Force

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
```

### 🔹 Explanation

- Check every possible pair `(i, j)` using nested loops.
- If their sum equals the target, return their indices.
- Time Complexity: **O(n²)**
- Space Complexity: **O(1)**

### ✅ Pros

- Simple and beginner friendly.
- Easy to read and understand.

### ❌ Cons

- Very slow for large arrays.
- Without `break`, it may return the _last_ valid pair instead of the first.

### 🔄 Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Loop i = 0 to n-1]
    B --> C[Loop j = i+1 to n-1]
    C --> D{nums[i] + nums[j] == target?}
    D -- Yes --> E[Return {i, j}]
    D -- No --> C
    C -->|j ends| B
    B -->|i ends| F[Return empty array]
```

---

## 📝 Solution 2: Gap-Based Approach

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=1; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[j] + nums[j-i] == target) {
                    return new int[]{j, j-i};
                }
            }
        }
        return new int[]{};
    }
}
```

### 🔹 Explanation

- Instead of checking all `(i, j)`, this solution uses the concept of **gap**.
- For each distance `i`, it checks pairs `(j, j-i)`.
- If their sum matches the target, return indices immediately.
- Time Complexity: **O(n²)**
- Space Complexity: **O(1)**

### ✅ Pros

- Returns immediately when a valid pair is found.
- Shows a new way of thinking about pairs (via gaps).

### ❌ Cons

- Slightly less intuitive than brute force.
- Still O(n²), so not faster.
- May return indices in reverse order.

### 🔄 Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Loop gap i = 1 to n-1]
    B --> C[Loop j = i to n-1]
    C --> D{nums[j] + nums[j-i] == target?}
    D -- Yes --> E[Return {j, j-i}]
    D -- No --> C
    C -->|j ends| B
    B -->|i ends| F[Return empty array]
```

---

## ⚖️ Comparison Table

| Aspect             | Brute Force            | Gap-Based            |
| ------------------ | ---------------------- | -------------------- |
| Readability        | ✅ Very easy           | ❌ Less intuitive    |
| Time Complexity    | O(n²)                  | O(n²)                |
| Space Complexity   | O(1)                   | O(1)                 |
| Returns First Pair | ❌ (unless break used) | ✅ Yes               |
| Novelty / Insight  | Normal approach        | Fresh "gap" approach |

---

## 🚀 Optimized Solution (Best Practice)

For large arrays, the **HashMap** approach is preferred:

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

- Time Complexity: **O(n)**
- Space Complexity: **O(n)**
- Efficient and widely used in interviews.

### 🔄 Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Loop i = 0 to n-1]
    B --> C[complement = target - nums[i]]
    C --> D{map contains complement?}
    D -- Yes --> E[Return {map.get(complement), i}]
    D -- No --> F[map.put(nums[i], i)]
    F --> B
    B -->|end| G[Return empty array]
```

---

## 🎯 Conclusion

- **Brute Force** → Beginner friendly, but slow.
- **Gap-Based** → Creative way of thinking, but still O(n²).
- **HashMap** → Best solution (O(n)), used in interviews.

---

```

---
```
