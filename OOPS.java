class Pen{
    //blueprint of pen (Whole)
    //properties of class/pen
    String color;
    String type;
    //funcn which pen performs
    //funcn in class are called methods
    public void write(){
        System.out.println("Writes some!");
    }
    public void printColor(){
        System.out.println(this.color);
    }//this is a keyword in java
    //prints color of oblect calling this tells that which fncn is calling
    //tells that which object is tryin' to access that funcn
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Constructor non parametrised
    // Student(){
    //     System.out.println("I am constr and I was also called ");
    // }
    // constructor parametrised
    // Student(String name, int age ){
    //     this.name=name;
    //     this.age=age;


    // }
    // copy constructor
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    Student(){

    }
    

    

}
public class OOPS {
    public static void main(String[] args){
       //oblect hai ye
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="gel";
        // pen1.write();
        Pen pen2=new Pen();
        pen2.color="Black";
        pen2.type="Ball point";
        // pen1.printColor();
        // pen2.printColor();
        //Student is a constructor
        //no return type
        // Student s1= new Student();
        //this one was for non parametrised constructor
        // Student s1=new Student("Shashank", 21);
        //this is for parametrised cpnstructor
        // s1.age=21;
        // s1.name="Shashank";
        //can also be done by using parametrized constructor
        // for copy constructor
        Student s1=new Student();
        //we created an empty constructor for it 
        s1.name="Shashank";
        s1.age=21;
        Student s2=new Student(s1);
        s2.printInfo();
    }
    
}

