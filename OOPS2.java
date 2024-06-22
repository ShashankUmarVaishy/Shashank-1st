class Student{
    String name;
    int age;
    //this is called polymorphism
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+"'s age is "+age);
       
    }
}
public class OOPS2 {
    public static void main(String[] args){

        Student s1=new Student();
        s1.name="Shashank";
        s1.age=21;
        s1.printInfo(s1.name,s1.age);
    }
    
}


