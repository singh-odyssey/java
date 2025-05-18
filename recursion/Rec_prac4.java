// code for finding factorial

package recursion;

import java.util.*;

public class Rec_prac4 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - > ");
        int n = sc.nextInt();
        int product = factorial(n);
        sc.close();
        System.out.println(product);
    }
}
