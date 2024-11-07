#include <stdio.h>
#include <string.h>

int findLengthOfLastWord(char* sentence) {
    int lastWordLength = 0;
    for (int i = 0; sentence[i] != '\0'; i++)
    {
        if (sentence[i] == ' '){
            lastWordLength = 0;
        }
        else{
            lastWordLength++;
        }
    }
    return lastWordLength;
    
}

int main() {
    int N;
    scanf("%d", &N);
    getchar(); // Consume newline after the integer input
    char sentence[10001];
    for (int i = 0; i < N; i++) {
        fgets(sentence, 10001, stdin);
        sentence[strcspn(sentence, "\n")] = '\0'; // Remove newline character
        printf("%d\n", findLengthOfLastWord(sentence));
    }
    return 0;
}
