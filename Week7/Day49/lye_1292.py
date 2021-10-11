startNum, endNum = map(int, input().split())
sum = 0
cnt = 0

for i in range(1, endNum + 1):
	for j in range(1, i + 1):
		cnt += 1
		if(cnt >= startNum and cnt <= endNum):
			sum += i
	if cnt >= endNum:
		break
print(sum)
#### 잘하셨네 ~ 고생하셨어요 ,,, 