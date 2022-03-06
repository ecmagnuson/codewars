def is_free(is_free: bool):
    return True if is_free else False

def hangout(is_free, activity):
    if is_free(is_free) is False:
        return "We no hangout :("

        
print(hangout(True, 'sd'))

