studentNum = [int(i) for i in range(1, 31)]

for i in range(0, 28):
	submissionNum = int(input())
	if submissionNum in studentNum:
		studentNum.remove(submissionNum)
		
print(studentNum[0], studentNum[1], sep='\n')
