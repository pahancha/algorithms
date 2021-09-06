#binary search algorithm through recurssion

def binarySearch(array, target, left_index, right_index):
    middle_index = (left_index + right_index)//2
    if target == array[middle_index]:
        return middle_index

    if right_index < left_index:
        return -1

    if target < array[middle_index]:
        right_index = middle_index - 1
        return binarySearch(array, target, left_index, right_index)

    if target > array[middle_index]:
        left_index = middle_index + 1
        return binarySearch(array, target, left_index, right_index)


numbers = [1,3,5,7,8,9,12,34,35,57,78]
left_index = 0
right_index = len(numbers) - 1
target = int(input("Enter the target value: "))
index = binarySearch(numbers,target,left_index,right_index)
if index == -1:
    print("The target value is not in the list.")
else:
    print("The index of the target value is ", index, " .")
