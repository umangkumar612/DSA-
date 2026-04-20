// user input stack 

import java.util.*;
public class reverse_stack {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Stack <Integer> st = new Stack<>();
    int n ;
    System.out.println("enter the size of stack : ");
    n = sc.nextInt();
    System.out.println("enter the " + n + " elements of an stack : ");
    for(int i = 0;i < n; i++){
        int x = sc.nextInt();
        st.push(x);
    }
    System.out.println(st +" ");

    }
}
