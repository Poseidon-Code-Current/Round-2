#include <iostream>
using namespace std;

int findSecondLargestPower(int N,int powers[]){
    int max = -1;
    int secondMax = -1;
    for(int i=0;i<N;i++){
        if(powers[i]>max){
            secondMax = max;
            max = powers[i];
        }else if(powers[i]>secondMax  && powers[i] < max){
            secondMax = powers[i];
        }
    }
    return secondMax;
}

int main(){
    int T;
    cin>>T;
    while (T--)
    {
        int N;
        cin>>N;
        int powers[N];
        for(int i=0;i<N;i++){
            cin>>powers[i];
        }
        cout<<findSecondLargestPower(N,powers)<<"\n";
    }
}