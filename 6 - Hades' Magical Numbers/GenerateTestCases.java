import java.io.*;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;

public class GenerateTestCases {

    public static int findMaximumLifeEnergy(int[] powers){
        int maxAns = 1;
        for (int i = 0; i < 5; i++) {
                Arrays.sort(powers);
                powers[0]++;
                int prod = 1;
                for (int j = 0; j < 3; j++) {
                    prod*=powers[j];
                    maxAns = Math.max(prod,maxAns);
                }
        }
        return maxAns;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int testcaseCount = 1 + random.nextInt(1000); // Random number of test cases between 1 and 999
        String testFile = "test.txt";
        String resultFile = "result.txt";

        try (
                BufferedWriter testWrite = new BufferedWriter(new FileWriter(testFile));
                BufferedWriter resultWrite = new BufferedWriter(new FileWriter(resultFile))
        ) {
            testWrite.write(String.valueOf(testcaseCount)); // writing test case
            testWrite.newLine(); // New line after writing the number of test cases
            
            
            for (int i = 0; i < testcaseCount; i++) {
                int arrayLength = 3 ;
                int[] arr = new int[arrayLength];

                for (int j = 0; j < arrayLength; j++) {
                    int val = 1 + random.nextInt(10);
                    // generate random number from 1 to 11
                    
                    if(j==0 || j==1){
                        testWrite.write(String.valueOf(val)+" ");
                    }
                    else{
                        testWrite.write(String.valueOf(val));
                    }
                    arr[j] = val;
                }
                testWrite.newLine();
                int result = findMaximumLifeEnergy(arr);
                resultWrite.write(String.valueOf(result));
                resultWrite.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.toString()); // Better error handling
        }
    }
}