roomNumber = [int(a) for a in str(input())]
numSet = 1

for i in range(0, len(roomNumber)):
   if(roomNumber[i] == 9):
      roomNumber[i] = 6
      
for i in range(0, 10):
	if numSet < roomNumber.count(i):
		if i == 6:
			numSet = roomNumber.count(i) // 2 + roomNumber.count(i) % 2
		else:
			numSet = roomNumber.count(i)

print(numSet)
## 굳 배열 안쓰고 푼거 좋아요