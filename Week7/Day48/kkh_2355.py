num = list(map(int, input().split()))

print(int((max(num) - min(num) + 1)*(max(num)+min(num))/2))