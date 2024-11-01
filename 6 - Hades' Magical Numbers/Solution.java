import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int findMaximumLifeEnergy(int[] powers){
        int maxAns = 1;
        for (int i = 0; i < 5; i++) {
                Arrays.sort(powers);
                powers[0]++;
                maxAns=1;
        }
        for (int j = 0; j < 3; j++) {
            maxAns*=powers[j];
        }
        return maxAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] powers = new int[3];
            for (int i = 0; i < 3; i++) {
                powers[i] = sc.nextInt();
            }
            System.out.println(findMaximumLifeEnergy(powers));  
        }
    }
}