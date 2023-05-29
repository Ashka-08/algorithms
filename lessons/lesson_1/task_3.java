import java.util.concurrent.atomic.AtomicInteger;

public class task_3 {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        // atomicInt это мутабельный класс, т.е. меняется с помощью атомарных операций
        int fib = fib(10, counter);
        System.out.println("Fib = " + fib);
        System.out.println("Counter = " + counter.get());
        // метод .get выведет текущее значение
    }
    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet(); //Увеличивает на единицу текущее значение
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}
