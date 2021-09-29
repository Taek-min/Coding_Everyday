capNum = []
for i in range(0, 9):
	capNum.append(int(input()))

for i in range(0, len(capNum)):
	for j in range(i+1, len(capNum)):
		## sum 연산을 매 반복마다 시키는것보단 미리 연산해서 변수에 저장해놓고 가져다쓰면 더 효율적일 것 같습니다
		if(sum(capNum) - capNum[i] - capNum[j] == 100):
			del capNum[i]
			del capNum[j-1]
			print(*capNum, sep='\n')
			break
## 잘해 아주 :2 이분도 고였네