maxNum = 0
maxLine = 0
maxRow = 0
for i in range(0, 9):
	num = list(map(int, input().split(" ")))
	
	if maxNum < max(num):
		maxNum = max(num)
		maxLine = i + 1
		maxRow = num.index(max(num)) + 1

print(maxNum)
print(maxLine, maxRow)
##깔끔