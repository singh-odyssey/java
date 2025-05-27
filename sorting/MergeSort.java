package sorting;

public class MergeSort {

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(array, low, mid);
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        // If the left subarray has leftover elements
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // If the right subarray has leftover elements
        while (j <= high) {
            temp[k++] = array[j++];
        }

        for (int index = 0; index < temp.length; index++) {
            array[low + index] = temp[index];
        }

    }

    public static void main(String[] args) {
        int[] array = { 21, 342, 123, 43, 2 };
        int low = 0, high = array.length - 1;
        sort(array, low, high);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}