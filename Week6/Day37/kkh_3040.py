capNum = []
for i in range(0, 9):
	capNum.append(int(input()))

for i in range(0, len(capNum)):
	for j in range(i+1, len(capNum)):
		if(sum(capNum) - capNum[i] - capNum[j] == 100):
			del capNum[i]
			del capNum[j-1]
			print(*capNum, sep='\n')
			break
## 잘해 아주