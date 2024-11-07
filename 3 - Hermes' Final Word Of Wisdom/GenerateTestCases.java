import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class GenerateTestCases {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MAX_WORD_LENGTH = 10; // maximum length of a single word
    private static final int MAX_WORDS_IN_STRING = 20; // maximum number of words in a single string
    private static final int NUM_TEST_CASES = 100; // number of test cases

    // Generate a random word with a specified maximum length
    private static String generateRandomWord(int maxLength) {
        Random random = new Random();
        int length = 1 + random.nextInt(maxLength);
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            word.append(CHARACTERS.charAt(index));
        }
        return word.toString();
    }

    // Generate a random sentence with a specified maximum number of words
    private static String generateRandomSentence(int maxWords, int maxWordLength) {
        Random random = new Random();
        int numWords = 1 + random.nextInt(maxWords); // number of words in the sentence
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < numWords; i++) {
            sentence.append(generateRandomWord(maxWordLength));
            if (i < numWords - 1) {
                sentence.append(" ");
            }
        }
        return sentence.toString();
    }

    // Find the length of the last word in a sentence
    private static int findLengthOfLastWord(String sentence) {
        String strings[] = sentence.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }

    public static void main(String[] args) {
        String testFile = "test.txt";
        String resultFile = "result.txt";

        // Generate test cases and write them to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write(NUM_TEST_CASES + "\n"); // Write the number of test cases at the top
            for (int i = 0; i < NUM_TEST_CASES; i++) {
                String testCase = generateRandomSentence(MAX_WORDS_IN_STRING, MAX_WORD_LENGTH);
                writer.write(testCase + "\n");
            }
            System.out.println("Test cases successfully written to " + testFile);
        } catch (IOException e) {
            System.err.println("Error writing test cases to file: " + e.getMessage());
        }

        // Read test cases and find length of last word for each
        try (BufferedWriter resultWriter = new BufferedWriter(new FileWriter(resultFile))) {
            List<String> testCases = Files.readAllLines(Paths.get(testFile));
            for (String testCase : testCases.subList(1, testCases.size())) { // Skip the first line with case count
                int lastWordLength = findLengthOfLastWord(testCase);
                resultWriter.write(lastWordLength + "\n");
            }
            System.out.println("Results successfully written to " + resultFile);
        } catch (IOException e) {
            System.err.println("Error processing test cases: " + e.getMessage());
        }
    }
}
