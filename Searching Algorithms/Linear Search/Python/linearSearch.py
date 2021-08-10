def linearSearch(numbers, target):
    for i in range(0, len(numbers)):
        if numbers[i] == target:
            return i
    return -1

numbers = [ 3,6,2,8,0,7,5 ]

index = linearSearch(numbers,0)
print(index)
    
