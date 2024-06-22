import java.util.LinkedList;

public class LL2 {
    static int i=0;
    static Node head;
    class Node{
        int data;
        Node next;
        //constructor of node
        Node(int data){
           this.data=data;
           this.next=null;
        } Node(){
            this.data=0;
            this.next=null;
         }
       
    }
    //addFirst
    public void addFirst(int data){
        Node newOne=new Node(data);
        if(head==null){
            head=newOne;
            return;
        }
        newOne.next=head;
        head=newOne;
        return;
    }
    //addLast
    public void addLast(int data){
        Node newOne=new Node(data);
        if(head==null){
            head=newOne;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }currNode.next=newOne;
        return;

    }
    //removeFirst
    public void removeFirst(){
        if(head==null){
            return;
        }head=head.next;
        return;
    }
    //removeLast
    public void removeLast(){
        if(head==null){
            return;
        }
        Node currNode=head;
        Node nextNode=currNode.next;
        if(nextNode==null){
            head=null;
            return;
        }
        while(nextNode.next!=null){
            currNode=nextNode;
            nextNode=nextNode.next;
        }  currNode.next=null;
        return;  
    }
    //size
    public int size(){
        int i=0;
        Node currNode=head;
        while(currNode!=null){
            i++;
            currNode=currNode.next;
        }
        return i;
    }

    //print
    public static void print(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node thisone=head;
        while(thisone!=null){
          
            System.out.print( thisone.data+"->");
            thisone=thisone.next;
        }
        System.out.println("null");
        return;
    }
    // public void revInPair(){
    //   //Node temp=new Node();
    //   Node currNode=head;
    //   Node nextNode=head.next;
    //   while(nextNode.next!=null){
    //     nextNode.next=currNode;
    //     currNode.next=nextNode.next.next;
    //    if(currNode==head){
    //    head= nextNode;
    //    }
    //    nextNode=currNode;
    //   }
        
    //     print();
      
    // }
    public Node nthNodeFromLast(LL2 list,int n){
        int idxfromFront=list.size()-n;
        if(idxfromFront<list.size() && idxfromFront>=0){
            if(idxfromFront==0){
                return head;
            }
            Node reqNode=head;
            for(int i=0;i<(list.size()-n);i++){
                reqNode=reqNode.next;
            }
            return reqNode;}
            else return null;

    }
    public void deleteNthNodeFromLast(LL2 list,int n){
        int idxfromFront=list.size()-n;
        if(idxfromFront<list.size() && idxfromFront>=0){
            if(idxfromFront==0){
                head=null;
                return;
            }
            Node reqNode=head;
            Node prevNode=null;
            for(int i=0;i<(list.size()-n);i++){
                prevNode=reqNode;
                reqNode=reqNode.next;
            }
            if(reqNode==head){
                head=null;
               
            }
            else{
            prevNode.next=reqNode.next;
            }
          
            
        } else System.out.println("invalid position");
      

    }
    public static void reverse(){
        Node prevNode,currNode,nextNode;
        prevNode=head;
        currNode=head.next;
       
        while(currNode!=null){
            if(prevNode==head){
                prevNode.next=null;
             }
           
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }head=prevNode;
        print();



        

    }


    public static void main(String[] args){
        LL2 list=new LL2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

    //     list.addLast(2);
    //     list.addLast(3);
    //   list.addLast(4);
    //      list.addLast(5);
         //list.removeLast();
        // list.addLast(6);
        // list.addLast(7);
        // list.addFirst(0);
        
        print();
        reverse();

       list.deleteNthNodeFromLast(list,1);
       print();
      
       
     
    }
}
