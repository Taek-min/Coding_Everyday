caseCnt = int(input())

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