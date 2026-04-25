
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;

class HelloWorld {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
      // add an element in the Arraylist
        list.add(0);
        list.add(1);
        list.add(20);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        // list.get(2);
    // access the element of an arraylist
        System.out.println(list.get(2));
        list.add(2,2);
        System.out.println(list);
        // update an modify an element in the arralist
        list.set(3,4);
         System.out.println(list);
        //  remove or delete an element from arralist
         list.remove(3);
          System.out.println(list);
        // count the of an arraylist
        System.out.println(list.size());
        // print the element of arraylist using loops
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}