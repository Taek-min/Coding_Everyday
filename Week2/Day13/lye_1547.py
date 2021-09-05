ballNum = 1
changeCnt = int(input())

for i in range(0, changeCnt):
	changeNums = list(map(int, input().split(' ')))
	if changeNums[0] == ballNum:
		ballNum = changeNums[1]
		continue
	if changeNums[1] == ballNum:
		ballNum = changeNums[0]
		
print(ballNum)
####디게 깔꼼하네요