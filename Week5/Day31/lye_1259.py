def is_palindrome(num):
	reverseNum = list(reversed(num))
	for i in range(0, int(len(num)/2)):
		if reverseNum[i] != num[i]:
			return False
	return True
	
while True:
	number = input()
	if number == '0':
		break
	if is_palindrome(number):
		print('yes')
	else:
		print('no')

## 날먹도 실력이다 : 잘,, 한다,,! 