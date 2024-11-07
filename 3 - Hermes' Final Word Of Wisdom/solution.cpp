#include <iostream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

int findLengthOfLastWord(string sentence) {
    istringstream stream(sentence);
    string word, lastWord;
    while (stream >> word) {
        lastWord = word;
    }
    return lastWord.length();
}

int main() {
    int N;
    cin >> N;
    cin.ignore();
    for (int i = 0; i < N; i++) {
        string sentence;
        getline(cin, sentence);
        cout << findLengthOfLastWord(sentence) << endl;
    }
    return 0;
}
