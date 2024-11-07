import java.io.*;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;

public class GenerateTestCases {

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
        Random random = new Random();
        int testcaseCount = 1 + random.nextInt(10); 
        String testFile = "test.txt";
        String resultFile = "result.txt";

        try (
                BufferedWriter testWrite = new BufferedWriter(new FileWriter(testFile));
                BufferedWriter resultWrite = new BufferedWriter(new FileWriter(resultFile))
        ) {
            testWrite.write(String.valueOf(testcaseCount)); // writing test case
            testWrite.newLine(); // New line after writing the number of test cases
            
            
            for (int i = 0; i < testcaseCount; i++) {
                int powerListLength = 1 + random.nextInt(2);
                int[] arr = new int[powerListLength];
                testWrite.write(String.valueOf(powerListLength));
                testWrite.newLine();
                for (int j = 0; j < powerListLength; j++) {
                    int val = 1 + random.nextInt(5);
                    if(j< powerListLength-1)
                        testWrite.write(String.valueOf(val) + " ");
                    else 
                        testWrite.write(String.valueOf(val));
                    arr[j] = val;
                }
                testWrite.newLine();
                int result = findSecondLargestPower(powerListLength, arr);
                resultWrite.write(String.valueOf(result));
                resultWrite.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.toString()); // Better error handling
        }
    }
}