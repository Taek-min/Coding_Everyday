numList = []
sum = 0
numCnt = 5
midIndex = int(numCnt/2)

for i in range(0, numCnt):
	nowNum = int(input())
	numList.append(nowNum)
	sum += nowNum
	
numList.sort()
print(int(sum/numCnt))
print(numList[midIndex])

####이번주 문제 푼 시간 합쳐도 1시간 안 되지?