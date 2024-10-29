import re

text = input("Enter an email address: ")
validation = re.search("[^@]+@+[a-zA-Z]+.[a-zA-Z]", text)

if validation:
    print(text, "is a valid email address :)")
else:
    print(text, "is not a valid email address :(")
