import java.util.*;

class Solution {
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
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            String scroll = sc.next();
            System.out.println(checkIfPairExists(scroll));
        }
    }
}