def GetGCD(a, b): ## Oh very nice! 
	if a % b == 0:
		return b
	else:
		tmp = a
		a = b
		b = tmp % a
		return GetGCD(a, b)
		
caseCnt = int(input())
for i in range(0, caseCnt):
	nums = list(map(int, input().split()))
	gcd = GetGCD(max(nums), min(nums))
	print(int(nums[0]*nums[1]/gcd), gcd)

	## 잘하십니다 : 2
		
