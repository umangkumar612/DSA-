public class LL{
    // node head;
  static class node{
        int data;
        node next;
        node prev;

        node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void forward(node head){
       node curr = head;
       while( curr != null){
        System.out.print(curr.data + "  ");
        curr = curr.next;
       }
       System.out.println();
    }
    public static void backward(node tail){
        node curr = tail;
        while( curr != null){
            System.out.print(curr.data + "  ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public static void main(String args[]){
        node head = new node(1);
        node second = new node(2);
        node third = new node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.println("in forward traversal :");
        forward(head);

        System.out.println(" in backward order : ");
        backward(third);
    }
}