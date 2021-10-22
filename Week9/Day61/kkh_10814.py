N = int(input())
member = []
for i in range(0, N):
	member.append(input().split())
	
member.sort(key = lambda x:int(x[0]))

print(len(member))
for i in range(0, len(member)):
    print(member[i][0], member[i][1])