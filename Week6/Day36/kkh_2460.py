inPeople = 0
maxPeople = 0
for i in range(1, 10):
    newPeople = list(map(int, input().split(" ")))
    inPeople = inPeople - newPeople[0] + newPeople[1]
    if maxPeople < inPeople:
        maxPeople = inPeople
 
print(maxPeople)
## 깔끔 :2