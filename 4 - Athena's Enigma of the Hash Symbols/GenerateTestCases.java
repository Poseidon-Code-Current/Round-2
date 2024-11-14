import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.*;

public class GenerateTestCases {
    private static final String CHARACTERS = "9#1#2#3#4#5#6#7#8#";
    private static final int MAX_WORD_LENGTH = 100000; 
    private static final int NUM_TEST_CASES = 10; // number of test cases

    // Generate a random word with a specified maximum length
    private static String generateRandomWord(int maxLength) {
        Random random = new Random();
        int length = MAX_WORD_LENGTH;
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            word.append(CHARACTERS.charAt(index));
        }
        return word.toString();
    }

    public static String checkIfPairExists(String scroll){
        int hashCount = 0;
        Set<Integer> set = new HashSet<>();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < scroll.length(); i++){
            char currentChar = scroll.charAt(i);
            if(currentChar == '#'){
                hashCount++;
            }
            else if(Character.isDigit(currentChar)){
                numbers.add(currentChar-'0');
            }

        }
        for(int i = 0; i < numbers.size(); i++){
            int key = hashCount - numbers.get(i);
            if(set.contains(key)){
                return "Yes";
            }
            else {
                set.add(numbers.get(i));
            }
        } 
        return "No";
    }

    
    public static void main(String[] args) {
        String testFile = "test.txt";
        String resultFile = "result.txt";

        // Generate test cases and write them to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write(NUM_TEST_CASES + "\n"); // Write the number of test cases at the top
            for (int i = 0; i < NUM_TEST_CASES; i++) {
                String testCase = generateRandomWord(MAX_WORD_LENGTH);
                writer.write(testCase + "\n");
            }
            System.out.println("Test cases successfully written to " + testFile);
        } catch (IOException e) {
            System.err.println("Error writing test cases to file: " + e.getMessage());
        }

        // Read test cases and find length of last word for each
        try (BufferedWriter resultWriter = new BufferedWriter(new FileWriter(resultFile))) {
            List<String> testCases = Files.readAllLines(Paths.get(testFile));
            for (String testCase : testCases.subList(1, testCases.size())) {
                resultWriter.write(checkIfPairExists(testCase) + "\n");
            }
            System.out.println("Results successfully written to " + resultFile);
        } catch (IOException e) {
            System.err.println("Error processing test cases: " + e.getMessage());
        }
    }
}
