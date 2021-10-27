while(True):
	number = input()
	
	if number == '0':	
		break
	
	numCnt = len(number)
	width = numCnt+1

	countNum = number.count('1')
	numCnt -= countNum
	width += countNum * 2
	
	countNum = number.count('0')
	numCnt -= countNum
	width += countNum * 4
	
	width += numCnt * 3
	print(width)

	## 잘하시네요 :2 준내 멋있어 반복문 많이 안쓴게 대단해ㅜ : 역시 예 은 