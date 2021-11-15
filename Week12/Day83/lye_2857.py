notFind = True

for i in range(5):
	name = input()
	if('FBI' in name):
		print(i+1, end=' ')
		notFind = False
if(notFind):
	print('HE GOT AWAY!')
	 
