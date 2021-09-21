import math

divisors = [1]
num = 0

## 파이썬은 get_and_sum_divisors 스네이크 표기법으로 쓰는게 관례
def GetAndSumDivisors(num):
	sum = 1
	for i in range(2, int(math.sqrt(num)) + 1):
		if num % i == 0:
			divisors.append(i)
			divisors.append(int(num/i))
			sum += i
			sum += num/i
	return sum

def PrintResult(isPerfect):
	if(isPerfect):
		print(num, end=' = ')
		divisors.sort()
		print(" + ".join(map(str,divisors)))
	else:
		print("%d is NOT perfect."%num)
		
while True:
	num = int(input())
	divisors = [1]
	if num == -1:
		break
	PrintResult(num == GetAndSumDivisors(num))
	
##깔끔. 맨날 짧다하니까 함수만들어서 막 ~ 열심히 해줬네~? 누렁이보고싶다~ 
## 깔끔합니다 : 22