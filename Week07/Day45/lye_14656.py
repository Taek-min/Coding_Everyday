studentCnt = int(input())
wrongCnt = 0

for i, studentNum in enumerate(map(int, input().split(' '))):
	if i+1 != studentNum:
		wrongCnt += 1

print(wrongCnt)
## 깔끔
## 백신 2차 화이팅! :2 : 노 부작용 기원