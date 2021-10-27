import math

climbAmount, slideAmount, barHeight = map(int, input().split(' '))
barHeight -= slideAmount
dayCnt = barHeight / (climbAmount - slideAmount)

print(math.ceil(dayCnt))
## 깔끔.:22
## 파이썬 날먹!!