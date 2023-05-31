package seminars.seminar_2;
// алгоритм сортировки пузурьком

import java.util.Random;

public class task_1 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] unsorted = randomArray(20, 10, 100);
        printArray(unsorted);
        printArray(bubbleSort(unsorted));
    }

    public static int[] randomArray(int size, int smallest, int largest) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(smallest, largest);
        }
        return result;
    }

    public static int[] bubbleSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length-1; i++) {
            for (int j = 0; j < unsorted.length-1-i; j++) {
                if (unsorted[j]> unsorted[j+1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j+1];
                    unsorted[j+1] = temp;
                }
            }
        }
        return unsorted;
    }

    public static void printArray(int[] unsorted) {
        for (int i : unsorted) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
