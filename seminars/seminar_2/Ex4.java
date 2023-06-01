package seminars.seminar_2;
// бинарный поиск
public class Ex4 {
    public static void main(String[] args) {
        // массив размером 100, рандом элементов от 0 до 10
        int[] array = new int[100];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 10);
        }
        System.out.println("binarySearch(5, array, 0, array.length) = " + binarySearch(5, array, 0, array.length));

    }

    public static int binarySearch(int value, int[] array, int min, int max) {
        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) {
            return binarySearch(value, array, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(value, array, min, midpoint - 1);
            } else {
                return midpoint;
            }
        }
    }
}
