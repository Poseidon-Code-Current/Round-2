# *Odysseus' Unbroken Journey*  

Odysseus is on a voyage across the vast seas, aiming to avoid retracing any of his steps. Each unique path he takes is represented by a character in a string `s`. Your mission is to find the **longest unbroken journey** (substring) where no paths (characters) are repeated.

A substring is a continuous sequence of characters within the string. Your task is to determine the length of the longest substring in `s` where no character is repeated, symbolizing Odysseus' longest journey without revisiting any path.

## Input Format

- The first line contains an integer `T` – the number of test cases.
- For each of the next `T` lines, a single string `s` is provided.

## Output Format

For each test case, output the length of longest unbroken journey on a new line.

## Examples:

**Example 1:**

- **Input:** 
```
2
dvdf
tmmzuxt
```
- **Output:** 
```
3
5
```
- **Explanation:**  
- For the first test case, Odysseus' longest unbroken journey without repeating paths is `"vdf"`, which has a length of 3.
- For the second test case, Odysseus' longest unbroken journey is `"mzuxt"`, which has a length of 5. Though 'm' repeats, `"mzuxt"` gives the longest substring without repeated characters.

**Example 2:**

- **Input:** 
```
2
abcabcbb
bbbbb
```
- **Output:** 
```
3
1
```
- **Explanation:**
- For the first test case, the longest unbroken journey is `"abc"`, with a length of 3.
- For the second test case, Odysseus can only take one unique path, `"b"`, with a length of 1.

### Constraints:

- `1 <= T <= 10^3`
- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols, and spaces.