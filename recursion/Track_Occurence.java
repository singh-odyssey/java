// find when an element is found first time and last time in a string 
package recursion;

public class Track_Occurence {
    static int loc = -1;
    static int loclast = -1;

    public static void main(String[] args) {
        String str = "asdsnswenfaesfj";
        int first = 0, last = str.length() - 1;
        String key = "s";
        found(key, str, first, last);
        System.out.println("First occurence of " + key + " is -> " + loc);
        System.out.println("last occurence of " + key + " is -> " + loclast);
    }

    public static void found(String key, String str, int f, int l) {
        if (f > l) {
            return;
        }
        if (loc == -1 && key.equals(String.valueOf(str.charAt(f)))) {
            loc = f;
        }
        if (loclast == -1 && key.equals(String.valueOf(str.charAt(l)))) {
            loclast = l;
        }
        if (f > l && loc == -1 && loclast == -1) {
            System.out.println("Element not found in the string.");
            return;
        }
        found(key, str, f + 1, l - 1);
    }
}