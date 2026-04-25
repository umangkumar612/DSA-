// how to reverse a linked list without using extra memory space time
//  complexity shoulb be under o(n),and space complexity should be under o(1);
public class LL{
    
    static Node head;
    // private static int size;
    // LL(){
    //     this.size = 0;
    // }

    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            // size++;
        }
    }

        public static void addfirst(String data){
            Node newNode = new LL().new Node(data);
            if(head == null){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
         }

         public static void addlast(String data){
         Node newNode = new LL().new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         Node curr = head;
         while(curr.next != null){
             curr = curr.next;
         }
         newNode.next = head;
         head = newNode;
    }
    
    public static void print(){
        // node newnode = new LL().new node();
        if(head == null){
            System.out.println(" the list is empty : ");
            return ;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    // public static void deletefirst(){
    //     if(head == null){
    //         System.out.println("list is empty :");
    //         return;
    //     }
    //     head = head.next;
    //     //  size--;
    // }
    
    // public static void deleteLast(){
    //     if(head == null){
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     if(head.next == null){
    //         //   size--;
    //         head = null;
    //     }
    //     Node last = head.next;
    //     Node second = head;
    //     while(last.next != null){
    //         last = last.next;
    //         second = second.next;
    //     }
    //     second.next = null;
    // }
    
    // public int getsize(){
    //     return size;
    // }
    // reversed linked list using iteratioN
    public static void reverse(){
      if(head == null || head.next == null){
      return ;
      }
      Node prev = head;
      Node curr = head.next;
      while(curr != null){
      Node nextNode = curr.next;
      curr.next = prev;
    //   update
       prev = curr;
       curr = nextNode;
      }
      head.next = null;
      head = prev;
      }
    public static void main(String args[]){
         LL list = new LL();
         addfirst("list");
         addfirst("a");
         addfirst("is");
         addfirst("this");
         list.print();
         
         reverse();
         list.print();
         
        //  addlast("last");
        //  list.print();
        //  deletefirst();
        //  deleteLast();
        //  list.print();
        //  System.out.println(list.getsize());
    }
}
/*
by using collections framework
import java.util.*;

public class LL{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());
        
        // using iteration
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
*/