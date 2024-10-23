def isPalindrome(text):
    palindrome = True

    #reverse string
    backwards = []
    for x in range(len(text)):
        if text[x] != text[len(text) - x - 1]:
            palindrome = False

    #print
    if palindrome:
        print(text + " is a palindrome")
    else:
        print(text + " is not a palindrome")
