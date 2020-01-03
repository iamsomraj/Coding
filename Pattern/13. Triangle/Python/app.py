def drawTriangle(number):
  print("\nThe triangle is displayed below: \n")
  for i in range(0,number):
    for j in range(0,number-i-1):
      print("\t",end="")
    for j in range(0,2*i+1):
      print("\t*",end="")
    print()



number = int(input("\nEnter the number of rows:\n"))
drawTriangle(number)