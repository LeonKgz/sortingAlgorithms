public class QuickSort {

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partitionLast(array, low, high);
            quicksort(array, low, pivot - 1);
            quicksort(array, pivot + 1, high);
        }
    }

    // Selects last element in the array as the pivot.
    private static int partitionLast(int[] array, int low, int high) {
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= array[high]) {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, high);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
