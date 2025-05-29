// Reversing a list with out third var using java collection framework 
package linkedList.singular;

import java.util.LinkedList;
import java.util.Collections;

public class RevList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}