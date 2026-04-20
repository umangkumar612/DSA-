// Implementations of stack using arrays

public class ArrayImplementation {
    public static class Stack{
        private int [] arr = new int [5];
        private int ind = 0;
        void push(int x){
            arr[ind++] = x;
        }
        int peek(){
            if(ind == 0){
                System.out.println("stack is empty : ");
                return -1;
            }
           return arr[ind-1];
        }
        int pop(){
            if(ind == 0){
                System.out.println("stack is empty : ");
                return-1;
            }
            int top = arr[ind-1];
            arr[ind-1] = 0;
            ind--;
            return top;
mk        void display(){
            for(int i = 0;i < ind;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return ind;
        }
        boolean isEmpty(){
            if(ind == 0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isFull(){
            if(ind == arr.length){
                return true;
            }
            else{
                return false;
            }
        }
        }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("size of stack is " + st.size()); 
        st.display();
        st.pop();
        st.display();
        st.peek();
        st.display();
        System.out.println("size of the array is " + st.size());
        System.out.println(st.isEmpty());
        st.display();
    }
} 




/*  Implementations of stack using arrays
import java.util.Scanner;
public class ArrayImplementation {
    public static class Stack{
        private int [] arr = new int [10];
        private int ind = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full : ");
            }
            else{
            arr[ind++] = x;
        }
        }
        int peek(){
            if(ind == 0){
                System.out.println("stack is empty : ");
                return -1;
            }
           return arr[ind-1];
        }
        int pop(){
            if(ind == 0){
                System.out.println("stack is empty : ");
                return-1;
            }
            int top = arr[ind-1];
            arr[ind-1] = 0;
            ind--;
            return top;
        }
        void display(){
            for(int i = 0;i < ind;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return ind;
        }
        boolean isEmpty(){
            if(ind == 0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isFull(){
            if(ind == arr.length){
                return true;
            }
            else{
                return false;
            }
        }
        }
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        int key = 0;
        do{
            System.out.println("Stack operations : ");
            System.out.println("1.push : ");
            System.out.println("2. pop : ");
            System.out.println("3.peek: ");
            System.out.println("4.display : ");
            System.out.println("5.size : ");
            System.out.println("6.check if empty : ");
            System.out.println("7.exit : ");
            
            System.out.println("enter your key : ");
            key = sc.nextInt();
            switch(key){
                case 1:
                    System.out.println("Enter the number to push : ");
                    int num = sc.nextInt();
                    st.push(num);
                    break;
                case 2:
                    int popvalue = st.pop();
                    if(popvalue != -1){
                        System.out.println("popped : " + popvalue);
                    }
                    break;
                case 3:
                    int top = st.peek();
                    if(top != -1){
                        System.out.println("top of stack : " + top);
                    }
                    break;
                case 4 : 
                    System.out.println("print stack : ");
                    st.display();
                    break;
                case 5 :
                    System.out.println("size of stack : " + st.size());
                    break;
                case 6 :
                    System.out.println("is stack empty" + st.isEmpty());
                    break;
                case 7:
                     System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
              while (key != 7);
    }
}
*/