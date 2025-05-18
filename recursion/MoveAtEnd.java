// move all x at the end of string 
package recursion;

public class MoveAtEnd {
    public static void main(String[] args) {
        String str ="aaaxasxaxsasxaxa";
        int idx =0;
        StringBuilder strb = new StringBuilder();
        StringBuilder strbx = new StringBuilder();
        move(str, idx , strb ,strbx);
    }
    public static void move(String str , int idx , StringBuilder strb, StringBuilder strbx) {
        if (str.charAt(idx) == 'x') {
            strbx.append(str.charAt(idx));
        }
        if (str.charAt(idx)!='x') {
            strb.append(str.charAt(idx));
        }
        if (idx==str.length()-1) {
            System.out.println(strb.toString() + strbx.toString());
            return;
        }
        move(str, idx+1, strb, strbx);        
    }
}
