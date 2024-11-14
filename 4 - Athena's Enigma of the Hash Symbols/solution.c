#include <stdio.h>
#include <string.h>
#include <ctype.h>

const char* checkIfPairExists(const char* scroll) {
    int hashCount = 0;
    int set[10] = {0}; // To store numbers (0-9)
    int numbers[100000];
    int numIndex = 0;

    for (int i = 0; scroll[i] != '\0'; i++) {
        if (scroll[i] == '#') {
            hashCount++;
        } else if (isdigit(scroll[i])) {
            numbers[numIndex++] = scroll[i] - '0';
        }
    }

    for (int i = 0; i < numIndex; i++) {
        int key = hashCount - numbers[i];
        if (key >= 0 && key < 10 && set[key]) {
            return "Yes";
        }
        set[numbers[i]] = 1;
    }

    return "No";
}

int main() {
    int N;
    scanf("%d", &N);
    while (N--) {
        char scroll[100001];
        scanf("%s", scroll);
        printf("%s\n", checkIfPairExists(scroll));
    }
    return 0;
}
