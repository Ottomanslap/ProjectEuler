one = 1
two = 1
thr = 0
a = 0
while ((one <= 4000000) and (two <= 4000000)):
    thr = one
    one = two + thr
    two = thr
    if (two % 2 == 0):
        a += two
print a
