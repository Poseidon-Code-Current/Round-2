import java.util.*;

public class Solution {
    public static int solve(String s) {
        int i = 0, j = 0, ans = 0;
        Map<Character, Integer> mp = new HashMap<>();
        
        while (j < s.length()) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);
            
            while (mp.get(s.charAt(j)) > 1) {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                i++;
            }
            
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
        sc.close();
    }
}