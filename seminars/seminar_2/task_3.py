# сортировка выбором

def directSort(arr):
    for i in range(len(arr)-1):
        minPos = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[minPos]:
                minPos = j
        if (minPos != j):
            arr[minPos], arr[j] = arr[j], arr[minPos]
    return arr

array = [9, 7, 4, 6, 1, 3, 5]
print(directSort(array))