import datetime

memCnt = int(input())
nameList=[]
dateList=[]

for i in range(memCnt):
	inputs = list(input().split())
	nameList.append(inputs[0])
	date = datetime.date(int(inputs[3]),int(inputs[2]),int(inputs[1]))
	dateList.append(date)
	
print(nameList[dateList.index(max(dateList))])
print(nameList[dateList.index(min(dateList))])
## 잘해잘해~ :2 깔끔하다
