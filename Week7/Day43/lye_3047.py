ABCdic = {}
numList = list(map(int, input().split(' ')))
numList.sort()

ABCdic['A'] = numList[0]
ABCdic['B'] = numList[1]
ABCdic['C'] = numList[2]

for c in input():
	print(ABCdic[c], end=' ')

## 깔끔