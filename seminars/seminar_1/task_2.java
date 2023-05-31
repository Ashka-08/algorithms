package seminars.seminar_1;

/* 
 * Написать алгоритм поиска простых чисел (делятся только на себя и на 1) 
 * в диапазоне от 1 до N. В алгоритме будет использоваться вложенный for, 
 * что явно говорит о квадратичной сложности
*/

public class task_2 {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <= number; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                } 
            }
            if (simple) {
                System.out.print(i + " ");
            }
        }
    }
}
