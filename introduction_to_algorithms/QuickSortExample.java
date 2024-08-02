package introduction_to_algorithms;

import java.util.Arrays;

public class QuickSortExample {

    /**
     * Расчёт суммы всех элементов массива
     */
    public static int sum(int[] array) {
        // циклом
//        int total = 0;
//        for (int i = 0; i <= array.length; i++) {
//            total += i;
//        }
//        return total;

        // рекурсией
        if (array.length == 0) {
            return 0;
        } else {
            return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    /**
     * Расчёт количества всех элементов массива
     */
    public static int sumCount(int[] array) {
        // циклом
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            count++;
//        }
//        return count;

        // рекурсией
        if (array.length == 0) {
            return 0;
        } else {
            return 1 + sumCount(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Сумма элементов массива = " + sum(array));
        System.out.println("Количество элементов массива = " + sumCount(array));
    }
}
