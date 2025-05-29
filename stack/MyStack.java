// using Java Collection Framework Stack
package stack;

import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.pop();
        System.out.println(stack);
    }
}