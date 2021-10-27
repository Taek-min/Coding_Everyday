nm = list(map(int, input().split()))

if nm[0] == 0:
	print(0)
else:
	boxWeight = list(map(int, input().split()))
	boxCnt = 1

	weight = 0
	for i in range(0, nm[0]): 
		if(weight + boxWeight[i] <= nm[1]) :
			weight += boxWeight[i]
		else :
			weight = 0
			weight += boxWeight[i]
			boxCnt += 1
	print(boxCnt)
## 역시 잘해~ :2:3