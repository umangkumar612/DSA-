// implemetations of queue using array by physics wallah

import java.util.*;
public class implementation{
    public static class queue{
       static int size = 0;
       static int f = -1;
       static int r = -1;
       static int arr[] = new int[100];
        public static void add(int val){
            if(r == arr.length-1){
                System.out.println("queue is full : ");
                return;
            }
            if(f == -1){
               f = r = 0;
               arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public static int remove(){
            if(f == -1){
                System.out.println("Queue is empty : ");
                return -1;
            }
             size--;
            f++;
            return arr[f-1];
        }
        public static int peek(){
         if(f == -1){
            System.out.println("queue is empty : ");
            return -1;
         }
         return arr[f];
        }
        public static boolean isEmpty(){
            if(size == 0){
                return true;
            }
            else{
                return false;
            }
        }
        public static void print(){
            if(size == 0){
                System.out.println("Queue is empty :");
            }
            else{
                for(int i = 0; i < size; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
// implemetation of queue using arrays by shradha didi

/*import java.util.*;
public class Queue_array {
    public static class Queue{
        static int [] arr;
        static int rear = -1;
        static int size;

        Queue(int n)
        {
             arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == arr.length - 1){
                System.out.println("Queue is full");
                return;
            }....
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is already empty : ");
                return -1;
            }
            int front = arr[0];
            for(int i = 1; i <= rear; i++){
                arr[i-1] = arr[i];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is already empty : ");
                return -1;
            }
            return arr[0];
        }
    }*/
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();
        q.remove();
        q.remove();
        q.print();
        System.out.println("peek value of queue is " + q.peek());
        System.out.println(q.isEmpty());
    }
}
