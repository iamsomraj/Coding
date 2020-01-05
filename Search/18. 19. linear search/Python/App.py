def search(list, key):
  pos = -1
  for i in range(0,len(list)):
    if list[i] == key:
      pos = i + 1
      break
  
  if pos != -1:
    print("\n\nThe value {} is found to be at {} position!".format(key,pos))
  else:
    print("\n\nThe value {} cannot be found!".format(key))

    


print("\nEnter the elements of the array in one string with spaces: \n")
array = list(map(int, input().split()))
("\nEnter the number you want to find: \n")
key = int(input("\nEnter the number you want to find: \n"))
search(array,key)
