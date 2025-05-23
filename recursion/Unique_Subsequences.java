package recursion;

import java.util.HashSet;

public class Unique_Subsequences {
    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        printSubsequences(str, 0, "", set);
    }

    public static void printSubsequences(String str, int idx, String curr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(curr)) {
                return;
            } else {
                set.add(curr);
                System.out.println(curr);
                return;
            }
        }
        printSubsequences(str, idx + 1, curr + str.charAt(idx), set);
        printSubsequences(str, idx + 1, curr, set);
    }
}