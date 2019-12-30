def fibonacci(number):
  if number <= 1:
    return number
  else:
    return fibonacci(number-1) + fibonacci(number-2)


num = int(input("\nEnter the number: \n"))
print("The first %d terms of the fibonacci series are printed: "%(num))
for i in range(num):
  print(fibonacci(i))