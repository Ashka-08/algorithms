# сортировка вставками

def insertSort(arr):
    for i in range(len(arr)-1):
        for j in range(i+1, len(arr)):
            if arr[j] < arr[i]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr

array = [9, 7, 4, 6, 1, 3, 5]
print(insertSort(array))