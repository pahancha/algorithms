def insertionSort(arr):
    for i in range(1,len(arr)-1):
        current = arr[i]
        j = i - 1
        while (j >=0 and arr[j] > current):
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = current
    return arr
    

arr = [4,5,7,2,4,7,1,9,7]
print("Array before getting sorted: ")
print(arr)

print("Array after getting sorted: ")
print(insertionSort(arr))
