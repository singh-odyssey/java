// find all subset of n natural number .
package advance_recursion;
import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int n = 3; 
        List<Integer> subset = new ArrayList<>();
        findSubsets(n, 1, subset);
    }

    static void findSubsets(int n, int current, List<Integer> subset) {
        if (current > n) {
            System.out.println(subset);
            return;
        }
        subset.add(current);
        findSubsets(n, current + 1, subset);
        subset.remove(subset.size() - 1);
        findSubsets(n, current + 1, subset);
    }
}