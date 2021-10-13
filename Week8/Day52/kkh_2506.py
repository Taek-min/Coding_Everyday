cnt = int(input())
score = list(map(int, input().split()))
result = 0

for i in range(0, cnt):
	if score[i] == 1:
		result += 1
		score[i] = result
	else :
		result = 0

print(sum(score))