
    
    
    import java.util.*;

    public class revLL {
        //because linked list class already exixts
        static Node head;
        class Node{
            int data;
            Node next;
            //constructor
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }    
        //add first 
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                    head=newNode;
                    return;
            }
            newNode.next=head;
            head=newNode;
        }
    
        //add last
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                    head=newNode;
                    return;
            }
    
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
    
        }
        // print
        public void printList(){
            if(head==null){
                System.out.println("list is empty");
                return ;
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"-> ");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }
        //delete first
        public void deleteFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }head=head.next;
        }
        // delete last
        public void deleteLast(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node secondlast=head;
            Node lastNode = head.next;//if head.next=null -> lastNode= null sooo lstnode.next||null.next will generate error
            while (lastNode.next!=null) {
                lastNode=lastNode.next;
                secondlast=secondlast.next;
            }   secondlast.next=null;
            return;
        }
        public static void main(String[] args){
            LinkedList<Integer> list=new LinkedList<Integer>();
            list.addFirst(1);
            list.addFirst(2);
            list.addLast(3);
            list.addFirst(4);
            System.out.println(list );
            System.out.println(list.size());
       //rev in pair
       

        



       
        }
        
    }
    
    
    

