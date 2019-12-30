def isPrimeOrNot(num):
  for i in range(2,int(num**0.5)):
      if num % i == 0:
          return False
  return True

number = int(input("Enter the number: "))
if(isPrimeOrNot(number)):
  print("The number %d is prime number!"%number)
else:
  print("The number %d is not prime number!"%number)
