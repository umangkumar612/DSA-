public class LL{
    class Node(int data){
        Node curr;
        Node prev;
    }

    public Node(){
        this.curr = head;
        this.prev = null;
        this.data = data;
    }
    public static int delete(int n , Node head){
        if(head == null || head.next == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while (curr!= null){
          curr = curr.next;
          size++;
        }
        if(n == size){
            return head.next;
        }
        int index = size-n-1;
        int i = 1;
        Node prev = head;
        while(i < index){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        retur head;
    }
    public static void main(String args[]){
        addFirst("1");
        addFirst("2");
        addFirst("3");
        addFirst("4");
        addFirst("5");
        
    }
}