from random import randint

def createArray():
    # arr = []
    # for i in range(100):
    #     i = randint(0, 10)
    #     arr.append(i)
    arr = [randint(0, 10) for i in range(100)]
    return arr

def binarySearch(value, arr, min, max):
    if max < min:
        return -1
    else: pivot = (max - min) // 2 + min

    if arr[pivot] < value:
        return binarySearch(value, arr, pivot+1, max)
    elif arr[pivot] > value:
        return binarySearch(value, arr, min, pivot-1)
    else: 
        return pivot

# arr = [9, 7, 4, 6, 1, 3, 5]
arr = sorted(createArray())
print(f"binarySearch index 5: {binarySearch(5, arr, 0, len(arr)) + 1}")