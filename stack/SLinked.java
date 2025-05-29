// Using Java Collection Framwork .
// implementing using LinkedList .
package stack;
import java.util.*;

public class SLinked {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(0);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}