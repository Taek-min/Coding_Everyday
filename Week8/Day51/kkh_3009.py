vertex = []
x = []
y = []
for i in range(0, 3):
	vertex = list(map(int, input().split()))
	x.append(vertex[0])
	y.append(vertex[1])
	
for i in x:
	if x.count(i) == 2:
		for j in range(0, 2):
			x.remove(i)
for i in y:
	if y.count(i) == 2:
		for j in range(0, 2):
			y.remove(i)
			
print(x[0], y[0])
## 굳