def bubbleSort(arr):
    for i in range(0, len(arr)-1):
        for j in range(1, len(arr)-1):
            if(arr[j-1] > arr[j]):
                temp = arr[j-1]
                arr[j - 1] = arr[j]
                arr[j] = temp
    return arr



arr = [4,5,7,2,4,7,1,9,7]
print("Array before getting sorted: ")
print(arr)

print("Array after getting sorted: ")
print(bubbleSort(arr))
