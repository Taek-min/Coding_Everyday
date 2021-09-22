message = input()
happy = message.count(':-)')
sad = message.count(':-(')

if happy + sad == 0:
	print("none")
elif happy == sad:
	print("unsure")
elif happy > sad:
	print("happy")
else:
	print("sad")
#### ㅋㅋ. : 이거 푸는데 10분도 안걸린다? 파이썬 개날먹