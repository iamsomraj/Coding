def merge(list, low, mid, high):
    i = low
    j = mid + 1
    k = low
    listCopy = [] 
    for m in list:
      listCopy.append(m)
    while i <= mid and j <= high:
        if listCopy[i] < listCopy[j]:
            list[k] = listCopy[i]
            i = i + 1
        else:
            list[k] = listCopy[j]
            j = j + 1
        k + k + 1

    if i > mid:
        while j <= high:
            list[k] = listCopy[j]
            k = k + 1
            j = j + 1

    if j > high:
        while i <= mid:
            list[k] = listCopy[i]
            k = k + 1
            i = i + 1
    print(list)

def mergeSort(list, low, high):
    if low < high:
        mid = int((low+high) / 2)
        mergeSort(list, low, mid)
        mergeSort(list, mid+1, high)
        merge(list, low, mid, high)


n = int(input("\n\nEnter the number of the elements: \n"))
llist = [0 for i in range(n)]
list = []
print("\nEnter the elements one by one: \n\n")
for i in range(n):
    list.append(int(input()))
print("\n\nThe given elements are : \n")
print(list)
mergeSort(list, 0, n-1)
