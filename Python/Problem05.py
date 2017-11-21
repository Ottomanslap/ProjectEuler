import math

a = 20
for b in range (19,1,-1):
    if a % b != 0:
        d = a
        c = 2
        while c in range (2, b):
            if (d % c == 0 and b % c == 0):
                d = d/c; b = b/c
            else:
                c += 1
        a = a * b
print a

