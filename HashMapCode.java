import java.security.PublicKey;
import java.util.*;


public class HashMapCode {
static class HashMap<K,V>{ // generics
    private class Node{
    K key;//k type jaise int type string type wese k type . k ko baad me define krunga 
    V value;//V type variable called value 
    //constructor of Node class 
    public Node (K key, V value){
        this.key=key;
        this.value=value;
    }
    }
    private int n;//nodes
    private int N;//bucket.length
    //private int buckets[];//array buckets of type int 
    private LinkedList<Node>buckets[];//array buckets of type LinkedList<Node>
    @SuppressWarnings("unchecked")//to supress warnings
    //HashMap's constructor 
    public HashMap(){
        //size of array or no. of buckets 
        this.N=4;
        // we initialised our array of linked list
        this.buckets=new LinkedList[4];
        // at each Index we need to create a empty linkedList otherwise there is Null stored at each index.buckets create hua aur usme linkedList hai
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>(); 
        }
    }  
    private int hashFunction(K key){//0->N-1
        int bi=key.hashCode();//234567 ,-234567but we want positiv
       return Math.abs(bi)%N ;//so in between 0->N-1
    }
    private int searchInLL(K key, int bi){
        //linked list bnali ab search krenge 
        LinkedList<Node> LL= buckets[bi];
        for(int i=0;i< LL.size();i++){
            if (LL.get(i).key==key){
                return i;//di
            }
        }
        return -1;

    }
    private void rehash(){
        //pehle store krana pdega phir bada krna hoga then phirse add krna hoga
        LinkedList<Node>oldBucket[]=buckets;
        buckets=new LinkedList[N*2];
        for (int i=0;i<N*2;i++){
            buckets[i]=new LinkedList<>();
        }
        for (int i=0;i<oldBucket.length;i++){
            LinkedList<Node>LL =oldBucket[i];
            for(int j=0;j<LL.size();j++){
                Node node =LL.get(j);
                put(node.key, node.value);
            }
        }
    }
    public void put(K key, V value){
        int bi=hashFunction(key);//bucketIdx
       int di= searchInLL(key,bi);//data index,di=valid(0+),
       if(di==-1){
        //do not exist, so add key andvalue
        buckets[i].add(new Node(key, value));
        n++;
       }else{
        // key exist
       Node node= buckets[bi].get(di);
       node.value=value;
       }
       double lambda=(double)n/N;
       if(lambda>2.0){
        //rehashing
        rehash();
       }
    }

}
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India", 190);
        map.put("USA", 1234);
        map.put("China", 123456);
        
    }
}
