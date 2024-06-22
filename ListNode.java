import java.util.List;

public class ListNode{
  
    int val;
    ListNode next;
   
    ListNode(){}
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
    public  static  ListNode head;
    public void addList(int val){
        ListNode newOne= new ListNode(val);
        if (head==null){
            head=newOne;
            return;
        }
        ListNode currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newOne;
        return;
    }
    public void printList(){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }System.out.print("Null");
    }
    public int size(){
        int i=0;
        ListNode curr=head;
        while(curr!=null){
            i++;
            curr=curr.next;
        }
        return i;
    }
}
//  class palindromaLL {
     
// }
//  class  Solution{
//     public  ListNode endNode(ListNode s){
//         ListNode hare=head;
//         ListNode turtle=head;
//         while(hare==null || hare.next==null){
//             turtle=turtle.next;
//             hare=hare.next.next;
//         }
//         return turtle;
//     }
//     public Boolean isPalindrome(){

//     }
// }
class Solution{
//     public static ListNode removeNthFromEnd(int n, ListNode head,ListNode s){
//         int size=0;
//          size=s.size();
//         if(n==size){
//           head=head.next;
//             return head;
//         }
       
//         else if (n>0 &&n<size){
//        if(head.next==null){
//         return null;
//        } 
//        //for prev Node
//        int idxToSearch=size-n-1;
//        int i=0;
//        ListNode prev=head;
//        while(i<idxToSearch){
//         i++;
//         prev=prev.next;
//        }
//        prev.next=prev.next.next;
//        return head;
//     }
//     else {System.out.println("invalid so nothing changed");
//     return head;
//         }
//     }
//     public static void main(String[] args){
//         ListNode s= new ListNode();
//         s.addList(4);
//         s.addList(3);
//         s.addList(2);
//         s.addList(1);
//         s.printList();
//         System.out.println();
//         removeNthFromEnd(4,s.head,s);
//         s.printList();
// }
public ListNode findMiddle(ListNode head){
    //use hare turtle method
}
public ListNode reverse(ListNode){
    
}
public boolean isPalindrome(ListNode head){
    if(head== null || head.next==null){
        return true;
    }
    ListNode middle= findMiddle(head);//1st half ka end 
    ListNode secondhalfStart= reverse(middle.next);
    ListNode first=head;
    while(secondhalfStart!=null){
        if(first!=secondhalfStart){
            return false;
        }first=first.next;
        secondhalfStart=secondhalfStart.next;
    }
    return true;
}
}