import math

climbAmount, slideAmount, barHeight = map(int, input().split(' '))
barHeight -= slideAmount
dayCnt = barHeight / (climbAmount - slideAmount)

print(math.ceil(dayCnt))