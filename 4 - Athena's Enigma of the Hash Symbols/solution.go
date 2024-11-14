package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func checkIfPairExists(scroll string) string {
	hashCount := 0
	numbers := []int{}
	set := make(map[int]bool)

	for _, char := range scroll {
		if char == '#' {
			hashCount++
		} else if char >= '0' && char <= '9' {
			numbers = append(numbers, int(char-'0'))
		}
	}

	for _, num := range numbers {
		key := hashCount - num
		if set[key] {
			return "Yes"
		}
		set[num] = true
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
		fmt.Println(checkIfPairExists(scroll))
	}
}
