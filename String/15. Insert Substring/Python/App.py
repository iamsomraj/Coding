inputString = input("\nEnter the string : \n")
position = int(input("\nEnter the position : \n"))
subString = input("\nEnter the Substring\n")
inputString = inputString[:position-1] + subString + inputString[position-1:]
print("\nThe new string becomes : \n")
print(inputString)