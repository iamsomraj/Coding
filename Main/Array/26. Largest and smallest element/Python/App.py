def takeNumberInput():
    number = input("\nEnter the number of elements: \n")
    number = int(number, 10)
    return number


def takeListInput(number):
    print("\nEnter the elements one by one: \n")
    numbers = []
    for i in range(number):
        number = int(input())
        numbers.append(number)
    return numbers


number = takeNumberInput()
arr = takeListInput(number)

maxNumber = max(arr)
minNumber = min(arr)

arr.remove(maxNumber)
arr.remove(minNumber)

secondMaxNumber = max(arr)
secondMinNumber = min(arr)

print("\nMaximum is %.2d and Second Maximum is %.2d\n"%(maxNumber,secondMaxNumber))
print("\nMinimum is %.2d and Second Minumum is %.2d\n"%(minNumber,secondMinNumber))
