import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func findSecondLargestPower(n int, powers []int) int {
	max, secondMax := -1, -1
	for _, power := range powers {
		if power > max {
			secondMax = max
			max = power
		} else if power > secondMax && power < max {
			secondMax = power
		}
	}
	return secondMax
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)
	defer writer.Flush()

	// Reading number of test cases
	input, _ := reader.ReadString('\n')
	t, _ := strconv.Atoi(strings.TrimSpace(input))

	for i := 0; i < t; i++ {
		// Reading array size for the test case
		input, _ = reader.ReadString('\n')
		n, _ := strconv.Atoi(strings.TrimSpace(input))

		// Reading the array of powers
		input, _ = reader.ReadString('\n')
		powersStr := strings.Fields(input)
		powers := make([]int, n)
		for j := 0; j < n; j++ {
			powers[j], _ = strconv.Atoi(powersStr[j])
		}
		// Calculating and outputting result
		result := findSecondLargestPower(n, powers)
		fmt.Fprintln(writer, result)
	}
}
