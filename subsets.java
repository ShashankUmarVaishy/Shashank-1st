import java.util.ArrayList;


public class subsets {
    public static void printSubs(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }System.out.println();

    }
    public static void findSubs(int n,ArrayList<Integer> subset){
        if(n==0){
           printSubs(subset);
           return;
        }
       
        //add hua
        subset.add(n);
        findSubs( n-1, subset);
        //Add nahi hua
        //usko htana bhi pdega n ,.remove(index )
        subset.remove(subset.size()-1);
       
        findSubs( n-1, subset);

    }
    public static void main(String[] args){
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubs(n, subset);


    }
    
}
