# 📘 Experiment 5: Hamiltonian Cycle (Backtracking)

---

## 🧾 Problem Statement

Design and implement an algorithm to find all **Hamiltonian Cycles** in a connected undirected graph G of n vertices using **backtracking**.

---

## 🎯 Objective

* Understand Backtracking technique
* Solve graph traversal problems
* Learn constraint-based search

---

## 📌 Key Concept

### Hamiltonian Cycle

* A cycle that visits **each vertex exactly once** and returns to starting vertex

👉 Example:
Graph: 0 → 1 → 2 → 3 → 0 (valid cycle)

---

## 🧠 Approach (Backtracking)

1. Start from vertex 0
2. Add vertices one by one
3. Check:

   * Vertex is adjacent
   * Not already visited
4. If all vertices included and last connects to first → solution
5. Else backtrack

---

## 💻 Pseudocode

```
function solve(pos):
   if pos == n:
      if last vertex connects to first:
         print solution
      return

   for each vertex v:
      if isSafe(v, pos):
         path[pos] = v
         solve(pos + 1)
         remove v (backtrack)
```

---

## ⏱ Time Complexity

* Worst case: **O(n!)**
* Because all permutations are explored

---

## 🧪 Example

Graph (Adjacency Matrix):

0 1 1 0
1 0 1 1
1 1 0 1
0 1 1 0

Output:
0 → 1 → 2 → 3 → 0

---

## ❓ Viva Questions (with Answers)

1. **What is Hamiltonian Cycle?**
   A cycle visiting every vertex exactly once and returning to start.

2. **Difference between Hamiltonian and Euler cycle?**
   Hamiltonian → visits vertices once
   Euler → visits edges once

3. **Why backtracking is used?**
   To explore all possibilities and reject invalid paths.

4. **Time complexity?**
   O(n!)

5. **Is there a greedy solution?**
   No, it requires exhaustive search.

---

## 📝 Conclusion

* Hamiltonian cycle is NP-complete problem
* Backtracking helps in finding solutions
* Useful for understanding complex graph problems

---

## ✅ After Reading This, You Should Be Able To:

* Understand Hamiltonian concept
* Apply backtracking
* Solve similar graph problems

---
