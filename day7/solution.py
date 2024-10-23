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

def uniqueChars(text):
    charArr = split(text)
    charArr = bubbleSort(charArr)
    unique = True

    for i in range(1, len(charArr)):
        if charArr[i-1] == charArr[i]:
            unique = False
            break

    return unique
