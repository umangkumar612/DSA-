import java.util.Scanner;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Method to insert values into the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to search for a value in the BST
    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data > val) {
            return search(root.left, val);
        }
        if (root.data < val) {
            return search(root.right, val);
        }
        return true; // when root.data == val
    }

    public static void main(String[] args) {
        int[] values = {1, 3, 4, 5, 6, 8, 10, 11, 14};
        Node root = null;
        
        // Insert values into the BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Example search
        int target = 10; // Change this value to search for different numbers
        if (search(root, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
