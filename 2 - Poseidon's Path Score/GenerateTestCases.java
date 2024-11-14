import java.io.*;
import java.util.Random;

public class GenerateTestCases {

    // Function to calculate Poseidon's Path Score
    public static int calculatePathScore(String path) {
        int score = 0;
        for (int i = 1; i < path.length(); i++) {
            score += Math.abs(path.charAt(i) - path.charAt(i - 1));
        }
        return score;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int testcaseCount = 1 + random.nextInt(100); // Generate between 1 and 100 test cases
        String testFile = "test.txt";
        String resultFile = "result.txt";

        try (
                BufferedWriter testWrite = new BufferedWriter(new FileWriter(testFile));
                BufferedWriter resultWrite = new BufferedWriter(new FileWriter(resultFile))
        ) {
            testWrite.write(String.valueOf(testcaseCount)); // Write number of test cases
            testWrite.newLine();

            for (int i = 0; i < testcaseCount; i++) {
                int pathLength = 2 + random.nextInt(101); // Path length between 2 and 100
                StringBuilder path = new StringBuilder();

                // Generate random path string of lowercase letters
                for (int j = 0; j < pathLength; j++) {
                    char c = (char) ('a' + random.nextInt(26)); // Random lowercase character
                    path.append(c);
                }

                // Write path to test file
                testWrite.write(path.toString());
                testWrite.newLine();

                // Calculate path score and write to result file
                int score = calculatePathScore(path.toString());
                resultWrite.write(String.valueOf(score));
                resultWrite.newLine();
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
