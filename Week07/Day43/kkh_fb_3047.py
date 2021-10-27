num = list(map(int, input().split()))
char = [a for a in str(input())]	## 여기 배워갑니당 ^0^ :2 : 3:4
num.sort()

## if 없이 num[ord(str.charAt(i)) - ord('A')] 출력해도 됨
for i in char:
	print(num[ord(i) - ord('A')])