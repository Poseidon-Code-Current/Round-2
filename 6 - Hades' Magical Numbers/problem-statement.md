## **Hades' Magical Numbers**

In ancient Greece, Hades, god of the underworld, needs energy to keep the underworld in balance. He has chosen three magical numbers, `x`, `y`, and `z`, to help him collect life energy.

Hermes, the clever messenger god, has found these numbers and wants to help Hades gather the maximum life energy possible. He decided to do the following at most 5 times:
- pick one of these integers
- increase it by 1

For example, if `x = 2`, `y = 3`, and `z = 4`, Hermes could increase `x` three times and `y` two times, resulting in `x = 5`, `y = 5`, and `z = 4`. This would give a maximum energy of `5 × 5 × 4 = 100`.

### **Task**
Help Hermes find the maximum life energy (`x × y × z`) he can collect by adjusting the numbers.

### **Input**
- The first line contains an integer `t` (`1 ≤ t ≤ 1000`) — the number of test cases.
- Each test case consists of a single line with three integers, `x`, `y`, and `z` (`1 ≤ x, y, z ≤ 10`).

### **Output**
For each test case, output a single integer — the maximum life energy Hermes can generate.
