// overriding Polymorphism
package polymorphism;

class Animal {
        void makeSound(){
            System.out.println("Some generic animal sounds ");
        }
}

class Dog extends Animal {
    @Override
    void makeSound(){
    System.out.println("Barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound(){
    System.out.println("Meow");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        Animal myCat = new Cat();

        myDog.makeSound(); 
        myCat.makeSound(); 
    }   
}