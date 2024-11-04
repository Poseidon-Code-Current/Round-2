package main

import (
    "fmt"
    "math"
)

func calcPathScore(s string) int {
    ans := 0
    for i := 0; i < len(s)-1; i++ {
        ans += int(math.Abs(float64(s[i] - s[i+1])))
    }
    return ans
}

func main() {
    var t int
    fmt.Scan(&t)

    for i := 0; i < t; i++ {
        var s string
        fmt.Scan(&s)
        fmt.Println(calcPathScore(s))
    }
}
