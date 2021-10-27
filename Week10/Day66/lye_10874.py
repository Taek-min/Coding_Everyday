studentCnt = int(input())
answer = '1234512345'

for i in range(1, studentCnt+1):
	if ''.join(list(input().split())) == answer:
		print(i)