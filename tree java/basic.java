import java.util.*;

public class ll{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class tree{
        static int ind = -1;
        public static Node binaryTree(int nodes[]){
            ind++;
            if(nodes[ind] == -1){
                return null; 
            }
            Node root = new Node(nodes[ind]);
            root.left = binaryTree(nodes);
            root.right = binaryTree(nodes);
            return root;
        }
    }
    public public static void main(String[] args) {
     int nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     Node root = tree.binaryTree(nodes);
     root.binaryTree(nodes);
    }
}