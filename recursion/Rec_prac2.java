// print numbers from 1 to n using recursion

package recursion;

public class Rec_prac2 {
    public static void printRec(int n, int x) {
        if (x == n+1) {
            return;
        }
        System.out.print(x + " ");
        printRec(n, x + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int x = 1;
        printRec(n, x);
        System.out.println();
    }
}