""" Your goal in this kata is to implement a difference function, 
which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.

array_diff([1,2],[1]) == [2]

If a value is present in b, all of its occurrences must be removed from the other:
array_diff([1,2,2,2,3],[2]) == [1,3]
 """

def array_diff(a, b):
    return [item for item in a if not item in b]


#equivalent to
def array_sub(a,b):
    c = []
    for item in a:
        if not item in b:
            c.append(item)
    return c

lst1 = [1,2]
lst2 = [1]

print(array_diff(lst1,lst2))

print(array_sub(lst1, lst2))