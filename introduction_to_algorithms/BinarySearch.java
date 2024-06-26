package introduction_to_algorithms;

public class BinarySearch {

    public static int binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length-1;
        int fail = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return fail;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(array, -5));
    }
}
