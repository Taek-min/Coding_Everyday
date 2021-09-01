sheepGram, goatGram, totalCnt, totalGram = map(int, input().split(' '))
findNum = False
sheepCnt = 0
goatCnt = 0

for i in range(1, totalCnt):
	if sheepGram * i + goatGram * (totalCnt - i) == totalGram:
		if findNum:
			findNum = False
			break
		else:
			sheepCnt = i
			goatCnt = totalCnt-i
			findNum = True
	
if findNum:
	print(sheepCnt, goatCnt)
else:
	print(-1)