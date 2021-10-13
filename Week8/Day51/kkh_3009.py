vertex = []
x = []
y = []
for i in range(0, 3):
   vertex = list(map(int, input().split()))
   x.append(vertex[0])
   y.append(vertex[1])
   
for i in range(0, 3):
   if x.count(x[i]) == 1:
      vertex[0] = x[i]
   if y.count(y[i]) == 1:
      vertex[1] = y[i]

print(vertex[0], vertex[1])
## 굳 : 멋있어~! : 2:반해써