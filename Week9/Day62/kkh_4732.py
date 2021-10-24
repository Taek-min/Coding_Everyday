while True:
	case = input().split()
	
	if case[0] == '***':
		break
	
	change = int(input())
	
	for i in range(0, len(case)):
		if change == -1:
			case[i] = case[i].replace('b', '')
		else :
			case[i] = case[i].replace('#', '')
			
		if len(case[i]) == 2:
			case[i] = case[i][0:1]
		else :
			if change == -1:
				if case[i] == 'A': case[i] = 'G#'
				else: case[i] = chr(ord(case[i]) + change) + '#'
			else:
				if case[i] == 'G': case[i] = 'A'
				else: case[i] = chr(ord(case[i]) + change)
			
	print(' '.join(case))
	##깔끔