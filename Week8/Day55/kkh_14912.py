n, d = input().split()
digit = 0

for i in range(1, int(n) + 1):
	num = [int(a) for a in str(i)]
	digit += num.count(int(d))
	
print(digit)