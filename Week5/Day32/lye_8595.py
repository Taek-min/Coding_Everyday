wordLen = int(input())
sum = 0
word = input()
word += 'e'
numArr = []

for i in range(0, wordLen + 1):
	if word[i].isdigit():
		numArr.append(word[i])
	elif len(numArr) != 0:
		sum += int(''.join(numArr))
		numArr.clear()
		
print(sum)