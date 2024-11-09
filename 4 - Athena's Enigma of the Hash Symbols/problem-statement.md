# Athena's Enigma of the Hash Symbols

In the ancient texts of Athena, the messenger god, a mysterious string was discovered containing letters, symbols (`@`, `#`, `$`, `%`, `^`, `&`, `*`), and digits. Athena has challenged you to solve this puzzle encoded in the string. Your task is to determine if there is a pair of digits in the string whose sum equals the total count of `#` symbols.

You must:

1. **Extract** all digits from the given string individually.
2. **Count** the number of `#` symbols in the string.
3. **Check** if there exists a pair of digits whose sum is equal to the count of `#` symbols. Note that a pair may consist of **two identical digits** as long as they appear in separate positions in the string.

Your task is to complete a function, `checkIfPairExists`, that returns `Yes` if such a pair exists otherwise return `No`.

## Input

- A single integer `N` that defines the number of strings.
- `N` strings `scroll` containing letters, symbols (`@`, `#`, `$`, `%`, `^`, `&`, `*`), and digits.

## Output
- Print `Yes` if a pair of digits exists with a sum equal to the count of `#` symbols.
- Otherwise, print `No`.

## Constraints
- Number of strings will not exceed 10<sup>2</sup>
- The string length will not exceed 10<sup>5</sup> characters.
- The string will contain at least one digit.
