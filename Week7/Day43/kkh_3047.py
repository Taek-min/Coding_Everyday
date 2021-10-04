num = list(map(int, input().split()))
char = [a for a in str(input())]	## 여기 배워갑니당 ^0^
num.sort()

for i in char:
	if i == 'A':
		print(num[0])
	elif i == 'B':
		print(num[1])
	elif i == 'C':
		print(num[2])