# 완전 정직하게 풀었는데 규칙 찾아내면 훨씬 간단하게 풀리더라구요,,,피드백 반영할 때 바꿔서 풀어보겠습니당
## 상수는 PIG_COUNT 식으로 대문자로 표기하는게 일반적이에요! 상수 작명 굳굳
pigCnt = 6
caseCnt = int(input())

def CalcNewAmount(list, x):	#### 우와 완전 정직해 대박 :22 ㅋㅋㅋ
	leftIndex = (x-1) % pigCnt
	rightIndex  = (x+1) % pigCnt
	acrossIndex = x-3 if x >= pigCnt/2 else x+3
	return list[leftIndex] + list[rightIndex] + list[acrossIndex] + list[x]

for i in range(0, caseCnt):
	dailyFeed = int(input()) #### 변수명 통했따
	beforeAmountList = list(map(int, input().split(' ')))
	dayCnt = 1
	
	while sum(beforeAmountList) <= dailyFeed:
		newAmountList = []
		for j in range(0, pigCnt):
			newAmountList.append(CalcNewAmount(beforeAmountList, j))
		for j in range(0, pigCnt):
			beforeAmountList[j] = newAmountList[j]	
		dayCnt += 1
	
	print(dayCnt)
