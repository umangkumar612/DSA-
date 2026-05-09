// import java.util.*;

// public class circularImplement {
//     public static class ArrayQueue{
//         static int size = 0;
//         static int [] arr = new int [10];
//         static int front = -1;
//         static int rear = -1;
//         static int n = arr.length;
//         public static void add(int x) {
//             if(size == n){
//                 throw new RuntimeException("Queue is full");
//             }
//             else if(size == 0){
//                 front = rear = 0;;
//                 arr[0] = x;
//                 // System.out.println("Queue is full : ");
//                 return;
//             }
//             else if(rear < n){
//                 arr[++rear] = x;
//             }
//             else if(rear == n-1){
//                 rear = 0;
//                 arr[0] = x;
//             }
//             size++;
//         }
//         public static void display(){
//         if(size == 0){
//             System.out.println("queue is empty :");
//         }
//         else{
//             if(front <rear){
//             for(int i = front; i <= rear; i++){
//                 System.out.print(arr[i] + " ");
//             }
//         }
//         else{
//             for(int i = front; i < n ; i++){
//                 System.out.prin(arr[i] + " ");
//             }
//         }
//     }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         ArrayQueue  q = new ArrayQueue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.display();
//     }
// }


// using to the new program for circuilat queue
import java.util.*;
public class implementation{
    public static class queue{
        static int front = 0;
        static int rear = 0;
        static int size = 0;
        static int arr[] = new int[10];
        static int n = arr.length;
    public static void add(int val){
            if(size == n){
            System.out.print("Queue is full : ");
            return;
        }
        else if(rear < n-1){
            arr[++rear] = val;
        }
        else if(rear == n){
            rear = 0;
            arr[0] = val;
        }
        size++;
    }
    public static void display(){
        if(size == 0){
            System.out.print("queue is Empty : ");
            return;
        }
        else if(front <= rear){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for(int i = front; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i < rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
    System.out.println();
    }
    public static int remove(){
        if(size == 0){
            System.out.print("Queue is empty : ");
            return -1;
        }
        else{
            int data = arr[front];
            if(front == n-1){
                front = 0;
            }
            else{
                front++;
            }
        }
         return front;
    }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.remove();
        q.display();
    }
}