noteCnt, boxMax = map(int, input().split())
boxCnt = 0

if noteCnt != 0:
    noteList = list(map(int, input().split()))
    beforeBox = 0

    for i in range(0, len(noteList)):
        boxCnt += 1
        if noteList[i] <= beforeBox:
            boxCnt -= 1
            beforeBox -= noteList[i]
        else:
            beforeBox = boxMax - noteList[i]
            
print(boxCnt)
			
