n, d = input().split()
digit = 0

for i in range(1, int(n) + 1):
	num = [int(a) for a in str(i)] ## 신기해 : 오 뭐야 멋있어,,, :2
	digit += num.count(int(d))
	
print(digit)