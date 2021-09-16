while True:
	firstNum, secondNum = map(int, input().split(' '))
	if firstNum + secondNum == 0: ## 이열 더하기~
		break
	if firstNum > secondNum:
		print("Yes")
	else:
		print("No")

## 깔끔