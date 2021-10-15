while True:
	address = [int(a) for a in str(input())]
	if address[0] == 0:
		break
	index = 0
	if(address != 0):
	   for i in address:
	      if i == 1:
	         address[index] = 2
	      elif i == 0:
	         address[index] = 4
	      else:
	         address[index] = 3
	      index += 1
	         
	   print(sum(address) + (len(address)-1) + 2)