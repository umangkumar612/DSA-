import java.util.*;

public class subsets {
    public static void fun1(ArrayList<Integer> sub()){
     for(int i=0;i<=sub.size();i++){
        System.out.print(sub.get(i) + " ");
     }
     System.out.println();
    }
    public static void fun2(int n,ArrayList<Integer> sub){
        if(n==0){
            fun1(sub);
            return;
        }
        sub.add(n);
        fun2(n-1,sub);
        sub.remove(sub.length()-1);
        fun2(n-1,sub);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Iteger> sub= new <ArrayLisy>();
        fun2(n,sun);
    }
}
