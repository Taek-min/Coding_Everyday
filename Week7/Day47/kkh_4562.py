n = int(input())
for i in range(0, n):
	dataSet = list(map(int, input().split()))
	if dataSet.index(max(dataSet)) == 0:
		print('MMM BRAINS')
	else:
		print('NO BRAINS')