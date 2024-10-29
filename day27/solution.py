sum = int(input("Enter sum: "))
array = []
print("Enter all array values: ")

for a in input().split():
    array.append(int(a))

def count(coins, n, sum):
    dp = [[0 for j in range(sum + 1)] for i in range(n + 1)]
    dp[0][0] = 1

    for i in range(1, n + 1):
        for j in range(sum + 1):
            dp[i][j] += dp[i-1][j]

            if j - coins[i-1] >= 0:
                dp[i][j] += dp[i][j - coins[i-1]]
    return dp[n][sum]

print(count(array, len(array), sum))
