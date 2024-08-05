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

    /**
     * Поиск наибольшего элемента массива рекурсией
     */
    public static int findMax(int[] array) {
        if (array.length == 2) {
            if (array[0] > array[1]) {
                return array[0];
            } else {
                return array[1];
            }
        }
        int sub_max = findMax(Arrays.copyOfRange(array, 1, array.length));
        if (array[0] > sub_max) {
            return array[0];
        } else {
            return sub_max;
        }
    }

    /**
     * Быстрая сортировка рекурсией
     */
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);

            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 8, 6, 4, 3, 9, 2, 7};
        System.out.println("Сумма элементов массива = " + sum(array));
        System.out.println("Количество элементов массива = " + sumCount(array));
        System.out.println("Наибольший элемент массива = " + findMax(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Сортированный массив: " + Arrays.toString(array));
    }
}
