girlCnt, boyCnt, internCnt = map(int, input().split(' '))
teamCnt = 0

while girlCnt >= 2 and boyCnt >= 1 :
	teamCnt += 1
	girlCnt -= 2
	boyCnt -= 1
	if girlCnt + boyCnt < internCnt :
		teamCnt -= 1
		break
	
print(teamCnt)
####깔꼼 b : 2 : 3