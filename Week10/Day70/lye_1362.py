sceneNum = 0

while True:
	bestfit, nowfit = map(int, input().split())
	if bestfit == nowfit and nowfit == 0: 
		break
	sceneNum += 1
	
	while True:
		behavior, amount = input().split()
		
		if behavior == "#" and amount == "0":
				break
		if nowfit > 0:
			if behavior == "E":
				nowfit -= int(amount)
			else:
				nowfit += int(amount)
	print(sceneNum, end = ' ')
	
	if nowfit <= 0:
		print("RIP")
	elif (nowfit > bestfit/2) and (nowfit < bestfit * 2):
		print(":-)")
	else:
		print(":-(")