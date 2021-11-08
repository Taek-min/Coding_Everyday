numList = list(map(int, input().split()))
start = min(numList)
end = max(numList)

if(start == end):
	print('0')
else:
	print(end-start-1)
	
for i in range(start+1, end):
	print(i, end=' ')
## 부침개 실패 ㅎㅇ 