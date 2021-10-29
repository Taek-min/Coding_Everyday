N = int(input())
for i in range(0, N):
	answer = list(map(int, input().split()))

	for j in range(0, len(answer)):
		if (j % 5) + 1 == answer[j]:
			if j == len(answer) - 1:
				print(i + 1)
		else:
			break
## 굳굳굳~
## (x%5+1)이 사실 1234512345인걸 깨달았다면 더 간단하게 풀었을듯요