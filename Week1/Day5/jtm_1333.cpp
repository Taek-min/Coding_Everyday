#include <stdio.h>

#define MAX_LENGTH 100000
char check_time[MAX_LENGTH];

int N, L, D;

int main()
{
    scanf("%d", &N);
    scanf("%d", &L);
    scanf("%d", &D);
    int cnt = 0;

    ////생각 치 못한 방법이라 신선ㄴ해요!
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < L; j++)
        {
            check_time[cnt + j] = 1;
        }

        cnt += L + 5;
    }

    int sec = D;

    //// 이 밑에 while문 두번 돌리는게 무슨 과정이야,,,??
    while (check_time[sec])
        sec += D;

    while (check_time[sec])
        sec--;

    printf("%d\n", sec);

    return 0;
}
