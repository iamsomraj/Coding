def pascal(number):
  print("\nThe pascal's triangle printed with {0:2.2f} number of rows\n".format(number))
  triangle = [[0 for col in range(number+1)] for row in range(number+1)]
  for i in range(1,number+1):
    for j in range(1,number-i+1):
      print("\t",end="")
    for j in range(1,i+1):
      if i == j or i == 1:
        triangle[i][j] = 1
      else:
        triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1]
      print("\t{}\t".format(triangle[i][j]),end="")
    print()

number = int(input("\nEnter the number :\n"))
pascal(number)

    