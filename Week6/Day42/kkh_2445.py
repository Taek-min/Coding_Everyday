num = int(input())

for i in range(0, num * 2 - 1):
	for j in range(num, 0, -1):
		if(j >= num - i and num - i > 0): # 왼쪽 위
			print("*", end="")
		elif(j - 1 > (num - i) * (-1) and num - i <= 0): # 왼쪽 아래
			print("*", end="")
		else:
			print(" ", end="")
	for j in range(0, num):
		if(j >= num - i - 1 and num - i > 0): # 오른쪽 위
			print("*", end="")
		elif(j > (num - i) * (-1) and num - i <= 0): # 오른쪽 아래
			print("*", end="")
		else:
			print(" ", end="")
	print("")
	## 진짜 신박하게 풀었어 : 22