import math

divisors = [1]
num = 0

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
	
##깔끔.
