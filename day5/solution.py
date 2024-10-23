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
        print(string1 + " is an anagram of " + string2)
    else:
        print(string1 + " is not anagram of " + string2)
