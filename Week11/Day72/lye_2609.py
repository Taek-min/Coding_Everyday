def GetGCD(a, b):
	if a % b == 0:
		return b
	else:
		tmp = a
		a = b
		b = tmp % a
		return GetGCD(a, b)
    
nums = list(map(int, input().split()))
gcd = GetGCD(max(nums), min(nums))
print(gcd)
print(int(nums[0]*nums[1]/gcd))
#### 짱!

		
