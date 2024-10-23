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
