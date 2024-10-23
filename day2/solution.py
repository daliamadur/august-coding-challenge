def reverseString(text):

    #reverse string
    backwards_list = []
    for x in range(len(text)):
        backwards_list.append(text[len(text) - x - 1])

    backwards = ''.join(backwards_list)

    print(backwards)
