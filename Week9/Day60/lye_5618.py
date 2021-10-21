import math

def GetGCD(a, b):
	if a % b == 0:
		return b
	else:
		tmp = a
		a = b
		b = tmp % a
		return GetGCD(a, b)

def PrintDivisor(num):
	res = []
	for i in range(1, int(math.sqrt(num))+1):
		if num % i == 0:
			res.append(i)
			if i != int(num/i):
				res.append(int(num/i))
	res.sort()
	res = list(map(str, res))
	print('\n'.join(res))

numCnt = int(input())
numList = list(map(int, input().split()))

if len(numList) == 2:
	PrintDivisor(GetGCD(max(numList), min(numList)))
else:
	numList.sort()
	PrintDivisor(GetGCD(GetGCD(numList[2],numList[1]), numList[0]))