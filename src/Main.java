public class Main {
    public static void main(String[] args) {
        int[] array = getAnArrayOfFixedSize(50, 100);
        printAFancyArray(array);
        QuickSort.quicksort(array, 0, array.length - 1);
        printAFancyArray(array);
    }

    private static int[] getAnArrayOfRandomSize(int randomSizeLimit, int randomValuesLimit){
        int size = (int) (Math.random() * randomSizeLimit);
        return getInts(size, randomValuesLimit);
    }

    private static int[] getAnArrayOfFixedSize(int size, int randomValuesLimit){
        return getInts(size, randomValuesLimit);
    }

    private static int[] getInts(int size, int randomValuesLimit) {
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            ret[i] = (int) (Math.random() * randomValuesLimit);
        }
        return ret;
    }

    private static void printAnArray(int[] array){
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void printAFancyArray(int[] array){
        for (int i : array) {
            printHorizontalColumn(i);
        }
        System.out.println();
    }

    private static void printHorizontalColumn(int i) {
        String s = "";
        for (int j = 0; j < i; j++) {
            s += "o";
        }
        System.out.println(s);
    }
}
