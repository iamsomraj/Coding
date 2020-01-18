def merge(list, low, mid, high):
    i = low
    j = mid + 1
    k = low
    listCopy = list.copy()
    while i <= mid and j <= high:
        if listCopy[i] < listCopy[j]:
            list[k] = listCopy[i]
            i += 1
        else:
            list[k] = listCopy[j]
            j += 1
        k += 1
    if i > mid:
        while j <= high:
            list[k] = listCopy[j]
            j += 1
            k += 1

    if j > high:
        while i <= mid:
            list[k] = listCopy[i]
            i += 1
            k += 1


def mergeSort(list, low, high):
    if low < high:
        mid = int((low+high)//2)
        mergeSort(list, 0, mid)
        mergeSort(list, mid+1, high)
        merge(list, low, mid, high)


num = int(input("\nEnter the number of the elements : \n"))
print("\nEnter the elements one by one: \n")
list = []
for i in range(num):
    list.append(int(input()))
mergeSort(list, 0, len(list)-1)
print("\nAfter sorting :\n")
print("\nThe elements are displayed :\n\n")
print(list)