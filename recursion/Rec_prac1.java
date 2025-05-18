// print numbers from n to 1 using recursion
package recursion;

import java.util.*;

public class Rec_prac1 {

    public static void printRec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        printRec(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number -> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRec(n);
        sc.close();
        System.out.println();
    }
}
