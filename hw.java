import java.util.*;
public class hw {
    // public static void revInPair(){
    //     if(head==null){
    //         return;
    //     }

    //     Node prevNode=head;
    //     Node currNode=head.next;
    //     while(currNode!=null){
    //         Node nextNode=currNode.next;
    //         if(i%2==0){
    //             currNode.next=prevNode;
    //             prevNode=currNode;
    //             currNode=nextNode;
    //             i++;
    //         }
    //         head.next=null;
    //     }head=prevNode;
    //     printList();
    // }
 
   
       

    
    public static void main(String[] args){
      //  Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println(list);
       
    }
}
