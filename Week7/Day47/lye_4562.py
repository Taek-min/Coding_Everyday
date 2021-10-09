brainCnt = int(input())
for i in range(0, brainCnt):
	requireBrain, eatBrain = map(int, input().split())
	if requireBrain >= eatBrain:
		print("MMM BRAINS")
	else:
		print("NO BRAINS")
## 정효야 생일 축하 했어~~ 