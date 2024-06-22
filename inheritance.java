class Shape{
   public void area(){
    System.out.println("area ");
   }

}
class Triangle extends Shape{//inherited Shape's property methods
public void area(int l,int h){
    System.out.println(l*h/2);
}

}
class EquiTriangle extends Triangle{

}
public class inheritance {
    
    public static void main(String[] args){

Triangle t1=new Triangle();
t1.color="red";//b/c t1 already have color property
    }
}
