#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int findMaximumLifeEnergy(int powers[]) {
    int maxAns = 1;
    for (int i = 0; i < 5; i++) {
        qsort(powers, 3, sizeof(int), compare);
        powers[0]++;
    }
    for (int j = 0; j < 3; j++) {
        maxAns *= powers[j];
    }
    return maxAns;
}

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        int powers[3];
        for (int i = 0; i < 3; i++) {
            scanf("%d", &powers[i]);
        }
        printf("%d\n", findMaximumLifeEnergy(powers));
    }
    return 0;
}
