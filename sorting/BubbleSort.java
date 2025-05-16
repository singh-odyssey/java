package sorting;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter some numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Your array is -> ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // sorting logic
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("Your array after sorting  is -> ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}