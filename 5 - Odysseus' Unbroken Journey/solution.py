def solve(s):
    i, j, ans = 0, 0, 0
    mp = {}
    
    while j < len(s):
        mp[s[j]] = mp.get(s[j], 0) + 1
        
        while mp[s[j]] > 1:
            mp[s[i]] -= 1
            i += 1
        
        ans = max(ans, j - i + 1)
        j += 1
    
    return ans

if __name__ == "__main__":
    t = int(input())
    
    for _ in range(t):
        s = input().strip()
        print(solve(s))
