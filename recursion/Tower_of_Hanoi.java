// code for tower of hanoi 

package recursion;

public class Tower_of_Hanoi {
    public static void tower(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transferring disk " + n + " from " + source + " to " + destination);
            return;
        }
        tower(n - 1, source, destination, helper);
        System.out.println("Transferring disk " + n + " from " + source + " to " + destination);
        tower(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 64; 
        tower(n, "S", "H", "D");
    }
}