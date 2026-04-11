# Experiment 1 – Union and Intersection of Sets

## Problem Statement

For given sets:

```
S1 = {S1, S2, …, Sn}
S2 = {S1, S2, …, Sn}
```

of `n` positive integers,

Design and implement an algorithm to:
- Find **Union of two sets**
- Find **Intersection of two sets**
- Compute **time complexity**

---

# 🔍 Question Analysis (What & Why)

### 1️⃣ "Sets of n positive integers"
👉 What:
- Two collections of integers

👉 Why:
- Perform **set operations (union & intersection)**

---

### 2️⃣ "Union"
👉 What:
- All unique elements from both sets

👉 Why:
- Combine both sets without duplicates

---

### 3️⃣ "Intersection"
👉 What:
- Common elements in both sets

👉 Why:
- Find overlapping elements

---

### 4️⃣ "Compute time complexity"
👉 What:
- Analyze efficiency

👉 Why:
- Compare different approaches

---

# 📘 Definitions

### Union
```
S1 ∪ S2 = {elements in S1 OR S2}
```

### Intersection
```
S1 ∩ S2 = {elements common in both}
```

---

# 🚀 Approaches

---

## 1️⃣ Brute Force Approach

### Idea

- Compare every element of S1 with every element of S2

### Union:
- Add all elements of S1
- For each element in S2:
  - Check if it exists in S1
  - If not, add it

### Intersection:
- For each element in S1:
  - Check in S2
  - If found → add to result

### Time Complexity
```
O(n²)
```

### Space Complexity
```
O(n)
```

### Limitation
- Slow for large inputs

---

## 2️⃣ Sorting + Two Pointer Approach

### Idea

- Sort both sets
- Use two pointers to traverse

### Union:
- Merge both sorted arrays

### Intersection:
- Move both pointers:
  - If equal → add to result
  - Else move smaller element pointer

### Time Complexity
```
O(n log n)
```
(Sorting dominates)

### Space Complexity
```
O(n)
```

### Limitation
- Sorting adds overhead

---

## 3️⃣ HashSet Approach (Optimal) ⭐

### Idea

- Use HashSet for fast lookup

### Union:
- Insert all elements from both sets into HashSet

### Intersection:
- Store S1 in HashSet
- Traverse S2:
  - If element exists → add to intersection

### Time Complexity
```
O(n)
```

### Space Complexity
```
O(n)
```

### Advantage
- Fastest approach
- Handles duplicates automatically

---

# 💻 Implementation (Java)

```java
import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        int[] S1 = {1, 2, 3, 4};
        int[] S2 = {3, 4, 5, 6};

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Union
        for (int num : S1) union.add(num);
        for (int num : S2) union.add(num);

        // Intersection
        Set<Integer> set1 = new HashSet<>();
        for (int num : S1) set1.add(num);

        for (int num : S2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
```

---

# ⏱ Final Comparison

| Approach | Time Complexity | Space Complexity | Notes |
|--------|--------|--------|--------|
| Brute Force | O(n²) | O(n) | Slow |
| Sorting + Two Pointer | O(n log n) | O(n) | Sorting needed |
| HashSet (Optimal) | O(n) | O(n) | Best |

---

# 🎯 Final Insight

```
Use HashSet for fast lookup and automatic duplicate removal
```

👉 This gives optimal performance for both union and intersection.
