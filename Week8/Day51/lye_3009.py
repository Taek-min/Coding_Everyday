xPos = []
yPos = []

def find_different(numList):
	if numList[0]==numList[1]:
		return numList[2]
	elif numList[1]==numList[2]:
		return numList[0]
	else:
		return numList[1]
		
for i in range(0,3):
	x,y = map(int, input().split())
	xPos.append(x)
	yPos.append(y)

print(find_different(xPos), find_different(yPos)) ## 신기한거다 : 우와 저게 그 "함수"라는건가?