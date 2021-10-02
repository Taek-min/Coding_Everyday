JHmoney = int(input())
SMmoney = JHmoney
JHstock = 0
SMstock = 0
beforeStock = -1
upCnt = 0
downCnt = 0

for nowStock in list(map(int, input().split(' '))):
	if JHmoney >= nowStock:
		JHstock += int(JHmoney / nowStock)
		JHmoney = int(JHmoney % nowStock)
	if beforeStock == -1:
		beforeStock = nowStock
		continue
	if beforeStock == nowStock:
		downCnt = 0
		upCnt = 0
	elif nowStock > beforeStock:
		downCnt = 0
		upCnt += 1
		if upCnt >= 3:
			SMmoney += SMstock * nowStock
			SMstock = 0
	else:
		upCnt = 0
		downCnt += 1
		if downCnt >= 3:
			SMstock += int(SMmoney / nowStock)
			SMmoney = int(SMmoney % nowStock)

	beforeStock = nowStock

JHmoney += JHstock * beforeStock
SMmoney += SMstock * beforeStock

if JHmoney > SMmoney:
	print("BNP")
elif JHmoney < SMmoney:
	print("TIMING")
else:
	print("SAMESAME")

## 아 잘해 ~ 
## 멋졍~~