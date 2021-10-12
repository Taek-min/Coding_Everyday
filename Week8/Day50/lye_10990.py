line = int(input())

for i in range(0, line):
	for j in range(0, line-1-i):
		print(' ', end='')
	print('*', end='')
	for j in range(0, 2*i-1):
		print(' ', end='')
	if i > 0:
		print('*', end='')
	print()
## 굿굿~ : 22