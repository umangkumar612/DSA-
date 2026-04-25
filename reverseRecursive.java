// write a program to reversed an linkedlist using the recursive methode 

public class LL{

   static Node head;

    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node recursiveReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}