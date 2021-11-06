for i in range(int(input())):
	scores = list(map(int, input().split()))
	del scores[0]
	scores.sort(reverse=True)
	largestGap = 0
	scoreCnt = len(scores)-1
	
	for j in range(0, scoreCnt):
		gap = scores[j] - scores[j+1]
		if abs(gap) > largestGap:
			largestGap = gap
	print("Class", i+1)
	print('Max {0}, Min {1}, Largest gap {2}'.format(scores[0], scores[scoreCnt], largestGap))

	## 잘해 잘해~
