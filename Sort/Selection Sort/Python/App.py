def selectionSort(list):
  for i in range(len(list)-1):
    min = i
    for j in range(i+1,len(list)):
      if list[min] > list[j]:
        min = j
    if min != i:
      list[min] = list[min] + list[i]
      list[i] = list[min] - list[i]
      list[min] = list[min] - list[i]
  return list


number = int(input("\nEnter the number of the elements :\n"))
print("\nEnter the elements one by one :\n")
list = []
for i in range(number):
  list.append(int(input()))
list = selectionSort(list)
print("\nThe elements of the array after sorting becomes: \n")
print(list)