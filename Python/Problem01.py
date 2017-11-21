x=int(raw_input("Enter a number : "))
a = sum({y for y in range(x) if ((y%3==0)or(y%5==0))})
print a
