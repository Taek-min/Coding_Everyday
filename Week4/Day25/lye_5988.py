caseCnt = int(input())
for i in range(0, caseCnt):
	num = input()
	numLen = len(num)
	digit = int(num[numLen-1])
	
	if digit % 2 == 1:
		print("odd")
	else:
		print("even")
## 역시 고인물 ## 너무하다 파이썬,, 