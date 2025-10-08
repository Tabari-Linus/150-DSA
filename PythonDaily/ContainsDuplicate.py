def hasDuplicate(numbers: list[int]) -> bool:
    numberSeen = []
    for item in numbers:
        if(item in numberSeen):
            return True
        else:
            numberSeen.append(item)

    return False

print(hasDuplicate([1,2,4,5,3]))
