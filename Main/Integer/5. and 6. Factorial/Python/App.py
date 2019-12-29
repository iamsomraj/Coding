def fibonacci(number):
    if(number <= 1):
        return number
    else:
        return (number * fibonacci(number-1))


num = int(input("\nEnter the number: \n"))
fact = fibonacci(num)
print("The factorial value of %d is %d"%(num,fact))
