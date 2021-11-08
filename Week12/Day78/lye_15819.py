handleCnt, findNum = map(int, input().split())
handleList = []
for i in range(handleCnt):
	handleList.append(input())
handleList.sort()
print(handleList[findNum-1])
