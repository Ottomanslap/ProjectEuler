import math

def isPrime(n):
    for i in range(3, int(math.floor(math.sqrt(n)+1)), 2):
        if (n % i == 0):
            return False
    return True

a = [ x for x in xrange(3,int(math.sqrt(600851475143)+1)) if (isPrime(x) and 600851475143 % x == 0)]
print a[-1]
