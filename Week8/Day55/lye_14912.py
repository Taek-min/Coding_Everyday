number, findNum = input().split()

for i in range(1, int(number)):
	number += str(i)
	
print(number.count(findNum))
## 깰꼼