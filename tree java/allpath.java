import java.util.*;
public class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void allpath(Node root,ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{
            allpath(root.left,path);
            allpath(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0 ;i < path.size(); i++){
            System.out.println(path.get(i) + " -> ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<>();

    }
}
