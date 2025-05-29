// add a number at the bottom of a stack using framework .
// we  will use recursion for it .

package stack;

import java.util.Stack;

public class Prac {
    public static void addAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        addAtBottom(stack, value);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        int value = 100;
        addAtBottom(stack, value);
        System.out.println(stack);
    }
}