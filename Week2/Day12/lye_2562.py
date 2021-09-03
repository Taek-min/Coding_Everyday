numCnt = 9
maxValue = 0
maxIndex = 0

for i in range(0, numCnt):
	nowNum = int(input())
	if nowNum > maxValue:
		maxValue = nowNum
		maxIndex = i+1
		
print(maxValue)
print(maxIndex)