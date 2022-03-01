import string

nums = [num for num in range(1, 27)]
alphabet = [letter for letter in string.ascii_lowercase]
alphabet_nums_dict = dict(zip(nums, alphabet))

text = "The sunset sets at twelve o' clock."
position_str = ''

for letter in text:
    for k, v in alphabet_nums_dict.items():
        if v == letter.lower():
            position_str += ' ' + str(k)

print(position_str)
