// calculate the total number of path from point i,j to n,m in a matrix .
package advance_recursion;

public class Path_Calculate {

    public static int path(int i, int j, int n, int m) {
        if (i > n || j > m) {
            return 0;
        }
        if (i == n && j == m) {
            return 1;
        }
        int downCount = path(i + 1, j, n, m);
        int rightCount = path(i, j + 1, n, m);
        int totalCount = downCount + rightCount;

        return totalCount;
    }

    public static void main(String[] args) {
        int totalPath = path(0, 0, 2, 2);
        System.out.println(totalPath);
    }
}
