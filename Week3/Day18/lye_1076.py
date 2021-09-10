import math

resistance = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white']

firstResistance = input()
secondResistance = input()
toMultipleColor = input()

resistanceValue = resistance.index(firstResistance) * 10 + resistance.index(secondResistance)
toMultipleNum = math.pow(10, resistance.index(toMultipleColor))

print(int(resistanceValue * toMultipleNum))

## 매우 깔끔~