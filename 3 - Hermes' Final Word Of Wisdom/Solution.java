import java.util.Scanner;

class Solution{
    private static int findLengthOfLastWord(String sentence) {
        String strings[] = sentence.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String sentence = scanner.nextLine();
            System.out.println(findLengthOfLastWord(sentence));
        }
    }
}