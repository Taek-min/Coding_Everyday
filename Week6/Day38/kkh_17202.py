phoneA = [int(a) for a in str(input())] ## 파이썬 활용 개잘하시는데? 리스트 내포 ㄷㄷ
phoneB = [int(a) for a in str(input())]
fullNum = []
possibility = []

for i in range(0, len(list(phoneA))): 
    fullNum.append(phoneA[i])
    fullNum.append(phoneB[i])

while (len(fullNum) > 2) : 
	for i in range(0, len(fullNum)-1):
		num = fullNum[i] + fullNum[i+1]
		if num >= 10: ## 10에 대한 나머지 구하면 간단함!
			num -= 10
		possibility.append(num)
	fullNum = possibility
	possibility = []
   
print(*fullNum, sep='')
## 잘해 아주~ :2
