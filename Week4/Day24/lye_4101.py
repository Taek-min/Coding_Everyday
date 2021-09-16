while True:
	firstNum, secondNum = map(int, input().split(' '))
	if firstNum + secondNum == 0: ## 이열 더하기~ : 오~ 역시 목요일 오늘도 학교를 가는 이 예은씨의 저 비상한 두뇌회전 배우고 가요~  : 22
		break
	if firstNum > secondNum:
		print("Yes")
	else:
		print("No")

## 깔끔