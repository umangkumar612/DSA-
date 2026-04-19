import java.util.HashSet;

public class basic{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
       //Insertion 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);

        // searching
        if(set.contains(1)){
            System.out.println("set contains 1 :");
        }
        if(!set.contains(7)){
            System.out.println("set does not contains 7");
        }

        // deletions 
        set.remove(4);
        System.out.println(set);
        System.out.println("size of the set is "+set.size());
       
    }
}