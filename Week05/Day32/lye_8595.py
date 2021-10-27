wordLen = int(input())
sum = 0
word = input()
word += 'e'			#### 코드 두번쓰기 너무 귀찮아갖고 아예 하나 더 늘렸음. 
numArr = []			

for i in range(0, wordLen + 1):
	if word[i].isdigit():	####이런게 있네,,
		numArr.append(word[i])
	elif len(numArr) != 0:
		sum += int(''.join(numArr))
		numArr.clear()
		
print(sum)
#### 머리가 너무 비상한 이 예은씨 박수. 
## 깔끔 :2 : 33