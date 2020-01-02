def fibonacci(number):
  a = 0
  b = 1
  sum = a + b
  while(number!=0):
    print(a)
    a = b
    b = sum 
    sum = a + b
    number -= 1

num = int(input("\nEnter the number: \n"))
print("\nThe %d terms of fibonacci series is displayed : \n"%(num))
fibonacci(num)
