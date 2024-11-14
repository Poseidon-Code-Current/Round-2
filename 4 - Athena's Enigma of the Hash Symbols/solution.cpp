#include <iostream>
#include <unordered_set>
#include <vector>
using namespace std;

string checkIfPairExists(const string& scroll) {
    int hashCount = 0;
    unordered_set<int> set;
    vector<int> numbers;

    for (char currentChar : scroll) {
        if (currentChar == '#') {
            hashCount++;
        } else if (isdigit(currentChar)) {
            numbers.push_back(currentChar - '0');
        }
    }

    for (int num : numbers) {
        int key = hashCount - num;
        if (set.find(key) != set.end()) {
            return "Yes";
        }
        set.insert(num);
    }
    return "No";
}

int main() {
    int N;
    cin >> N;
    while (N--) {
        string scroll;
        cin >> scroll;
        cout << checkIfPairExists(scroll) << endl;
    }
    return 0;
}
