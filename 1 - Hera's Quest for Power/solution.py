def find_second_largest_power(N, powers):
    max_power = -1
    second_max_power = -1
    for i in range(N):
        if powers[i] > max_power:
            second_max_power = max_power
            max_power = powers[i]
        elif powers[i] > second_max_power and powers[i] < max_power:
            second_max_power = powers[i]
    return second_max_power

if __name__ == "__main__":
    T = int(input())
    for _ in range(T):
        N = int(input())
        powers = list(map(int, input().split()))
        print(find_second_largest_power(N, powers))
