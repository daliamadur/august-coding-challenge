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
