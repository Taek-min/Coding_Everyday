startNum, endNum = map(int, input().split())
if startNum > endNum:
	tmp = startNum
	startNum = endNum
	endNum = tmp
print(int((endNum - startNum + 1) * (endNum + startNum) / 2))