import java.util.*;

public class Stack1 {
     static Node head;
    public static class Node{
        int data;
        Node next;
         Node (int data){
         this.data=data;
         this.next=null;   
        }
        static class Stack{
        public static void push(int data){
            Node newOne=new Node(data);
            if (head==null) {
                head=newOne;
                
            }
           head.next=newOne;
           head=newOne;
        }
        public static Node pop(){
            if(head==null){
                return null ;
            }
            head=head.next;
            return head;
        }
        public static int peek(){
            if(head==null){
                return -1;
            }
           return head.data;
        }
        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
    }
 }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
