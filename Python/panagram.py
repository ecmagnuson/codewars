""" A pangram is a sentence that contains every single letter of the alphabet at least once.
 For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
  because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram.
Return True if it is, False if not. Ignore numbers and punctuation.
 """

import string

def is_pangram(s):
    s = s.lower()
    alphabet = list(string.ascii_lowercase)
    for letter in s:
        if letter in alphabet:
            alphabet.remove(letter)
    if not alphabet:
        return True
    return False

s = 'The quick brown fox jumps over the lazy dog'
print(is_pangram(s))
