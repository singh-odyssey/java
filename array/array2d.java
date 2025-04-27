
//creating a 2d array in java and taking user input and printing them all
import java.util.*;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of the matrix -> ");
        int row = sc.nextInt();
        System.out.print("Enter the number of coloumn of the matrix -> ");
        int coloumn = sc.nextInt();

        int[][] array = new int[row][coloumn];

        System.out.println("Enter the Elements of matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                    array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix is ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(" " +array[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
