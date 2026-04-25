import java.util.Collections;
import java.util.ArrayList;

public class collections{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}