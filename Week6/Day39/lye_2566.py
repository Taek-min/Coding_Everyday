lineCnt = 9
maxNum = 0
maxNumRow = 0
maxNumColumn = 0

for i in range(0, lineCnt):
	nowList = list(map(int, input().split(' '))) ## 1중 for문으로 해결보셨네
	nowMax = max(nowList)
	if(nowMax > maxNum):
		maxNum = nowMax
		maxNumRow = i+1
		maxNumColumn = nowList.index(maxNum) + 1
		
print(maxNum)
print(maxNumRow, maxNumColumn)

## 잘하시네용 :2 :3 :4