package lessons.lesson_2;

// Алгоритм сортировки массивов пузырьком

public class task_2 {
    public static void main(String[] args) {
        int[] array = new int[] {
            9, 6, 2, 1, 3, 7, 8, 4, 5, 0
        };
        directSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void directSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minPosition = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }
}