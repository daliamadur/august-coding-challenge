#day 1
def isPalindrome(text):
    palindrome = True

    #reverse string
    backwards = []
    for x in range(len(text)):
        if text[x] != text[len(text) - x - 1]:
            palindrome = False

    #print
    if palindrome:
        print(text + " is a palindrome :3")
    else:
        print(text + " is not a palindrome :(")

#day 2
def reverseString(text):

    #reverse string
    backwards_list = []
    for x in range(len(text)):
        backwards_list.append(text[len(text) - x - 1])

    backwards = ''.join(backwards_list)

    print(backwards)

#day 3
def iterativeFib(n):
    fib = [0, 1]

    #linear time
    for i in range(2, n+1):
        fib.append(fib[i-1] + fib[i-2])

    return fib[n]
def recursiveFib(n):
    if (n == 0):
        #constant time
        return 0
    if (n == 1):
        #constant time
        return 1
    else:
        #exponential time
        return recursiveFib(n - 1) + recursiveFib(n-2)
    
#day4
def add(a, b):
    return a + b
def sub(a, b):
    return a - b
def mul(a, b):
    return a * b
def div(a, b):
    return a / b
def calc():
    in1 = input()
    in2 = input()

    try:
        num1 = float(in1)
        num2 = float(in2)

        print("Please select an operation:")
        print("1. Addition")
        print("2. Subtraction")
        print("3. Multiplication")
        print("4. Division")
        
        option = input()

        try:
            option = int(option)
            if option > 4 or option < 1:
                print("please enter a valid option")
        except:
            print("please enter a valid option")

        else:
            match (option):
                case 1:
                    print(str(num1) + " + " + str(num2) + " = " + str(add(num1, num2)))
                case 2:
                    print(str(num1) + " - " + str(num2) + " = " + str(sub(num1, num2)))
                case 3:
                    print(str(num1) + " × " + str(num2) + " = " + str(mul(num1, num2)))
                case 4:
                    print(str(num1) + " ÷ " + str(num2) + " = " + str(div(num1, num2)))

    except:
        print("Please enter 2 numbers")

#day5
def bubbleSort(text):
    for i in range(1, len(text)):
        swapped = False
        
        for j in range (0, len(text) - i):
            if text[j] > text[j+1]:
                text[j], text[j+1] = text[j+1], text[j]
                swapped = True
        if swapped == False:
            break

    return text
def split(text):
    arr = []

    for c in text:
        arr.append(c)
    
    return arr
def isAnagram(string1, string2):
    arr1 = bubbleSort(split(string1.replace(" ", "")))
    arr2 = bubbleSort(split(string2.replace(" ", "")))

    if (arr1 == arr2):
        print(string1 + " is an anagram of " + string2 + " :3")
    else:
        print(string1 + " is not anagram of " + string2 + " :(")

#day6
def iterativeFact(n):
    factorial = 1
    
    for i in range(1, n + 1):
        factorial *= i
    
    return factorial
def recursiveFact(n):
    if n == 1:
        return 1
    else:
        return n * recursiveFact(n - 1)
    
#day7
def uniqueChars(text):
    charArr = split(text)
    charArr = bubbleSort(charArr)
    unique = True

    for i in range(1, len(charArr)):
        if charArr[i-1] == charArr[i]:
            unique = False
            break

    return unique