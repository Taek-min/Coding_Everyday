customerCnt = int(input())
customerList = list(map(int, input().split()))
print(customerCnt - len(set(customerList)))