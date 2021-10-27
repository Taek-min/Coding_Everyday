caseCnt = int(input()) ## 변수 작명들 직관적이어서 좋네요

for i in range(0, caseCnt):
	evenSum = 0
	evenMin = 100
	numbers = list(map(int, input().split(' ')))

	for i in numbers:
		if i % 2 == 0:
			evenSum += i
			if i < evenMin:
				evenMin = i
	print(evenSum, evenMin)
## 깔끔 : 2 : 3 : 4