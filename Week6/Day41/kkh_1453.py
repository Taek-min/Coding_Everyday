peopelNum = int(input())
choiceList = list(map(int, input().split()))
choiceList.sort()
reject = 0

for i in range(0, len(choiceList)-1):
	if choiceList[i] == choiceList[i+1]:
		reject += 1
		
print(reject)