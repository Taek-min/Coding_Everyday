word = input()
wordLen = len(word)
wordSum = 0

for i in range(0, wordLen):
	if(word[i].isupper()):	####.isupper 배워갑니다 (_ _)
		wordSum += ord(word[i]) - 38
	else:
		wordSum += ord(word[i]) - 96
		
isPrimeNum = True

for i in range(2, wordSum):
	if(wordSum % i == 0):
		isPrimeNum = False
		break;

if(isPrimeNum):
	print("It is a prime word.")
else:
	print("It is not a prime word.")