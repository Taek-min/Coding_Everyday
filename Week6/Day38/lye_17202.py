def get_num_arr():
	str = input()
	numArr = []
	
	for i in range(0, len(str)):
		numArr.append(int(str[i]))
	return numArr

firstArr = get_num_arr()
secondArr = get_num_arr()

for i in range(0, len(firstArr)):
	firstArr.insert(2*i+1, secondArr[i]) ## *+%같은 연산자 양옆에 띄어쓰기 넣는게 국룰

while(len(firstArr) > 2):
	for i in range(0, len(firstArr) - 1):
		firstArr[i] = (firstArr[i] + firstArr[i+1]) % 10
	firstArr.pop()
	
print("%d%d"%(firstArr[0], firstArr[1])) ## *+%같은 연산자 양옆에 띄어쓰기 넣는게 국룰

## 언제 풀고 놀았어 ~ 잘해 아주 :2