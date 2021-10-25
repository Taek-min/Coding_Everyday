cnt = 0
for i in range(0, 8):
	line = [str(a) for a in input()]	

	for j in range(i % 2, 8, 2):
		if line[j] == 'F':
			cnt += 1

print(cnt)
## 잘해잘해~~!