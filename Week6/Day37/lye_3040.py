import math

dwarfCnt = 9
dwarfNumList = []

def print_result(exNum1, exNum2):
	for i in range(0, dwarfCnt):
		if i != exNum1 and i != exNum2:
			print(dwarfNumList[i])

for i in range(0, dwarfCnt):
	dwarfNumList.append(int(input()))

totalNum = sum(dwarfNumList)

for i in range(0, dwarfCnt):
	for j in range(i+1, dwarfCnt):
		if totalNum - dwarfNumList[i] - dwarfNumList[j] == 100:
			print_result(i, j)
## 깔끔