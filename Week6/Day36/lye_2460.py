passengerCnt = 0
maxPassenger = 0

for i in range(0, 10):
	getOutCnt, getInCnt = map(int,input().split())
	passengerCnt += getInCnt - getOutCnt
	if passengerCnt > maxPassenger:
		maxPassenger = passengerCnt

print(maxPassenger)