memberCnt = int(input())
isFind = False

for i in range(0, memberCnt):
	if input() == 'anj':
		print("뭐야;")
		isFind = True
		break ####옹 되나보네 
	
if isFind==False:
	print("뭐야?")