brainCnt = int(input())
for i in range(0, brainCnt):
	requireBrain, eatBrain = map(int, input().split())
	if requireBrain >= eatBrain:
		print("MMM BRAINS")
	else:
		print("NO BRAINS")