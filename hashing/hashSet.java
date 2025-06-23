// implementing a hash set in Java
package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Practice Questions:

        // 1. Write a program to add elements to a HashSet and print all elements.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        // 2. Check if a specific element exists in a HashSet.
        if (set.contains(1)) {
            System.out.println("Element 1 exists");
        } else {
            System.out.println("Element 1 does not exist ");
        }

        // 3. Remove an element from a HashSet and display the updated set.
        set.remove(1);
        System.out.println("Updated set -> " + set);

        // 4. Iterate through all elements in a HashSet using an iterator.
        Iterator<Integer> it = set.iterator();
        System.out.println("using iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 5. Find the size of a HashSet after adding and removing elements.
        System.out.println("size -> " + set.size());

        // 6. Write a program to clear all elements from a HashSet.
        set.clear();
        System.out.println("removed all elements -> " + set);

        // 7. Given two HashSets, find their intersection (common elements).
        // creating a second hashset
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        set2.retainAll(set);
        System.out.println("Intersection -> " + set2);// output -> null bcz set is empty (first set)

        // 8. Given two HashSets, find their union (all unique elements).
        HashSet<Integer> set3 = new HashSet<>();
        set3.addAll(set);
        set3.addAll(set2);
        System.out.println("Union -> " + set3);

        // 9. Check if a HashSet is empty.
        if (set.isEmpty()) {
            System.out.println("set is empty ");
        }

        // 10. Convert a HashSet to an array or a list.
        set.toArray();
        System.out.println("converted into array -> " + set);

        // 11. Add duplicate elements to a HashSet and observe the result.
        set.add(1);
        set.add(1);
        System.out.println(set);

        // 12. Store null values in a HashSet and check its behavior.
        set.add(null);
        set.add(2);
        System.out.println(set);

        // 13. Write a program to clone a HashSet.
        @SuppressWarnings("unchecked") // this is used bcz without this below line was giving warning related to unchecked 
        HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();
        System.out.println("cloned set -> "+clonedSet);

        // 14. Compare two HashSets for equality.
        if(set.equals(set2)){
            System.out.println("set is equal to set2 ");
        }else{
            System.out.println("Not equal");
        }

        // 15. Write a program to find the difference between two HashSets.
        HashSet<Integer> difference = new HashSet<>(set);
        difference.removeAll(set2);
        System.out.println("Difference between set and set2 -> " + difference);
    }
}