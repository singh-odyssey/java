// checking number is odd or even


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number ->");
        int num =scan.nextInt();
        scan.close();
        if (num%2==0) {
            System.out.println(num+" "+"is an EVEN number");
        }
        else{
            System.out.println(num+" "+"is an ODD number");
        }
    }

}