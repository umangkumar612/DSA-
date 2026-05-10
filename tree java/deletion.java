// delete a node from the binary search tree 
import java.util.Scanner;

public class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public static Node delete(Node root,int val){
        if(root == null){
            return root;
        }
    // for searching an element is available in left side or right side 
       if(root.data > val){
        root.left = delete(root.left,val);
       }

       else if(root.data < val){
        root.right = delete(root.right,val);
       }
       
      
       else {
          // case 1 -> leaf node or no child node
          if(root.left == null || root.right){
            return null;
          }
    //    case 2 one child node 
         if(root.left == null){
            return root.right;
         }
         else if(root.right == null){
            return root.left;
         }
        //  case 3 two child node 
         Node succ = succesor(root.right);
         root.data = succ.data;
         root.right = delete(root.right,val);
        }
        return root;
    }
    public static Node succesor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}
