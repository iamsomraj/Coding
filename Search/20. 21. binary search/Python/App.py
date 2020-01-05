def search( list, key, low, high):
  while low < high:
    mid = int(round(low+high/2))
    print(mid)
    if key == list[mid]:
      return mid
    elif key > list[mid]:
      low = mid + 1
    else:
      high = mid - 1
  return -1


list = [0,10,20,30,40,50,60,70,80,90]
print("\nDisplaying elements of the array: \n")
for i in list:
  print("%d\t\t"%i,end="")
key = int(input("\nEnter the element to be found: \n"))
pos = search(list, key, 0, len(list) - 1)
if pos == -1:
  print("\nThe element {} cannot be found on the list!\n".format(key))
else:
  print("\nThe element {} is found at {} position!\n".format(key,pos+1))