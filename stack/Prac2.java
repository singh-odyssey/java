// reversing a stack .
package stack;

import java.util.Stack;

public class Prac2 {

    public static void addAtBottom(Stack<Integer> stack, int value) {
        if (stack.empty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        addAtBottom(stack, value);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        addAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < 5) {
            stack.push(i);
            i++;
        }
        System.out.println("Before reversing -> " + stack);
        reverse(stack);
        System.out.println("After reversing -> " + stack);
    }
}