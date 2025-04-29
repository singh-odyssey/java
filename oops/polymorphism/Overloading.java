//code for overloading polymorphism
package polymorphism;

class Calculator {
    Calculator(){

    }
    
    void add (int x, int y){
        System.out.println("sum is -> "+ (x+y));
    }
    void add (double x, double y){
        System.out.println("sum is -> "+ (x+y));
    }
    void add (int x, double y){
        System.out.println("sum is -> "+ (x+y));
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator c1= new Calculator();
        c1.add(1, 2);          
        c1.add(1.5, 2.5);     
        c1.add(1, 2.5);
    }
}
