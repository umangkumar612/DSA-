public class LL{
    
    static node head;
    private static int size;
    LL(){
        this.size = 0;
    }

    class node{
        String data;
        node next;
        
        node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

        public static void addfirst(String data){
            node newnode = new LL().new node(data);
            if(head == null){
                head = newnode;
                return ;
            }
            newnode.next = head;
            head = newnode;
         }

         public static void addlast(String data){
         node newnode = new LL().new node(data);
         if(head == null){
             head = newnode;
             return;
         }
         node curr = head;
         while(curr.next != null){
             curr = curr.next;
         }
         newnode.next = head;
         head = newnode;
    }
    
    public static void print(){
        // node newnode = new LL().new node();
        if(head == null){
            System.out.println(" the list is empty : ");
            return ;
        }
        node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void deletefirst(){
        if(head == null){
            System.out.println("list is empty :");
            return;
        }
        head = head.next;
         size--;
    }
    
    public static void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
              size--;
            head = null;
        }
        node last = head.next;
        node second = head;
        while(last.next != null){
            last = last.next;
            second = second.next;
        }
        second.next = null;
    }
    
    public int getsize(){
        return size;
    }
    public static void main(String args[]){
         LL list = new LL();
         addfirst("this");
         addfirst("a");
         addfirst("is");
         list.print();
         
         addlast("last");
         list.print();
         
         deletefirst();
         deleteLast();
         list.print();
         System.out.println(list.getsize());
    }
}

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
