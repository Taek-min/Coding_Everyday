capNum = []
for i in range(0, 9):
	capNum.append(int(input()))

for i in range(0, len(capNum)):
	for j in range(i+1, len(capNum)):
		## sum 연산이 최악의 경우 81번까지 실행됩니다. 한번만 미리 연산해두고 가져다쓰면 효율적일 것 같습니다
		if(sum(capNum) - capNum[i] - capNum[j] == 100):
			del capNum[i]
			del capNum[j-1]
			print(*capNum, sep='\n')
			break
## 잘해 아주 :2 이분도 고였네 :3