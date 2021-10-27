problemCnt = int(input())
scoreList = map(int, input().split())
totalScore = 0
answerCnt = 0

for score in scoreList: 
	if score == 1:
		answerCnt += 1
	else:
		answerCnt = 0
	totalScore += answerCnt
	
print(totalScore)
## 잘해잘해~!~! :2 :3