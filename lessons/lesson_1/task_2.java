import java.util.ArrayList;
import java.util.List;

// Алгоритм поиска простых чисел

public class task_2 {
    public static void main(String[] args) {
        List<Integer> availableDivier = findSimpleNumbers(10);
        for (Integer integer : availableDivier) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findSimpleNumbers(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                } 
            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println("Counter = " + counter);
        return result;
    }
}
