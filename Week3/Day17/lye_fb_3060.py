pigCnt = 6
caseCnt = int(input())

for i in range(0, caseCnt):
	dailyFeed = int(input())
	amountList = list(map(int, input().split(' ')))
	requestFeed = sum(amountList)
	dayCnt = 1

	while requestFeed <= dailyFeed:
		requestFeed * 4
		dayCnt += 1
	
	print(dayCnt)
