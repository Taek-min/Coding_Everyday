num1, num2 = input().split()
sum = 0

for num_1 in num1:
   for num_2 in num2:
      sum += int(num_1) * int(num_2)
print(sum)