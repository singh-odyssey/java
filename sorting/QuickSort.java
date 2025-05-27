package sorting;

public class QuickSort {

    public static int partition(int[] array, int low, int high) {
        int i = low - 1;
        int temp;
        int pivot = array[high];
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int part = partition(array, low, high);
            sort(array, low, part - 1);
            sort(array, part + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = { 231, 34214, 2, 121, 1 };
        int low = 0;
        int high = array.length - 1;
        sort(array, low, high);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}