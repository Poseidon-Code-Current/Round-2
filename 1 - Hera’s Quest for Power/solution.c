#include <stdio.h>

int findSecondLargestPower(int N,int powers[]){
    int max = -1;
    int secondMax = -1;
    for(int i=0;i<N;i++){
        if(powers[i]>max){
            secondMax = max;
            max = powers[i];
        }else if(powers[i]>secondMax && powers[i]<max){
            secondMax = powers[i];
        }
    }
    return secondMax;
}

int main(){
    int T;
    scanf("%d",&T);
    while (T--)
    {
        int N;
        scanf("%d",&N);
        int powers[N];
        for(int i=0;i<N;i++){
            scanf("%d",&powers[i]);
        }
        printf("%d\n",findSecondLargestPower(N,powers));
    }
}