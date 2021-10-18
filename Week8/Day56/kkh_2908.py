num1, num2 = input().split()

num1 = (int(num1) % 10 * 100) + (int(num1) % 100 // 10 * 10) + (int(num1) // 100)
num2 = (int(num2) % 10 * 100) + (int(num2) % 100 // 10 * 10) + (int(num2) // 100)

if num1 > num2:
	print(num1)
else:
	print(num2)
## ㅋㅋ good :요게 정석이줴 :2