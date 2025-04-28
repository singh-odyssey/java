package constructor;
// creating A class with a parameterized constructor

class Student {
    String name;
    int rollNo;
    String grade;

    Student (String name , int rollNo , String grade){
         this.name=name;
         this.rollNo=rollNo;
         this.grade=grade;
    }
    void printInfo(){
        System.out.println("Name   -> "+name);
        System.out.println("rollNo -> "+rollNo);
        System.out.println("grade  -> "+grade);
    }
}


public class ParameterizedConstr{
    public static void main (String[] args ){
        Student s1=new Student("Aditya", 1, "A+");
        Student s2=new Student("Singh", 2, "A+");
        s1.printInfo();
        s2.printInfo();
    }
}