pigCnt = 6
caseCnt = int(input())

def CalcNewAmount(list, x):
	leftIndex = (x-1) % pigCnt
	rightIndex  = (x+1) % pigCnt
	acrossIndex = x-3 if x >= pigCnt/2 else x+3
	return list[leftIndex] + list[rightIndex] + list[acrossIndex] + list[x]

for i in range(0, caseCnt):
	dailyFeed = int(input())
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
