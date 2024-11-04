#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int calcPathScore(const char* s) {
    int ans = 0;
    for (int i = 0; i < strlen(s) - 1; i++) {
        ans += abs(s[i] - s[i + 1]);
    }
    return ans;
}

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        char s[101];
        scanf("%s", s);
        printf("%d\n", calcPathScore(s));
    }

    return 0;
}
