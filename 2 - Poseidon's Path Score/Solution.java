import java.util.Scanner;

public class Solution {

    public static int calcPathScore(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        while (t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(calcPathScore(s));
        }
        scanner.close();
    }
}
