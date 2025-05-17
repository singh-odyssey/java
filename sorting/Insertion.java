package sorting;

public class Insertion {

    public static void main(String[] args) {
        int[] array={123,1245,54756,32,123};

        System.out.print("Unsorted array -> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
           System.out.println();
           // insertion sorting logic 
           
           for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.print("sorted array -> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
