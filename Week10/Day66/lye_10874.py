studentCnt = int(input())
answer = '1234512345'

for i in range(1, studentCnt+1):
	## answer에 사이사이 띄어쓰기를 넣어두고(1 2 3) 통으로 비교하는게 더 직관적이고 효율적일 것 같습니다
	if ''.join(list(input().split())) == answer:
		print(i)
## 좀 치네 