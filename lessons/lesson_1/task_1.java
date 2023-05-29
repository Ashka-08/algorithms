import java.util.ArrayList;
import java.util.List;

// Алгоритм поиска допустимых делителей

public class task_1 {

    public static void main(String[] args) {
        List<Integer> availableDivier = findAvailableDivider(10);
        for (Integer integer : availableDivier) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findAvailableDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            counter++;
            if (number % i == 0) {
                result.add(i);
            }
        }
        System.out.println("Counter = " + counter);
        return result;
    }
}