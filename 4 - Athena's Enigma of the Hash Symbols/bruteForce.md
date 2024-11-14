```C
// C Brute Force
#include <stdio.h>
#include <string.h>
#include <ctype.h>

const char* checkIfPairExistsBruteForce(const char* scroll) {
    int hashCount = 0;
    int numbers[100000];
    int numIndex = 0;

    for (int i = 0; scroll[i] != '\0'; i++) {
        if (scroll[i] == '#') {
            hashCount++;
        } else if (isdigit(scroll[i])) {
            numbers[numIndex++] = scroll[i] - '0';
        }
    }

    for (int i = 0; i < numIndex; i++) {
        for (int j = 0; j < numIndex; j++) {
            if (i != j && numbers[i] + numbers[j] == hashCount) {
                return "Yes";
            }
        }
    }
    return "No";
}

int main() {
    int N;
    scanf("%d", &N);
    while (N--) {
        char scroll[100001];
        scanf("%s", scroll);
        printf("%s\n", checkIfPairExistsBruteForce(scroll));
    }
    return 0;
}
```

```C++
// C++ Brute Force
#include <iostream>
#include <vector>
using namespace std;

string checkIfPairExistsBruteForce(const string& scroll) {
    int hashCount = 0;
    vector<int> numbers;

    for (char currentChar : scroll) {
        if (currentChar == '#') {
            hashCount++;
        } else if (isdigit(currentChar)) {
            numbers.push_back(currentChar - '0');
        }
    }

    for (int i = 0; i < numbers.size(); i++) {
        for (int j = 0; j < numbers.size(); j++) {
            if (i != j && numbers[i] + numbers[j] == hashCount) {
                return "Yes";
            }
        }
    }
    return "No";
}

int main() {
    int N;
    cin >> N;
    while (N--) {
        string scroll;
        cin >> scroll;
        cout << checkIfPairExistsBruteForce(scroll) << endl;
    }
    return 0;
}
```

```java
// Java Brute Force
import java.util.*;

class Solution {
    public static String checkIfPairExistsBruteForce(String scroll) {
        int hashCount = 0;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < scroll.length(); i++) {
            char currentChar = scroll.charAt(i);
            if (currentChar == '#') {
                hashCount++;
            } else if (Character.isDigit(currentChar)) {
                numbers.add(currentChar - '0');
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i != j && numbers.get(i) + numbers.get(j) == hashCount) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            String scroll = sc.next();
            System.out.println(checkIfPairExistsBruteForce(scroll));
        }
    }
}
```

```javascript
// JavaScript Brute Force
function checkIfPairExistsBruteForce(scroll) {
    let hashCount = 0;
    let numbers = [];

    for (let char of scroll) {
        if (char === '#') {
            hashCount++;
        } else if (!isNaN(char)) {
            numbers.push(Number(char));
        }
    }

    for (let i = 0; i < numbers.length; i++) {
        for (let j = 0; j < numbers.length; j++) {
            if (i !== j && numbers[i] + numbers[j] === hashCount) {
                return "Yes";
            }
        }
    }
    return "No";
}

// Input reading
const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
readline.on("line", (line) => input.push(line.trim()));
readline.on("close", () => {
    const T = parseInt(input[0]);
    for (let i = 1; i <= T; i++) {
        console.log(checkIfPairExistsBruteForce(input[i]));
    }
});
```

```python
# Python Brute Force
def check_if_pair_exists_brute_force(scroll):
    hash_count = 0
    numbers = []

    for char in scroll:
        if char == '#':
            hash_count += 1
        elif char.isdigit():
            numbers.append(int(char))

    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i != j and numbers[i] + numbers[j] == hash_count:
                return "Yes"
    return "No"

# Input reading
t = int(input())
for _ in range(t):
    scroll = input()
    print(check_if_pair_exists_brute_force(scroll))
```


```go
// Go Brute Force
package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
	"unicode"
)

func checkIfPairExistsBruteForce(scroll string) string {
	hashCount := 0
	numbers := []int{}

	for _, char := range scroll {
		if char == '#' {
			hashCount++
		} else if unicode.IsDigit(char) {
			numbers = append(numbers, int(char-'0'))
		}
	}

	for i := 0; i < len(numbers); i++ {
		for j := 0; j < len(numbers); j++ {
			if i != j && numbers[i]+numbers[j] == hashCount {
				return "Yes"
			}
		}
	}
	return "No"
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	var T int
	fmt.Scan(&T)

	for i := 0; i < T; i++ {
		scroll, _ := reader.ReadString('\n')
		scroll = strings.TrimSpace(scroll)
		fmt.Println(checkIfPairExistsBruteForce(scroll))
	}
}
```