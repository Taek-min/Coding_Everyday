#양이 먹는양, 염소가 먹는양, 전체마리수, 전체먹은 양
sheepGram, goatGram, totalCnt, totalGram = map(int, input().split(' '))
#숫자를 정상적으로 찾았는가
findNum = False
#양 마리수
sheepCnt = 0
#염소 마리수
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

if findNum:
	print(sheepCnt, goatCnt)
else:
	print(-1)
## 배우고 갑니당 깔꼼해요 :2