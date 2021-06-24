arr = [1,5,2,7,5,8,2,5,8]

print("Array before getting sorted: ")
print(arr)




def bubble_sort(arr):
    swap = False
    while not swap:
        swap = True
        for i in range(1,len(arr)):
            if(arr[i-1] > arr[i]):
                swap = False
                temp = arr[i-1]
                arr[i-1] = arr [i]
                arr[i] = temp
    return arr



print("Array after sorted: ")
print(bubble_sort(arr))
