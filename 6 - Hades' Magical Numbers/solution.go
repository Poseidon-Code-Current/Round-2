import (
	"fmt"
	"sort"
)

func findMaximumLifeEnergy(powers []int) int {
	maxAns := 1
	for i := 0; i < 5; i++ {
		sort.Ints(powers)
		powers[0]++
	}
	for _, power := range powers {
		maxAns *= power
	}
	return maxAns
}

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		t--
		powers := make([]int, 3)
		for i := 0; i < 3; i++ {
			fmt.Scan(&powers[i])
		}
		fmt.Println(findMaximumLifeEnergy(powers))
	}
}
