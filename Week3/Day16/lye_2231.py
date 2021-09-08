## 함수 굳
def GetDigitSum(x):
	res = x
	num = x
	
	while num/10 > 0:
		res += num % 10
		num = int(num / 10)
		
	return res + num

number = int(input())
result = 0

for i in range(1, number):
	if GetDigitSum(i) == number:
		result = i
		break
	
print(result)

## 깔끔 : 2 : 3