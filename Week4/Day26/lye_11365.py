while True:
	note = input()
	if note == 'END':
		break
	else:
		print(''.join(reversed(list(note))))