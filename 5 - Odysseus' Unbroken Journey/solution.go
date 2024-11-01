package main

import (
    "fmt"
)

func solve(s string) int {
    i, j, ans := 0, 0, 0
    mp := make(map[byte]int)
    
    for j < len(s) {
        mp[s[j]]++
        
        for mp[s[j]] > 1 {
            mp[s[i]]--
            i++
        }
        
        if j-i+1 > ans {
            ans = j - i + 1
        }
        j++
    }
    
    return ans
}

func main() {
    var t int
    fmt.Scan(&t)
    
    for t > 0 {
        var s string
        fmt.Scan(&s)
        fmt.Println(solve(s))
        t--
    }
}
