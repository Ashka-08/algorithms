package lessons.lesson_2;

// Алгоритм сортировки массивов вставками

public class task_3 {
    public static void main(String[] args) {
        int[] array = new int[] {
            9, 6, 2, 1, 3, 7, 8, 4, 5, 0
        };
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void insertSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
        }
    }
}