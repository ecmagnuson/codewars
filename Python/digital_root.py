""" Given n, take the sum of the digits of n. 
If that value has more than one digit, continue reducing in this
way until a single-digit number is produced. 
The input will be a non-negative integer. 
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
"""

""" Cant iterate over an int but can a str """

#works
def digital_root(n: str) -> str:
    n = str(n)
    if not len(n) == 1:
        n = digital_root(sum([int(num) for num in n]))
    return n
print(digital_root('493193'))

#doesnt work
def root(n: str) -> str:
    n = str(n)
    if not len(n) == 1:
        n = sum([int(num) for num in n])
        root(n)
    return n
print(root('493193'))