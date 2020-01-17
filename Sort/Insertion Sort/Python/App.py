# INSERTION SORT IN PYTHON BY IAMSOMRAJ

def insertionSort(list):
    for i in range(1, len(list)):
        temp = list[i]
        j = i - 1
        while j >= 0 and list[j] > temp:
            list[j+1] = list[j]
            j = j - 1
        list[j+1] = temp
    print("\nThe given array after sorting becomes: \n")
    print(list)


n = int(input("\nEnter the number of elements : \n\n"))
print("\nEnter the elements one by one\n\n")
list = []
for i in range(n):
    list.append(int(input()))
print("\nThe given array is : \n")
print(list)
insertionSort(list)
