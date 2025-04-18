// PRINTING A 5X4 RECTANGULAR STAR PATTERN .


public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
//another way is simply print " * * * * * " 5 times . Every time in a new line 
//this will only use 1 for loop