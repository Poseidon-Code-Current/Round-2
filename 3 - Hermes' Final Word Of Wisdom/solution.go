package main

import (
    "bufio"
    "fmt"
    "os"
    "strings"
)

func findLengthOfLastWord(sentence string) int {
    words := strings.Fields(sentence)
    if len(words) == 0 {
        return 0
    }
    return len(words[len(words)-1])
}

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    scanner.Scan()
    var N int
    fmt.Sscanf(scanner.Text(), "%d", &N)

    for i := 0; i < N; i++ {
        scanner.Scan()
        sentence := scanner.Text()
        fmt.Println(findLengthOfLastWord(sentence))
    }
}
