def findMaximumLifeEnergy(powers):
    maxAns = 1
    for _ in range(5):
        powers.sort()
        powers[0] += 1
    for power in powers:
        maxAns *= power
    return maxAns

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        powers = list(map(int, input().split()))
        print(findMaximumLifeEnergy(powers))
