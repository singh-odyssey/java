// Reversing a user input string

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Use try-with-resources to auto-close Scanner
            System.out.print("Enter your String -> ");
            String str = sc.nextLine();
            System.out.println("Your String is -> " + str);

            // Use StringBuilder for efficient string reversal
            StringBuilder sb = new StringBuilder(str);
            String reversedStr = sb.reverse().toString();
           
            System.out.println("Reversed String is -> " + reversedStr);
        }
    }
}