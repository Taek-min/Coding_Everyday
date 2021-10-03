line = int(input())

for i in range(1, line):
	for j in range(0, i):
		print('*', end='')
	for j in range(0, 2*line - 2*i):
		print(' ', end='')
	for j in range(0, i):
		print('*', end='')
	print()
	
for i in range(0, line):
	for j in range(0, line-i):
		print('*', end='')
	for j in range(0, 2*i):
		print(' ', end='')
	for j in range(0, line-i):
		print('*', end='')
	print()
		