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
