// find all permutations of a string
package advance_recursion;

public class Permutation_String {
    public static void main(String[] args) {
        String str = "abc";
        printperm(str, "");

    }

    public static void printperm(String str, String permutation) {
        if (str.length()==0) {
            System.out.println(permutation);
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printperm(newStr, permutation + currChar);
        }
    }
}