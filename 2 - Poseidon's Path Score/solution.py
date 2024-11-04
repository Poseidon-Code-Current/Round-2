def calc_path_score(s):
    ans = 0
    for i in range(len(s) - 1):
        ans += abs(ord(s[i]) - ord(s[i + 1]))
    return ans

t = int(input())

for _ in range(t):
    s = input().strip()
    print(calc_path_score(s))
