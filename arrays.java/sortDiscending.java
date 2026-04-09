import java.util.ArrayList;
import java.util.Collections;
public class solution{
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(10);
    list.add(3);
    list.add(5);
    list.add(22);
    list.add(10);
    System.out.println(" arraylist before reversed :" + list);
    Collections.reverse(list);
    System.out.println("arraylist after reversed :" + list);
    Collections.sort(list);
    System.out.println("sorted ArrayList in accending order : "+list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println("sorted array list in descending order  : "+list);
    
    ArrayList<String> arr = new ArrayList<>();
    arr.add("welcome");
    arr.add("To");
    arr.add("the");
    arr.add("Home");
    System.out.println("before sort : "+arr);
     Collections.sort(arr);
     System.out.println("after sorted : " + arr);
     Collections.sort(arr,Collections.reverseOrder());
     System.out.println("reversed order :" +arr);
     
    
}
}