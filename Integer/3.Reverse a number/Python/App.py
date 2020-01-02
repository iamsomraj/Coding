def reverseNumber(temp):
  rev = 0
  while(temp!=0):
    rem = temp % 10
    rev = rev * 10 + rem
    temp = temp // 10
  return rev


number = int(input("\nEnter the number: \n"))
reverseNum = reverseNumber(number)
print("The reverse number is %d"%(reverseNum))
