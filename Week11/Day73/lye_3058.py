caseCnt = int(input())

for i in range(0, caseCnt):
	evenNums = [n for n in list(map(int, input().split())) if n%2==0]
	print(sum(evenNums), min(evenNums))
## 깔끔