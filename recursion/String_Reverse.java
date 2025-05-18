// reverse a string using recursion
package recursion;

public class String_Reverse {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.print("String before reversing - >" + str);
        System.out.println();
        System.out.print("String after reversing - >");
        int idx = str.length() - 1;
        reverse(str, idx);
        System.out.println();
    }

    public static void reverse(String str, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }
}