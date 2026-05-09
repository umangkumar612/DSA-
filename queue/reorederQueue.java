// Question->. re-order Queue(Interleave 1st half with 2nd half);

import java.util.*;
public class reorederQueue{
        public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();
             q.add(1);
             q.add(2);
             q.add(3);
             q.add(4);
             q.add(5);
             q.add(6);
             q.add(7);
             q.add(8);
             System.out.print(q);
             int n = q.size();
             Stack<Integer> st = new Stack<>();
             // 1 2 3 4 5 6 7 8 
             for(int i = 0; i < n/2; i++){
                 st.push(q.remove());// q ->5 6 7 8 ;st->1 2 3 4
             }
             while(st.size() > 0){
                 q.add(st.pop()); //Q-> 5 6 7 8 4 3 2 1
             }
             for(int i = 0; i <n/2; i++){
             st.push(q.remove()); //Q-> 4 3 2 1 ; st-> 5 6 7 8
             }
             for(int i = 0;i < n/2; i++){
                 q.add(st.pop());//Q-> 8 4 7 3 6 2 5 1 
                 q.add(q.remove());
             }
             while(q.size() > 0){
                 // q-> Empty ; st-> 8 4 7 3 6 2 5 1
                 st.push(q.remove());
             }
             // reverse an stack to get
            //  q-> 1 5 2 6 3 7 4 8
            while(st.size() > 0){
                q.add(st.pop());
            }
            System.out.println();
            System.out.print(q);
    }
}
