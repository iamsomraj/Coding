def matrixMultiplication(matrixOne, matrixTwo):
  resultMatrix = [ [0 for col in range(d)] for row in range(a) ]
  print("\nThe result of the matrix multiplication is: \n")
  for i in range(0,a):
    for j in range(0,d):
      for k in range(0,c):
        resultMatrix[i][j] += ( matrixOne[i][k] * matrixTwo[k][j] )
  print(resultMatrix)

a = int(input("\nEnter the row of first matrix:\n"))
b = int(input("\nEnter the column of first matrix:\n"))

c = int(input("\nEnter the row of second matrix:\n"))
d = int(input("\nEnter the column of second matrix:\n"))


if b != c:
    print("\nRow and Column Mismatch!\n")
else:
    print("Enter the elemenst of first matrix: ")
    matrixOne = [[int(input()) for col in range(b)] for row in range(a)]
    print(matrixOne)
    print("Enter the elemenst of second matrix: ")
    matrixTwo = [[int(input()) for col in range(d)] for row in range(c)]
    print(matrixTwo)
    matrixMultiplication(matrixOne, matrixTwo)