studentCnt = int(input())
answer = '1 2 3 4 5 1 2 3 4 5'

for i in range(1, studentCnt+1):
	if input() == answer:
		print(i)