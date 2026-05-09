// implemetations of queue using array by physics wallah

import java.util.*;
public class ll{
    public static class Node{
         int data;
         Node next;
          
          Node(int data){
              this.data = data;
              this.next = null;
          }
    }
          public static class queue{
             static Node head = null;
             static Node tail = null;
              static int size = 0;
              public static void add(int x){
                  Node newNode = new Node(x);
                  if(size == 0){
                      System.out.println("queue is empty : ");
                      head = tail= newNode;
                  }
                  else{
                      tail.next = newNode;
                      tail = newNode;
                  }
                  size++;
              }
              public static Node remove(){
                  if(size == 0){
                      System.out.println("Queue is empty : ");
                      return head;
                  }
                  head = head.next;
                  size--;
                  return head;
              }
              public static int peek(){
                  if(size == 0){
                      System.out.println("queue is empty : ");
                      return -1;
                  }
                  return head.data;
              }
              public static int sizeof(){
                  return size;
              }
              public static boolean isEmpty(){
                  if(size == 0){
                     return true;
                  }
                  return false;
              }
              public static void print(){
                  Node curr = head;
                  while(curr != null){
                      System.out.print(curr.data + " ");
                      curr = curr.next;
                  }
                  System.out.println();
              }
          }
            
    public static void main(String[] args) {
        queue q = new queue();
        q.print();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();
        q.remove();
        q.remove();
        q.print();
        System.out.println("peek value of queue is " + q.peek());
        System.out.println(q.sizeof());
        System.out.println(q.isEmpty());
        // q.sizeof();
        q.print();
    }
}

