# Hera’s Quest for Power

Hera, queen of the gods, wants to find the second highest power level among her champions. She has a list of their power levels, and if there’s only one unique power level, she will return -1.

Your task is to complete a function, `findSecondLargestPower`, that returns the second-highest power level in the list. If no second-highest exists, return -1.

### Input

- The first line contains an integer `T` – the number of test cases.
- For each test case, a single integer `N` denoting the size of the power list
- The next line contains `N` space separated integers denoting the power levels

### Output

- An integer: the second-highest unique power level or -1 if it doesn’t exist.

### Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 10<sup>3</sup>
- 1 ≤ Power[i] ≤ 10<sup>5</sup> 