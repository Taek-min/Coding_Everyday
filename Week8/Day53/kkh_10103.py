n = int(input())
changyoung = sangduck = 100

for i in range(0, n):
	dice = list(map(int, input().split()))
	if dice[0] > dice[1]:
		sangduck -= dice[0]
	elif dice[0] < dice[1]:
		changyoung -= dice[1]

print(changyoung, sangduck, sep='\n')
## 행복하게 풀었겠네 :2:완존잘해~