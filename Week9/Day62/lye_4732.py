scale = ['A', 'A#', 'B', 'C', 'C#', 'D', 'D#', 'E', 'F', 'F#', 'G', 'G#']
 
while True:
	nowScale = list(input().split())
 
	if nowScale[0] == "***":
		break
	else:
		moveFlag = int(input())
 
	for i in range(0, len(nowScale)):
		if nowScale[i] not in scale:
			if 'b' in nowScale[i]:
				nowScale[i] = nowScale[i].replace('b', '')
				nowScale[i] = scale[(scale.index(nowScale[i])-1) % len(scale)]
			else:
				nowScale[i] = nowScale[i].replace('#', '')
				nowScale[i] = scale[(scale.index(nowScale[i])+1) % len(scale)]
		print(scale[(scale.index(nowScale[i]) + moveFlag) % len(scale)], end=' ')
	print()