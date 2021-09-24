number = input()
numArr = []

for i in range(0, len(number)):
	numArr.append(int(number[i]))

numArr.sort(reverse=True)

print(''.join(map(str,numArr)))