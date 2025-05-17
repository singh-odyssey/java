package sorting;

public class Selection {

    public static void main(String[] args) {
        int[] array = { 1231, 21, 31, 214, 5 };

        System.out.print("Unsorted array -> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // selection sort logic

        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.print("\nSorted array -> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}