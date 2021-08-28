#include <stdio.h>

#define MAX_LENGTH 100000
//// char이 아닌 boolean 배열로 하고 isPlayingThisSecond 등으로 이름을 지어줬으면 더 좋았을 듯
//// check_time: '시간을 확인한다'로는 아무런 유의미한 정보도 얻을 수 없었음
char check_time[MAX_LENGTH];

int N, L, D;

int main()
{
    //// 문제 입력이 하나가 아니라 여러개면 N, L, D처럼 문제에서 지어준 이름 그대로 쓰기보다는
    //// songAmount 식으로 지어주는게 훨씬 가독성이 나음
    scanf("%d", &N);
    scanf("%d", &L);
    scanf("%d", &D);
    int cnt = 0;

    ////생각 치 못한 방법이라 신선ㄴ해요!
    //// check_time이 1일때는 노래가 재생중이라 못 듣는중, 0일때는 들을 수 있는 상태로 쓰고
    //// 벨이 울리는 단위로 배열을 순회하면서 0일 경우를 만나면 그걸 반환하게 했네
    //// 메모리 효율면에서 조금 아쉬운 점이 있지만 되게 창의력 있는 로직인듯 굳
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < L; j++)
        {
            check_time[cnt + j] = 1;
        }

        cnt += L + 5;
    }
			
    int sec = D;				//// 여기과정부터 이해가 잘 안돼서 물어볼게,,!

    while (check_time[sec])		
    int sec = D;

    //// 이 밑에 while문 두번 돌리는게 무슨 과정이야,,,??
    while (check_time[sec])
        sec += D;

    //// 위 while문 때문에 이 while문은 실행될 일이 없음. 이 while문을 빼도 '맞았습니다' 잘 나옴
    while (check_time[sec])
        sec--;

    printf("%d\n", sec);

    return 0;
}
