numList = [int(input()) for i in range(8)]
top5 = []
sumTop = 0

for n in range(5):
	maxN = numList.index(max(numList))
	top5.append(maxN + 1)
	sumTop += numList[maxN]
	numList[maxN] = 0

top5.sort()
print(sumTop)
print(' '.join(map(str,top5)))
## 역시 잘해 ~!
