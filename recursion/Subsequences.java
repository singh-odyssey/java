package recursion;

public class Subsequences {
    public static void main(String[] args) {
        String str = "abcdasdasdsgsdfgsdgsdgsdffgsdfdffg";
        printSubsequences(str, 0, "");
    }

    public static void printSubsequences(String str, int idx, String curr) {
        if (idx == str.length()) {
            System.out.println(curr);
            return;
        }
        printSubsequences(str, idx + 1, curr + str.charAt(idx));
        printSubsequences(str, idx + 1, curr);
    }
}
