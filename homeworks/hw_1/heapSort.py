def heapify(arr, size, root):
    largest = root
    lChild = 2*root + 1
    rChild = 2*root + 2
    if lChild < size and arr[lChild] > arr[largest]:
        largest = lChild
    if rChild < size and arr[rChild] > arr[largest]:
        largest = rChild
    if largest != root:
        arr[root], arr[largest] = arr[largest], arr[root]
        heapify(arr, size, largest)

def heapSort(arr):
    size = len(arr)
    for i in range(size, -1, -1):
        heapify(arr, size, i)
    for i in range(size-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i] # свап 
        heapify(arr, i, 0)

arr = [12, 11, 13, 5, 6, 7]
heapSort(arr)
print(arr)
# for i in range(len(arr)):
#     print ("%d" %arr[i]),