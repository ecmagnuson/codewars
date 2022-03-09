"""
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
 """

string = 'This website is for losers LOL!'


""" def remove_vowels(s: str) -> str:
    vowels = 'aeiou'
    s = s.lower()
    for letter in vowels:
        if letter in s:
            s = s.replace(letter,"")
    return s """


def remove_vow(string):
    return ''.join([letter for letter in string.lower() if letter not in 'aeiou'])

""" print(remove_vowels(string)) """
print(remove_vow(string))