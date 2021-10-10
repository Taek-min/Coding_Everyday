num = int(input())

for i in range(0, num):
   for j in range(num * 2 - 1):
      if num - i == j + 1:
         print("*", end="")
         if i == 0: 
         	break  
      elif num + i == j + 1:
         print("*", end="")
         break 
      else:
         print(" ", end="")
         
   print("")

## 7, 8, 11만 없으면 깔끔한데.... 백준이.. "출력 형식이 잘못되었습니다"이래서.. 억울하네....