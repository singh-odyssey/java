
// CREATING 180 DEGREE ROTATED PYRAMID PATTERN
import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        int x;
        System.out.print("Enter the height of pyramid -> ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
