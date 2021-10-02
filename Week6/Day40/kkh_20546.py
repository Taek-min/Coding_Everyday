junhyun = sungmin = int(input())
holdingJunhyun = holdingSungmin = upCnt = downCnt = 0
machineDuck = list(map(int, input().split(" ")))

for i in range(1, len(machineDuck)):
	if junhyun >= machineDuck[i-1]: 
		holdingJunhyun += junhyun // machineDuck[i-1]
		junhyun -= machineDuck[i-1] * (junhyun // machineDuck[i-1])
		
	if machineDuck[i-1] < machineDuck[i]: 
		upCnt = upCnt + 1
		downCnt = 0
	elif machineDuck[i-1] > machineDuck[i]: 
		downCnt = downCnt + 1
		upCnt = 0
	else:
		upCnt = 0
		downCnt = 0
	
	if upCnt == 3: 
		sungmin += holdingSungmin * machineDuck[i]
		holdingSungmin = 0
	elif downCnt >= 3: 
		if sungmin >= machineDuck[i]: 
			holdingSungmin += sungmin // machineDuck[i]
			sungmin -= machineDuck[i] * (sungmin // machineDuck[i])

if junhyun + machineDuck[len(machineDuck)-1] * holdingJunhyun > sungmin + machineDuck[len(machineDuck)-1] * holdingSungmin	:
	print("BNP")
elif junhyun + machineDuck[len(machineDuck)-1] * holdingJunhyun < sungmin + machineDuck[len(machineDuck)-1] * holdingSungmin :
	print("TIMING")
else:
	print("SAMESAME")
## 굳
## 그렇~~~게 화내하다가 잘 풀었네 또