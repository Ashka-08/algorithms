package seminars.seminar_1;
 /*
  * Пишем алгоритм поиска нужного числа последовательности Фибоначчи, 
  но в этот раз откажемся от рекурсии и воспользуемся обычным алгоритмом, 
  что даст нам линейную сложность, т.к. вычисление каждого из чисел 
  последовательности будет происходить ровно 1 раз. 
  */
public class task_5 {
    public static void main(String[] args) {
        System.out.println("fb(10) = " + fb(10));
    }

    /**
     * @apiNote Фибоначи без рекурсии (линейная сложность)
     */
    public static int fb(int num) {
        if (num <= 2) {
            return 1;
        } else {
            final int[] numbers = new int[num];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            return numbers[num - 1];
        }
    }
}
