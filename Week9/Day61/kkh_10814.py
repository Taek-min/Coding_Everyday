N = int(input())
member = []
for i in range(0, N):
	member.append(input().split())
	
member.sort(key = lambda x:int(x[0])) ## 완전 잘해~~

print(len(member))
for i in range(0, len(member)):
    print(member[i][0], member[i][1])

    ## 인정 너무 잘함.