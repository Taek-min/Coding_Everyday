n = int(input())
for i in range(n, 0, -1):
	print(" "*(n-i), end="")
	print("*"*i) 

	#for j in range(n):
	#	if i <= j:
	#		print("*", end="")
	#	else:
	#		print(" ", end="")
	#print("")