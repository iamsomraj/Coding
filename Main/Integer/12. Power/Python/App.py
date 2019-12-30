def power(a, b):
  res = 1
  for i in range(1,b+1):
    res = res * a
  return res

number = int(input("Enter the number: "))
expo = int(input("Enter the exponent: "))
print("The result of %d to the power of %d is %d"%(number,expo,power(number,expo)))