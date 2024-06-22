import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
       //creation
       HashSet<Integer> set= new HashSet<>();
       //insert
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);

       // search Contains
       if(set.contains(1)){
        //boolean
        System.out.println("Set contains 1");
       }
       if(!set.contains(6)){
        //boolean
        System.out.println("Set doesn't contains 6");
       }
       //delete
    //    set.remove(1);
    //    if(!set.contains(1)){
    //     //boolean
    //     System.out.println("Set doesn't contains 1");
    //    }
       System.out.println("size is "+set.size());
       System.out.println(set);

       //Iterator
       Iterator it=set.iterator();

       // hasNext  && next

        k
    }
}
