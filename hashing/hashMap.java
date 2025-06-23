// implementing hash map 
package hashing;

import java.util.HashMap;
import java.util.Iterator;

public class hashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // insert
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map);

        // search
        if (map.containsKey("A")) {
            System.out.println("Key Exists");
        } else {
            System.out.println("Key doesn't exist");
        }

        //iterating 
        //method 1
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        //method 2
        for (Iterator<String> it = map.keySet().iterator(); it.hasNext(); ) {
            String key = it.next();
            System.out.println(key + " => " + map.get(key));
        }
        // method 3: using entrySet (most efficient )
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}