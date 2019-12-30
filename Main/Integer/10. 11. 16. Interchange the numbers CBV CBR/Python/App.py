class Number:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def callByValue(self, a, b):
        print("Call by value:")
        a = a ^ b
        b = a ^ b
        a = a ^ b

    def callByReference(self, Number):
        print("Call by reference:")
        self.a = self.a ^ self.b
        self.b = self.a ^ self.b
        self.a = self.a ^ self.b

    def printNumbers(self):
        print("The numbers are: %d and %d"%(self.a, self.b))


a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))
number = Number(a, b)
number.printNumbers()
number.callByValue(a, b)
number.printNumbers()
number.callByReference(number)
number.printNumbers()


