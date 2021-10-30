import math

caseCnt = int(input())

for i in range(0, caseCnt):
	num = int(input())
	powNum = str(int(math.pow(num, 2)))
	
	if powNum.endswith(str(num)):
		print("YES")
	else:
		print("NO")
# 그리워 파이썬.... 
# 깔끔/