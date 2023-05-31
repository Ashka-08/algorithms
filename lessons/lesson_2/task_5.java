package lessons.lesson_2;

// Алгоритм поиска в отсортированном массиве (бинарный поиск)

public class task_5 {
    public static void main(String[] args) {
        int[] array = new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        System.out.println(binarySearch(array, 5));
        System.out.println(binarySearch(array, 0));
        System.out.println(binarySearch(array, 9));
        System.out.println(binarySearch(array, 55));
    }
    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length-1);
    }
    private static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;
        // поиск середины
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }

        if (array[midPoint] < value) {
            return binarySearch(array, value, midPoint+1, max);
        } else {
            if (array[midPoint] > value) {
                return binarySearch(array, value, min, midPoint-1);
            } else {
                return midPoint;
            }
        }
    }
}
