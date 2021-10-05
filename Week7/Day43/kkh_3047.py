num = list(map(int, input().split()))
char = [a for a in str(input())]	## 여기 배워갑니당 ^0^ :2 : 3
num.sort()

## if 없이 num[ord(str.charAt(i)) - ord('A')] 출력해도 됨
for i in char:
	if i == 'A':
		print(num[0])
	elif i == 'B':
		print(num[1])
	elif i == 'C':
		print(num[2])