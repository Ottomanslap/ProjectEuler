import math

def isPalindrome(x):
    x = str(x)
    while len(x) > 1:
        if x[0] != x[-1]:
            return False
        x = x[1:-1]
    return True

z = []
for a in range(100, 999):
    for b in range(100,999):
        if isPalindrome(a*b):
            z = z+[a*b]
print max(z)
