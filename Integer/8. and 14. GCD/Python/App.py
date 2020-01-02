def gcd(a, b):
    if b > a:
        gcd(b, a)

    if b == 0:
        return a
    else:
        return gcd(b, a % b)

number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))

res = gcd(number1, number2)

print("The gcd of %d and %d is %d"%(number1,number2,res))