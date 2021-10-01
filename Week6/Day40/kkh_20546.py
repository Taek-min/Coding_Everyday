junhyun = int(input())
sungmin = junhyun
bnpJunhyun = 0
bnpSungmin = 0
upCnt = 0
downCnt = 0
machineDuck = list(map(int, input().split(" ")))

for i in range(1, len(machineDuck)):
	if junhyun >= machineDuck[i-1]: ## 준현
		bnpJunhyun += junhyun // machineDuck[i-1]
		junhyun -= machineDuck[i-1] * (junhyun // machineDuck[i-1])
		
	if machineDuck[i-1] < machineDuck[i]: #매도
		upCnt = upCnt + 1
		downCnt = 0
	elif machineDuck[i-1] > machineDuck[i]: #매수
		downCnt = downCnt + 1
		upCnt = 0
	else:
		upCnt = 0
		downCnt = 0
	
	if upCnt == 3: #매도
		sungmin += bnpSungmin * machineDuck[i]
		bnpSungmin = 0
		upCnt = 0
	elif downCnt >= 3: #매수
		if sungmin >= machineDuck[i]: #성민
			bnpSungmin += sungmin // machineDuck[i]
			sungmin -= machineDuck[i] * (sungmin // machineDuck[i])

if(junhyun + machineDuck[len(machineDuck)-1] * bnpJunhyun > sungmin + machineDuck[len(machineDuck)-1] * bnpSungmin)	:
	print("BNP")
elif(junhyun + machineDuck[len(machineDuck)-1] * bnpJunhyun < sungmin + machineDuck[len(machineDuck)-1] * bnpSungmin) :
	print("TIMING")
else:
	print("SAMESAME")
