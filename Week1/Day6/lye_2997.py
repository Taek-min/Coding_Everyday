numbers = list(map(int, input().split(' ')))
numbers.sort()

firstDiff = numbers[1] - numbers[0]
secondDiff = numbers[2] - numbers[1]

if firstDiff == secondDiff : 
    print(numbers[2] + firstDiff)
elif secondDiff < firstDiff :
    print(numbers[0] + secondDiff)
else :
    print(numbers[1] + firstDiff)
#### 굳굳
#### 개깔끔

