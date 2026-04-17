# 📘 Experiment 3: Longest Common Subsequence (LCS)

---

## 🧾 Problem Statement

Given two sequences, find the **length of the longest subsequence** present in both.

A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.

👉 Example subsequences of "abcdefg":

* "abc", "abg", "bdf", "aeg", "acefg"

---

## 🎯 Objective

* Understand subsequence concept
* Apply **Dynamic Programming (DP)**
* Learn optimal substructure & overlapping subproblems

---

## 📌 Key Concept

### Longest Common Subsequence (LCS)

* Common → present in both sequences
* Subsequence → order matters, continuity not required

👉 Example:
S1 = "ABCBDAB"
S2 = "BDCABA"

LCS = "BCBA" (length = 4)

---

## 🧠 Approach (Dynamic Programming)

### Idea:

* Use a 2D DP table
* dp[i][j] = LCS length of first i chars of S1 and first j chars of S2

---

## 💻 Recurrence Relation

If characters match:

```
dp[i][j] = 1 + dp[i-1][j-1]
```

If not match:

```
dp[i][j] = max(dp[i-1][j], dp[i][j-1])
```

---

## 🧾 Algorithm Steps

1. Create dp table of size (m+1) x (n+1)
2. Initialize first row and column with 0
3. Fill table using recurrence
4. Final answer = dp[m][n]

---

## 💻 Pseudocode

```
for i = 0 to m:
   dp[i][0] = 0

for j = 0 to n:
   dp[0][j] = 0

for i = 1 to m:
   for j = 1 to n:
      if S1[i-1] == S2[j-1]:
         dp[i][j] = 1 + dp[i-1][j-1]
      else:
         dp[i][j] = max(dp[i-1][j], dp[i][j-1])

return dp[m][n]
```

---

## ⏱ Time & Space Complexity

* **Time Complexity:** O(m × n)
* **Space Complexity:** O(m × n)

👉 Optimized space: O(min(m, n))

---

## 🧪 Example Walkthrough

S1 = "ABC"
S2 = "AC"

DP Table:

|   | A | C |
| - | - | - |
| A | 1 | 1 |
| B | 1 | 1 |
| C | 1 | 2 |

Answer = 2

---

## ❓ Viva Questions (with Answers)

1. **Difference between substring and subsequence?**

   * Substring: contiguous characters (e.g., "ABC" in "ABCDE")
   * Subsequence: order maintained, not necessarily contiguous (e.g., "ACE")

2. **Why DP is used in LCS?**

   * Because the problem has **overlapping subproblems** and **optimal substructure**, making DP efficient.

3. **What is optimal substructure?**

   * The solution of a problem can be built from solutions of its smaller subproblems.

4. **Can LCS be solved using recursion?**

   * Yes, but it is inefficient (exponential time). DP optimizes it.

5. **What is time complexity of brute force?**

   * O(2^n) (exponential), since it checks all subsequences.

---

## 📝 Conclusion

* LCS is a classic DP problem
* Shows importance of breaking into subproblems
* Efficient solution using tabulation

---

## ✅ After Reading This, You Should Be Able To:

* Identify LCS problems
* Write recurrence relation
* Build DP table
* Solve questions in exam and viva

---
