customerCnt = int(input())
customerList = list(map(int, input().split()))
print(customerCnt - len(set(customerList)))

## 이건 너무 날먹아닌가
## 파이썬 활용 굿