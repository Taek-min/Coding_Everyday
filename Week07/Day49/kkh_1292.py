num = list(map(int, input().split()))
sum = 0
cnt = 0

for i in range(0, num[1] + 1):
	for j in range(1, i+1):
		cnt += 1
		if  cnt <= num[1] and cnt >= num[0]:
			sum += i
			
print(sum)
#### 역시 잘해 ~ :가히 잘하면서~~~ :2 