""" Your task is to make a function that can take any non-negative integer as an argument 
and return it with its digits in descending order. Essentially, rearrange the digits to create 
the highest possible number. 
Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321
"""
#initial
def descending_order(num: int) -> int:
    return int(''.join(sorted([number for number in str(num)], reverse = True)))

#no reason to use comprehension as sorted already puts in list
def descending(num: int) -> int:
    return int(''.join(sorted(str(num), reverse = True)))

def desc(num):
    num = str(num)
    return int(num[::-1])

print(desc(123456789))