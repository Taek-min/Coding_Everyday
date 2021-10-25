isOdd = True
startNum = 0
chessCnt = 0

for i in range(0, 8):
	chessList = input()
	if isOdd:
		startNum = 0
	else:
		startNum = 1
	
	for j in range(startNum, 8, 2):
		if(chessList[j] == 'F'):
			chessCnt += 1
	isOdd = not isOdd
	
print(chessCnt)
## 못하는게 없어 아주~!~!