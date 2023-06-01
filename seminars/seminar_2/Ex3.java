package seminars.seminar_2;

import java.util.Date;
// сравнение скорости сортировок пузырьком и быстрой
public class Ex3 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            Date startDate = new Date();
            Ex1.bubleSort(array.clone()); // клон, чтобы не брался из хэша
            Date endDate = new Date();
            long bubbleSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            Ex2.quickSort(array.clone(), 0, array.length - 1);
            // клон, чтобы не брался из хэша
            endDate = new Date();
            long quickSortDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, bubble sort duration: %s, quick sort duration: %s%n", i, bubbleSortDuration,
                    quickSortDuration);
                    
        }
    }
}
