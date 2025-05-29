// stack implementation using Java Collection framework .
// using ArrayList
package stack;

import java.util.*;

public class SArray {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        int i = 0;
        while (i <= 5) {
            s.add(i);
            i++;
        }
        System.out.println(s);
        s.remove(s.size()-1);
        System.out.println(s);
        System.out.println(s.get(s.size()-1)); 
    }
}