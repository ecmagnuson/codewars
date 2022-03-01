""" Given n, take the sum of the digits of n. 
If that value has more than one digit, continue reducing in this
way until a single-digit number is produced. 
The input will be a non-negative integer. 
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
"""

""" Cant iterate over an int but can a str """


def digital_root(n: int) -> str:
    n = str(n)
    if not len(n) == 1:
        n = sum([int(num) for num in n])
        digital_root(n)
    return n

print(digital_root(493193))

