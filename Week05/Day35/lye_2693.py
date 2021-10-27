caseCnt = int(input())

for i in range(0, caseCnt):
	numArr = list(map(int, input().split()))
	numArr.sort(reverse=True)
	print(numArr[2])
	## 깔끔 그 자체 : 22 : 33 :4 :5