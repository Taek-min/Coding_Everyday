line = int(input())
res = ""

for i in range(0, line):
	res += ' ' * i + '*' * (line - i) + "\n"

print(res)