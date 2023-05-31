package lessons.lesson_2;

// Алгоритм сортировки массивов пузырьком

public class task_1 {
    public static void main(String[] args) {
        int[] array = new int[] {
            9, 6, 2, 1, 3, 7, 8, 4, 5, 0
        };
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }
}