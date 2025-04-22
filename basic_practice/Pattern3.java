// CREATING HALF PYRAMID .
import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the Height of half Pyramid");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        sc.close();
        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}