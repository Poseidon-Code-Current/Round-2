# Hermes' Final Word Of Wisdom

## Problem Statement

In the archives of ancient Olympus, you come across a cryptic scroll inscribed with a message containing words separated by single space. Each word is a piece of wisdom, carefully recorded for generations. However, only the last piece of wisdom holds the answer you seek.

Your task is to complete the function `lengthOfLastWisdomWord` that finds the length of the last word and returns it. 

A "word" is defined as the longest sequence of non-space characters. Spaces only separate the words and are not part of them.

## Input Format

- The first line contains an integer `N` that denotes the number of strings 
- For each of the next `N` lines, a single string `s`.

## Output Format

- A single integer representing the length of the last word in the string.

## Constraints

- 1 ≤ N ≤ 100
- The string `s` contains only English letters and spaces `' '` and length of string won't exceed 10<sup>3</sup>.
- There will be at least one word in `s`.
