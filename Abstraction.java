import javax.swing.plaf.nimbus.State;

abstract class Animals{
    abstract public void walk();
    public String HindiName(String naam){
        return naam;
    }
    public void eats(){
        System.out.println("yes it eats");
    } 

}
class Horse extends Animals{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    
}
class Chicken extends Animals{
    public void walk(){
        System.out.println("walko 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Horse horse1=new Horse();
       
        System.out.println(horse1.HindiName("teenu"));
        horse1.walk();
        horse1.eats();
    }
    
}
