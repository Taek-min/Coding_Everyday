import math

while True:
	
	lines = list(map(int, input().split()))
	lines.sort()
	if(sum(lines) == 0):
		break

	if(int(math.sqrt(math.pow(lines[0], 2) + math.pow(lines[1], 2))) == lines[2]):
		print("right")
	else:
		print("wrong")