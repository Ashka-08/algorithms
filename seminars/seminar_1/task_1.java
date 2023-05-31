package seminars.seminar_1;

/* Написать алгоритм, считывающий сумму всех чисел от 1 до N. 
Согласно свойствам линейной сложности, 
количество итераций цикла будет линейно изменяться относительно изменения размера N */

public class task_1 {
    public static void main(String[] args) {
        int number = 12;
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum+=i;
        }
        System.out.println("sum with loop = " + sum);

        sum = (number * (number + 1) / 2);
        System.out.println("sum with math = " + sum);
    }
}
