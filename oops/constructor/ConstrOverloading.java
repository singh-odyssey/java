// having more than 1 constructor than it is called constrOverloading 
package constructor;

class Student {
    String name;
    int age;
    String grade;

    Student(){
        this.name="Unknown";
        this.age=0;
        this.grade="Not Assigned";
    }
    Student(String name){
        this.name=name;
        this.age=0;
        this.grade="Not Assigned";
    }
    Student(String name, int age ,String grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
     public void printDetail(){
         System.out.println("Name -> "+name);
         System.out.println("Age -> "+age);
         System.out.println("Grade -> "+grade);
       }
    }

public class ConstrOverloading {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Aditya");
        Student s3=new Student("Aditya",21,"A+");
        s1.printDetail();
        System.out.println();
        s2.printDetail();
        System.out.println();
        s3.printDetail();
        System.out.println();
    }
}