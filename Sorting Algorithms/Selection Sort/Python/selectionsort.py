def selectionSort(arr):
    for i in range(0, len(arr)):
        minIndex = i;
        for j in range(i, len(arr)):
            if(arr[j] < arr[minIndex]):
                minIndex = j
            temp = arr[minIndex]
            arr[minIndex] = arr[i]
            arr[i] = temp
    return arr

arr = [4,5,7,2,4,7,1,9,7]
print("Array before getting sorted: ")
print(arr)

print("Array after getting sorted: ")
print(selectionSort(arr))
