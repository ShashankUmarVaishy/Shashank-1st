import java.util.*;
public class Hashing2 {
    public static void main(String[] args) {
        //country iskey and population is alue
        HashMap<String,Integer>map=new HashMap<>();
   map.put("India", 120);
   map.put("USA",121);
   map.put("China", 122);
   System.out.println(map);
   map.put("India", 140);
   System.out.println(map);

    }
}
