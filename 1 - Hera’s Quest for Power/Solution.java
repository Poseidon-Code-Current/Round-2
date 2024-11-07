import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int findSecondLargestPower(int N,int[] powers){
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i < N; i++) {
            if (powers[i] > max) {
            secondMax = max;
            max = powers[i];
            } else if (powers[i] > secondMax && powers[i] < max) {
            secondMax = powers[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int[] powers = new int[N];
            for (int i = 0; i < N; i++) {
                powers[i] = sc.nextInt();
            }
            System.out.println(findSecondLargestPower(N,powers));  
        }
    }
}