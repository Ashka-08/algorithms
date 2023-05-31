package seminars.seminar_1;

/*
 * Необходимо написать алгоритм поиска всех доступных комбинаций (посчитать количество) 
 * для 4 кубиков с количеством граней N. 
 * Данное решение имеет сложность O(n4), но если количество кубиков сделать переменной, 
 * то она трансформируется в O(nk), что будет представлять собой экспоненциальную 
 * сложность.
*/

public class task_3 {
    public static void main(String[] args) {
        System.out.println("countCube() = " + countCube(6));
        System.out.println("combinationCount() = " + combinationCount(4, 6));
    }

    /**
     * @apiNote Вариант с 4 кубами
     */
    private static int countCube(int k) {
        int result = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < k; l++) {
                    for (int m = 0; m < k; m++) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    /**
     * @apiNote Сложный вариант - количество кубиков задается условием count
     */
    public static int combinationCount(int count, int faces) {
        if (count > 0) {
            return recursiveCounter(1, count, faces);
        } else {
            return 0;
        }
    }

    private static int recursiveCounter(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }
}
