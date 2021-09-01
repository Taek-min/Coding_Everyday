workFatigue, workAmount, restFatigue, maxFatigue = map(int, input().split(' '))
totalWork = 0
totalFatigue = 0

for i in range(0, 24):
	
	if workFatigue > maxFatigue:
		break
	
	if totalFatigue <= maxFatigue - workFatigue:
		totalWork += workAmount
		totalFatigue += workFatigue
		continue
	
	totalFatigue -= restFatigue
	
	if(totalFatigue < 0):
		totalFatigue = 0

print(totalWork)
## 깔끔 : 22