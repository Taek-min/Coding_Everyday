while True:
	firstNum, secondNum = map(int, input().split(' '))
	if firstNum + secondNum == 0:
		break
	if firstNum > secondNum:
		print("Yes")
	else:
		print("No")