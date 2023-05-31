package lessons.lesson_2;

// Алгоритм поиска в неотсортированный массиве (перебор)

public class task_4 {
    public static void main(String[] args) {
        int[] array = new int[] {
            9, 6, 2, 1, 3, 7, 8, 4, 5, 0
        };
        System.out.println(find(array, 5));
        System.out.println(find(array, 10));
    }
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
