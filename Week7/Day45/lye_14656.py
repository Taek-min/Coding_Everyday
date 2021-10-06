studentCnt = int(input())
wrongCnt = 0

for i, studentNum in enumerate(map(int, input().split(' '))):
	if i+1 != studentNum:
		wrongCnt += 1

print(wrongCnt)