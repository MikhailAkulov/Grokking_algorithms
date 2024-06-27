package introduction_to_algorithms;

public class ExampleSort {

    public static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallest(array);
            newArray[smallest] = i + 1;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
