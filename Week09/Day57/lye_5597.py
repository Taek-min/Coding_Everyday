submitStudent = []
studentCnt = 30

for i in range(0, studentCnt-2):
	submitStudent.append(int(input()))
	
submitStudent.sort()

for i in range(0, studentCnt):
	if len(submitStudent) < i+1:
		print(i+1)
		continue
	if submitStudent[i] != i+1:
		print(i+1)
		submitStudent.insert(i,0)

## 꿌꿌 : 2 :3 꿌이 아니라 굳이야. 잘해 이옌~
	