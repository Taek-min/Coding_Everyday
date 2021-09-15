import math
	
while True:
	B, N = map(int, input().split(' '))
	if B + N == 0:
		break
	A = int(math.pow(B, 1/N))
	
	if B - math.pow(A, N) < math.pow(A+1, N) - B:
		print(A)
	else:
		print(A+1)

		## 깔끔