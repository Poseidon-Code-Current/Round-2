#include <iostream>
#include <algorithm>
using namespace std;

int findMaximumLifeEnergy(int powers[]) {
    int maxAns = 1;
    for (int i = 0; i < 5; i++) {
        sort(powers, powers + 3);
        powers[0]++;
    }
    for (int j = 0; j < 3; j++) {
        maxAns *= powers[j];
    }
    return maxAns;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int powers[3];
        for (int i = 0; i < 3; i++) {
            cin >> powers[i];
        }
        cout << findMaximumLifeEnergy(powers) << endl;
    }
    return 0;
}
