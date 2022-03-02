""" Check to see if a string has the same amount of 'x's and 'o's. 
The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
 """

#There is a much more elegant way to do this
def xo(s):
    x,o = 0,0
    for letter in s:
        if letter.lower() == 'x': 
            x+=1
        if letter.lower() == 'o':
            o+=1
    if x == o:
        return True
    return False
print(xo('Xxoo'))

#answers found:https://www.codewars.com/kata/55908aad6620c066bc00002a/solutions/python
#yes
def xo(s):
    s = s.lower()
    return s.count('x') == s.count('o')

#Also 
def xo(s):
    return s.lower().count('x') == s.lower().count('o')

#Always a way to do things elegantly in Python!