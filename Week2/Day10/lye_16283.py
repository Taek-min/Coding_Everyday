sheepGram, goatGram, totalCnt, totalGram = map(int, input().split(' '))
findNum = False
sheepCnt = 0
goatCnt = 0

for i in range(1, totalCnt):
	## 식이 조금 복잡한 편이라서 따로 변수로 빼줘서 이름으로 설명해줬다면 가독성이 더 좋았을 것 같아요!
	## if문 조건식에서 제가 놓친부분을 깨달이갑니다.
	if sheepGram * i + goatGram * (totalCnt - i) == totalGram:
		if findNum:
			findNum = False
			break
		else:
			sheepCnt = i
			goatCnt = totalCnt-i
			findNum = True

## sheepCnt, goatCnt = -1, -1로 해두고 둘 다 -1이면 못 찾은걸로 처리하게 하고 findNum 플래그변수는 없애면 코드가 더 깔끔해질 것 같습니다
if findNum:
	print(sheepCnt, goatCnt)
else:
	print(-1)
## 배우고 갑니당 깔꼼해요 :2