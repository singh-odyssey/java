// find sum of first n natural numbers
package recursion;

import java.util.*;

public class Rec_prac3 {

    public static int printRec(int n){
        if (n==0) {
            return 0;
        }
        return n + printRec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number - >");
        int n = sc.nextInt();
        int sum = printRec(n);
        System.out.println("Your sum is - > "+sum);
        sc.close();
    }
}
