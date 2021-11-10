caseCnt = int(input())

for i in range(caseCnt):
	floor = int(input())
	roomNum = int(input())
	
	beforeRooms = [i for i in range(1, roomNum+1)]
	
	for j in range(floor):
		floorSum = 0
		for k in range(roomNum):
			floorSum += beforeRooms[k]
			beforeRooms[k] = floorSum
	print(beforeRooms[roomNum-1])	
## 굳