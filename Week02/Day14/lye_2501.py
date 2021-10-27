## 변수명이 직관적이여서 주석 없어도 충분히 이해돼요!
# 주어진숫자, 몇번째 약수를 찾을것인가
number, findDivisor = map(int, input().split(' '))
# 결과값
result = 0
# 찾은 약수 개수
divisorCnt = 0

for i in range (1, number + 1):
	if(number % i == 0):
		divisorCnt += 1
	if(divisorCnt == findDivisor):
		result = i
		break

print(result)

## 깔끔~ :3