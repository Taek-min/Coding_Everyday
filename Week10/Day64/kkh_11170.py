T = int(input())
cnt = 0

for i in range(0, T):
	nums = input().split()
    
	for j in range(int(nums[0]), int(nums[1]) + 1):
		num = [str(a) for a in str(j)]
		cnt += num.count('0')
	print(cnt)
	cnt = 0
## 잘푸네~~