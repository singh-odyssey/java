// no . of ways to place tile of size 1xm into n x m floor size
package advance_recursion;

public class Place_Tiles {

    public static int place(int n, int m) {
        if (m == 1)
            return 1;
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int placeVert = place(n - m, m);
        int placeHoriz = place(n - 1, m);

        return placeVert + placeHoriz;
    }

    public static void main(String[] args) {
        System.out.println(place(5, 5));
    }
}
