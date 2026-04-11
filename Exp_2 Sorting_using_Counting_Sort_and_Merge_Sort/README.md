# Experiment – Counting Sort & Merge Sort

## Problem Statement

Sort a given set of `n` integer elements using:

a) Counting Sort  
b) Merge Sort  

Compare their time complexity.

---

---

# 🚀 Approaches

---

## 1️⃣ Counting Sort

### 💡 Logic (Small Code)
```java
int max = getMax(arr);
int[] count = new int[max + 1];

// count frequency
for (int num : arr) count[num]++;

// rebuild array
for (int i = 0; i <= max; i++) {
    while (count[i] > 0) {
        arr[index++] = i;
        count[i]--;
    }
}
```

---

### ⏱ Complexity

```
Time: O(n + k)
Space: O(k)
```

👉 Reason:
- Count array depends on range `k`

---

## 2️⃣ Merge Sort

### 💡 Logic (Small Code)
```java
if (left < right) {
    int mid = (left + right) / 2;

    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);

    merge(arr, left, mid, right);
}
```

---

### ⏱ Complexity

```
Time: O(n log n)
Space: O(n)
```

👉 Reason:
- Divide → log n levels  
- Merge → O(n) work each level  

---

# ⭐ Optimized Approach (When to Use What)

👉 There is no single universal "best" sorting:

- If **range is small** → Counting Sort is optimal  
- If **general case / large input** → Merge Sort is optimal  

---



```

---

# 📊 Final Comparison

| Algorithm | Time | Space | Best Use |
|----------|------|------|---------|
| Counting Sort | O(n + k) | O(k) | Small range |
| Merge Sort | O(n log n) | O(n) | General purpose |

---

# 🎯 Final Insight

```
Counting Sort → Fast but limited
Merge Sort → Slightly slower but universal
```
