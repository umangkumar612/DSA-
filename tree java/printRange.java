// print the node in the given range

public class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void range(Node root,int x,int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            range(root.left,x,y);
            System.out.println(root.data + " ");
            range(root.right,x,y);
        }
        else if(root.data >= y){
            range(root.left,x,y);
        }
        else {
            range(root.right, x,y);
        }
    }
    public static void main(String[] args) {
        int value [] = { }
        int x = 4;
        int y = 10;
    }
}