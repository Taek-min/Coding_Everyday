gameCnt = int(input())
CYscore = 100
SDscore = 100

for i in range(0, gameCnt):
	CYnum, SDnum = map(int, input().split())
	if CYnum == SDnum:
		continue
	elif CYnum > SDnum:
		SDscore -= CYnum
	else:
		CYscore -= SDnum
		
print(CYscore)
print(SDscore)
## 시험끝나고 달려~~~~~~~~~~~~~ :2 :3 옼케 시험 끝나고 콜이야 : 4