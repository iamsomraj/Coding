def bubbleSort(list):
  for i in range(0,len(list)-1):
    for j in range(0,len(list)-i-1):
      if list[j] > list[j+1]:
        print("\n%d > %d"%(list[j],list[j+1]))
        (list[j], list[j+1]) = (list[j+1], list[j])
    print("\nNext Pass\n")
  print("\nThe elements are now sorted in ascending order:\n")
  for i in list:
    print("\t%d\t"%(i),end="")

n = int(input("\nEnter the number of elements : \n"))
list = []
print("\nEnter the elements one be one:\n")
for i in range(n):
  list.append(int(input())) 
bubbleSort(list)