caseCnt = int(input())

for i in range(0, caseCnt):
	start, end = map(int, input().split())
	allNum = ""
	for j in range(start, end + 1):
		allNum += str(j)
	print(allNum.count('0'))
	## 잘해잘해