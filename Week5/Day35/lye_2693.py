caseCnt = int(input())

for i in range(0, caseCnt):
	numArr = list(map(int, input().split()))
	numArr.sort(reverse=True)
	print(numArr[2])