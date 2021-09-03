firstNum = 0
secondNum = 1

findNum = int(input())

for i in range(1, findNum):
	nowNum = firstNum + secondNum
	firstNum = secondNum
	secondNum = nowNum
	
print(secondNum)
## CLEAN :22 :33