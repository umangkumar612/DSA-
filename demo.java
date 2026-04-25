// // 
// import java.util.*;

// public class LL{
//     static node head; 
//     class node{
//         String data;
//         node next ;

//         node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }   
//     public static void addfirst(String data){
//         node newnode = new LL().new node(data);
//         if(head == null){
//             head = newnode;
//             return;
//         }
//         newnode.next = head;
//         head = newnode;
//     }
//     public static void addlast(String data){
//         node newnode  = new LL().new node(data);
//         if(head == null){
//         head = newnode; 
//         return;
//     }
//     node curr = head;
//     while(curr.next != null){
//         curr = curr.next;
//     }
//     curr.next = newnode;
// }
// public static void deletefirst(){
//     if(head == null){
//         System.out.println(" list is empty :");
//         return;
//     }
//     head = head.next;
// }
// public static void deletelast(){
//     if(head == null){
//         System.out.println("list is empty :");
//         return;
//     }
//     node second = head;
//     node last = head.next;
//     while(last.next != null){
//         last = last.next;
//         second = second.next;
//     }
//     second.next = null;
// }
// public static void print(){
//     if(head == null){
//         System.out.println("list is empty :");
//         return;
//     }
//     node curr = head;
//     while(curr != null){
//         System.out.print(curr.data + " -> ");
//         curr = curr.next;
//     }
//     System.out.println("null");
// }
// public static void main(String args[]){
//     LL list = new LL();
//     addfirst("is");
//     addfirst("a");
//     list.print();
// }
// }
import java.util.*;

class LL{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("this");
        list.addFirst("is");
        System.out.println(list);
        
        list.addLast("list");
        System.out.println(list);
        
        list.removeFirst();
        System.out.println(list);
        
        list.add(1,"is");
        System.out.println(list);
        
        list.removeLast();
        System.out.println(list);
    }
}