
// INVERTED HALF PYRAMID .
import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the depth of Inverted Pyramid");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();
        for (int i = x; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}