# *Poseidon's Path Score*

Poseidon, while navigating the treacherous seas, encounters various mythical obstacles represented by the characters in a string `s`. The strength of each obstacle is measured by the ASCII value of the character symbolizing it. Poseidon's **Path Score** is the sum of the **absolute differences in strength** (ASCII values) between each pair of adjacent obstacles in the path.

Your mission is to calculate Poseidon's **total path score** by summing these differences in ASCII values across each step.

## Input Format

- The first line contains an integer `T` – the number of test cases.
- For each of the next `T` lines, a single string `s` is provided, representing Poseidon’s path through obstacles.

## Output Format

For each test case, output the path score on a new line.

## Examples

**Example 1**

- **Input:**
```
2
hello
zaz
```
- **Output:** 
```
13
50
```
**Explanation:**

- For the first test case (`s = "hello"`):
  - The ASCII values of the characters are:  
    `'h' = 104`, `'e' = 101`, `'l' = 108`, `'l' = 108`, `'o' = 111`
  - The score is calculated as:  
    `|104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13`

- For the second test case (`s = "zaz"`):
  - The ASCII values of the characters are:  
    `'z' = 122`, `'a' = 97`, `'z' = 122`
  - The score is calculated as:  
    `|122 - 97| + |97 - 122| = 25 + 25 = 50`

## Constraints

- `1 <= T <= 100`
- `2 <= s.length <= 100`
- `s` consists only of lowercase English letters.