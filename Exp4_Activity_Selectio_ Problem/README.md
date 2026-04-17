# 📘 Experiment 4: Activity Selection Problem

---

## 🧾 Problem Statement

You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

---

## 🎯 Objective

* Understand Greedy Algorithm
* Learn optimal selection strategy
* Solve scheduling problems efficiently

---

## 📌 Key Concept

### Greedy Approach

* Always choose the activity that finishes earliest
* This leaves maximum room for remaining activities

---

## 🧠 Approach

1. Sort activities based on **finish time**
2. Select first activity
3. For remaining activities:

   * If start time ≥ last selected finish time → select it

---

## 💻 Pseudocode

```
sort activities by finish time

select first activity
last_finish = finish time of first

for each activity:
   if start >= last_finish:
      select activity
      last_finish = finish
```

---

## ⏱ Time Complexity

* Sorting: O(n log n)
* Selection: O(n)
* Overall: **O(n log n)**

---

## 🧪 Example

Start = {1,3,0,5,8,5}
Finish = {2,4,6,7,9,9}

Selected Activities:
(1,2), (3,4), (5,7), (8,9)

---

## ❓ Viva Questions (with Answers)

1. **What is greedy algorithm?**
   Makes locally optimal choice at each step.

2. **Why sort by finish time?**
   To maximize number of activities.

3. **Is this always optimal?**
   Yes, proven greedy strategy.

4. **Time complexity?**
   O(n log n)

5. **Real life application?**
   Scheduling meetings, CPU task scheduling.

---

## 📝 Conclusion

* Activity selection is classic greedy problem
* Sorting + selection gives optimal result

---

## ✅ After Reading This, You Should Be Able To:

* Understand greedy logic
* Solve scheduling problems
* Explain in exam and viva

---
