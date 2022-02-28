def remove_vow(string):
    vowels = 'aeiou'
    return ''.join([letter for letter in string.lower() if letter not in vowels])