import math
roomNum = input()
numCnt = []

for i in range(0, 10):
	numCnt.append(roomNum.count(str(i)))
	
numCnt[6] += numCnt[9]
numCnt[6] = math.ceil(numCnt[6]/2)
del numCnt[9] ## 인덱스 삭제가 깔꼼했을듯
maxIndex = numCnt.index(max(numCnt))

print(numCnt[maxIndex])
## 깔끔 뽜이뜅~~~~~~~~~~ 
## 깔꼼 빠이띵~~~~~~~~~~
