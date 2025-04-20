// CREATING A HOLLOW RECTANGLE BASED ON USER INPUR DIMENSIONS .

import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        int length, Breadth;

        System.out.println("Enter the length of rectangle");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        System.out.println("Enter the Breadth of rectangle");
        Breadth = sc.nextInt();
        sc.close();

        for (int i = 0; i < Breadth; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == Breadth - 1) {
                    System.out.print("\t*");
                } else {
                    if (j == 0 || j == length - 1) {
                        System.out.print("\t*");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}