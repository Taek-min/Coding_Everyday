def getM(a,b):
	return (b-a)/400

inputs = input().split(' ')
a = int(inputs[0])
b = int(inputs[1])

print(1/(1+pow(10, getM(a,b))))

## 깔껌
