num = int(input())
for i in range(0, num):
    arr = list(map(int, input().split(" ")))
    arr.sort(reverse=True)
    print(arr[2])