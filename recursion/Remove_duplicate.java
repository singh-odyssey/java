// remove repeating lettter from a string .
package recursion;

public class Remove_duplicate {
    public static void main(String[] args) {
        String str = "hoasdlaaalsaa";
        StringBuilder strb = new StringBuilder();
        int idx = 0;
        Repeat(str, strb, idx);
    }

    public static void Repeat(String str, StringBuilder strb, int idx) {
        if (idx == str.length()) {
            System.out.println(strb);
            return;
        }
        char currChar = str.charAt(idx);
        boolean found = false;
        for (int i = 0; i < strb.length(); i++) {
            if (strb.charAt(i) == currChar) {
                found = true;
                break;
            }
        }
        if (!found) {
            strb.append(currChar);
        }
        Repeat(str, strb, idx + 1);
    }
}