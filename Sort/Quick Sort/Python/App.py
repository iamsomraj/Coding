def partition(list, low, high):
    start = low
    end = high
    pivot = list[low]
    while start < end:
        while pivot >= list[start]:
            start += 1
        while pivot < list[end]:
            end -= 1
        if start < end:
            list[start] = list[start] + list[end]
            list[end] = list[start] - list[end]
            list[start] = list[start] - list[end]
    list[low] = list[end]
    list[end] = pivot
    return end


def quickSort(list, low, high):
    if low < high:
        loc = partition(list, low, high)
        quickSort(list, low, loc-1)
        quickSort(list, loc+1, high)


num = int(input("\nEnter the number of elements : \n"))
list = []
print("\nEnter the elements one by one : \n")
for i in range(num):
    list.append(int(input()))
quickSort(list, 0, num-1)
print("\nAfter sorting, the list is displayed : \n")
print(list)
