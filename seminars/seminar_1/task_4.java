package seminars.seminar_1;

/* Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
Считаем, что 1 и 2 значения последовательности равны 1. 
Искать будем по формуле On=On-1+On-2 что предполагает использовать 
рекурсивного алгоритма.   
*/
public class task_4 {
    public static void main(String[] args) {
        System.out.println("fb(10) = " + fb(10));
    }

    /**
     * @apiNote Фибоначи через рекурсию (экспоненциальная сложность)
     */
    public static int fb(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return fb(num - 1) + fb(num - 2);
        }
    }
}
