totalTime = int(input())
carCnt = int(input())
maxCnt = carCnt
#### 깔끔하다
for i in range(1, totalTime + 1):
	inCar, outCar = map(int, input().split(' '))
	
	carCnt += inCar
	carCnt -= outCar
	
	if carCnt > maxCnt:
		maxCnt = carCnt
	
	if carCnt < 0:
		maxCnt = 0
		break

print(maxCnt)