import sys

n = int(input())
num = list(map(int, sys.stdin.readline().split()))

for i in range(1, min(num) + 1):
	if n == 2:
		if num[0] % i == 0 and num[1] % i == 0:
			print(i)
	else:
		if num[0] % i == 0 and num[1] % i == 0 and num[2] % i == 0:
			print(i)
#########################################################################
n = int(input())
num = list(map(int, input().split()))

for i in range(1, min(num) + 1):
	flag = 0
	for j in range(0, n):
		if num[j] % i != 0:
			flag = 1
			break
		
	if flag == 0:
		print(i)
	else:
		flag = 0
#########################################################################
n = int(input())

if n == 2:
	a, b = input().split()
	c = a
else:
	a, b, c = input().split()
	
for i in range(1, min([int(a), int(b), int(c)]) + 1):
	if int(a) % i == 0 and int(b) % i == 0 and int(c) % i == 0:
		print(i)
#시간초과 안나게 생략할 수 있는 부분 알려주면 이쁘니.. 피드백 남겨줘요 3번째가 나는 좋아아융 
## ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 쥰내 멋있어 
## 이게 뭐야