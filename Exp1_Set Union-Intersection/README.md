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

```
# 🔹 Approach Logic (Code Snippets)

---

## 1️⃣ Brute Force Approach

### 🔸 Union Logic
```java
List<Integer> union = new ArrayList<>();

// Add all elements of S1
for (int i = 0; i < S1.length; i++) {
    union.add(S1[i]);
}

// Add elements of S2 if not present
for (int i = 0; i < S2.length; i++) {
    boolean found = false;
    for (int j = 0; j < S1.length; j++) {
        if (S2[i] == S1[j]) {
            found = true;
            break;
        }
    }
    if (!found) {
        union.add(S2[i]);
    }
}
```

---

### 🔸 Intersection Logic
```
List<Integer> intersection = new ArrayList<>();

for (int i = 0; i < S1.length; i++) {
    for (int j = 0; j < S2.length; j++) {
        if (S1[i] == S2[j]) {
            intersection.add(S1[i]);
            break;
        }
    }
}
```

---
### Time Complexity
```
O(n²)
```

### Space Complexity
```
O(n)   :   Extra space used to store union/intersection result
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
O(n log n)     :     (Sorting dominates)
```

### Space Complexity
```
O(n)      :      Space required to store result arrays
```

### Limitation
- Sorting adds overhead

---

### 🔸 Union Logic
```
Arrays.sort(S1);
Arrays.sort(S2);

int i = 0, j = 0;
List<Integer> union = new ArrayList<>();

while (i < S1.length && j < S2.length) {
    if (S1[i] < S2[j]) {
        union.add(S1[i++]);
    } else if (S1[i] > S2[j]) {
        union.add(S2[j++]);
    } else {
        union.add(S1[i]);
        i++; j++;
    }
}

// Remaining elements
while (i < S1.length) union.add(S1[i++]);
while (j < S2.length) union.add(S2[j++]);
```

---

### 🔸 Intersection Logic
```
Arrays.sort(S1);
Arrays.sort(S2);

int i = 0, j = 0;
List<Integer> intersection = new ArrayList<>();

while (i < S1.length && j < S2.length) {
    if (S1[i] < S2[j]) {
        i++;
    } else if (S1[i] > S2[j]) {
        j++;
    } else {
        intersection.add(S1[i]);
        i++; j++;
    }
}
```
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
O(n)    :       Insertion into HashSet → O(1) (average)
              - Checking element (contains) → O(1)
              - We process each element once → **O(n)**
```

### Space Complexity
```
O(n)    :       HashSet stores up to `n` elements
               - Result sets also take space
```

### Advantage
- Fastest approach
- Handles duplicates automatically

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
