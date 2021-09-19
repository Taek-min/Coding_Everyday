line = int(input())

for i in range(0, line):
	for j in range(0, line-i):
		print('*', end='')
	print()