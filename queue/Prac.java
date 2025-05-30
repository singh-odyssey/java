// implementing quueue using framework
package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Prac {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("front -> " + queue.peek());
        System.out.println("rear -> " + ((ArrayDeque<Integer>) queue).peekLast());
    }
}