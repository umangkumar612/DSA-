public class LL {
    static Node head;
    public class Node{
        int data;
        int next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void deleteFromEnd(Node head,int index){
        int size = 0;
        Node curr = head;
        while(cur != null){
            curr = curr.next;
            size++;
        }
        int n = size - x + 1;
        curr = head;
        for(int i = 0;i < index -1; i++){
          curr = curr.next;
        }
    }
    public static void printlist(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data  + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(101); 
        Node b = new Node(102); 
        Node c = new Node(103); 
        Node d = new Node(104); 
        Node e = new Node(105); 
        Node f = new Node(106);
        a.next =b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        printlist(); 
    }
}
