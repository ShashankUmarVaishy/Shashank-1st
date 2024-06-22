import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
       
    }
    public static boolean search(Node  root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data>key){
           return search(root.left, key);
        }
        else {
           return search(root.right, key);
        }
        
       
    } public static Node insert(int val,Node root){
        if(root==null){
        Node newOne=new Node(val);
            return newOne;
        }
      
        if(root.data>val){
            //left insertion
           root.left= insert(val, root.left);
        } else{
            //right insertion
            root.right=insert(val, root.right);
        }
        return root;
    }public static void inOrderrTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderrTraversal(root.left);
    
        System.out.print(root.data+" ");
       
        inOrderrTraversal(root.right);
    }
    public static Node delete(Node root, int val){
        if(root.data>val){
        if(root.left==null){
            return root;
        }
           root.left=delete(root.left, val);
        }
        else if (root.data<val){
            if(root.right==null){
                return root;
            }
           root.right= delete(root.right, val);
        }
        else if (root.data==val){
            //delete here
            //case 1 leaf Node
            if(root.left==null && root.right==null){
                return null;
            }//case 2 hai ye single child
            if(root.left==null){
                return root.right;
            }else if (root.right==null){
                return root.left;
            }
            
            //do node wala
            Node IS = inOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
       public static void printInRange(Node root, int x , int y ){
        if(root==null){
            return;
        }
        if(x<=root.data && y>=root.data){
            // if(root.data==x){
            //     System.out.println(root.data);
            // }
            // if(root.data==y){
            //     System.out.println(root.data);
            // }
            printInRange(root.left, x, y); 

            System.out.print(root.data+" ");
           
            printInRange(root.right, x, y);
        }
       else if(x>root.data){
            printInRange(root.right, x, y);
        }
        else if(y<root.data){
            printInRange( root.left, x, y);
        }
       }
       static ArrayList<Integer> path=new ArrayList<>();
       public static void rootToleaf(Node root){
        if(root==null){
            return;
        }
        
      //add root 
        path.add(root.data);

        //check for leaf
        if(root.left==null && root.right==null){
           
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println(" null");
            path.remove(path.size()-1);
            return;
        }
        //go left
        rootToleaf(root.left);
        //go right
        rootToleaf(root.right);
        //delete root
        path.remove(path.size()-1);
       
       }
    
    public static void main(String[] args) {
        int []values={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(values[i], root);
        }
        inOrderrTraversal(root);
        System.out.println();
        // if(search(root,7)){
        //     System.out.println("yes");
        // }else System.out.println("no");
        // delete(root, 8);
        // inOrderrTraversal(root);
       // printInRange(root, 1, 10);
       rootToleaf(root);
        
        
    }
}
