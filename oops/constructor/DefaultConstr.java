package constructor; // this is nothing but the directory name , helps in maintaining the code

//  creating class and objects , default constructor

class Car {
    String brand;
    String model;
    int year;

    void printDetails(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
    }
    //deafult constructor is automatically taken care by java compiler
}

public class DefaultConstr{
    public static void main(String[] args ) {
        Car c1=new Car();
        //this manually filling the details is done by default constructor
        c1.brand="lambo";
        c1.model="huracan"        ;
        c1.year=2025;
        c1.printDetails();
    }
}