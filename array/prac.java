// taking input from user storing it in array and then searching for a number if
// number is present in the array then print its index .

import java.util.*;

public class prac {
    public static void main(String[] args) {
        int size; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array ->");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Elements of array ->");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("your array is ->");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        // now searching number within array 
        int key;
        System.out.print("Enter any number to search -> ");
        key=sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (key == array[i]) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}