import java.util.*;
public class BinaryTreeYT {
  
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        }
    }
    

static class BinaryTree{
    static int idx=-1;
    //return root
    public static Node buildTrees(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }

        Node newNode= new Node(nodes[idx]);
        newNode.left=buildTrees(nodes);
        newNode.right=buildTrees(nodes);
        return newNode;
    }
}
public static void preOrderrTraversal(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data);
    preOrderrTraversal(root.left);
    preOrderrTraversal(root.right);
}
public static void inOrderrTraversal(Node root){
    if(root==null){
        return;
    }
    inOrderrTraversal(root.left);

    System.out.print(root.data);
   
    inOrderrTraversal(root.right);
}
public static void postOrderrTraversal(Node root){
    if(root==null){
        return;
    }
    postOrderrTraversal(root.left);
   
    postOrderrTraversal(root.right);

    System.out.print(root.data);
}
public static void lvlOrderTraversal(Node  root){
    if(root==null){
        return;
    }
    Queue<Node>q=new LinkedList<>();
   q.add(root);
   q.add(null);
   while(!q.isEmpty()){
    Node curr=q.remove();
    if(curr==null){
        System.out.println();
        if(q.isEmpty()){
            break;
        }else{
            q.add(null);
        }
    }else{
        System.out.print(curr.data);
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
    }
   }
}
public static int totNode(Node root){
    if(root==null){
        return 0;
    }
    int left=totNode(root.left);
    int right=totNode(root.right);
    return left+right+1;
    // if(root.left==null && root.right==null){
    //     return 1;
    // }
    // int leftSubTree=0,rightSubTree=0;
    // if(root.left!=null){
    // leftSubTree=totNode(root.left);}

    // if(root.right!=null){
    // rightSubTree=totNode(root.right);}

    // return leftSubTree+rightSubTree+1;
}
public static int sumOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftSum=sumOfNodes(root.left);
    int rightSum=sumOfNodes(root.right);
    return leftSum+ rightSum + root.data;

}
public static int height(Node root){
    if (root ==null){
        return 0;
    }
    int leftHeight=height(root.left);
    int rightHeight= height(root.right);
    // if (leftHeight>=rightHeight){
    //     return leftHeight+1;
    // }else {
    //     return rightHeight+1;
    //  }
    int myHeight=Math.max(leftHeight, rightHeight)+1;
    return myHeight;
}
public static int diameter(Node root){
    if(root==null){
        return 0;
    }
    int dia1=diameter(root.left);
    int dia2=diameter(root.right);
    int dia3=height(root.left)+height(root.right)+1;
    return Math.max(dia2,Math.max(dia1, dia3));
}
static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht,int diam){
        this.ht=ht;
        this.diam=diam;
        //each node returns its ht and diameter 
    }
}
public static TreeInfo diamON (Node root){
    if (root==null){
        return new TreeInfo(0, 0);
    }

    TreeInfo left=diamON(root.left);
    TreeInfo right=diamON(root.right);
int myHt=Math.max(left.ht, right.ht)+1;
    int diam1=left.diam;
    int  diam2=right.diam;
    int diam3=left.ht+right.ht+1;
    int myDiam=Math.max(diam2, Math.max(diam1, diam3));

    TreeInfo myInfo=new TreeInfo(myHt, myDiam);
    return myInfo;

   
} 
static int sum=0;
public static int levelSum(Node root,int lvl){
    int idx=1;
Queue<Node>q=new LinkedList<>();

q.add(root);
q.add(null);
while(!q.isEmpty())//while q is not empty
{
   Node curr=q.remove();
   if(curr==null){
    if(q.isEmpty()){
        break;
    }else{
        idx++;
        q.add(null);
    }
}else{
    if(idx==lvl){
    sum+=curr.data;}
    if(curr.left!=null){
        q.add(curr.left);
    }
    if(curr.right!=null){
        q.add(curr.right);
    }
}
}return sum;
}
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTrees(nodes);
        // preOrderrTraversal(root);
        // System.out.println();
        // inOrderrTraversal(root);
        // System.out.println();
        // postOrderrTraversal(root);
        // System.out.println();
        // lvlOrderTraversal(root);
        // System.out.println(totNode(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        // System.out.println(diamON(root).diam);
        System.out.println(levelSum(root,2));
    }
}
