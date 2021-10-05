n = int(input())
line = list(map(int, input().split()))

for i in line:
	if line.index(i) + 1 == i:
		n -= 1

print(n)