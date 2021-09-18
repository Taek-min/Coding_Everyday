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
	