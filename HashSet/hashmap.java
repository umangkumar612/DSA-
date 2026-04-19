import java.util.*;

public class Umang {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // Insertion
    System.out.println("insertion in HashMap");
    map.put("india", 120);
    map.put("pakistan", 60);
    map.put("china", 140);
    System.out.println(map);
    map.put("india", 140);

    // Searching
       System.out.println("searching in HashMap");
    if (map.containsKey("india")) {
      System.out.println("Key is present in the map");
    } else {
      System.out.println("Key is not present in map");
    }

    // Retrieve value for a specific key
    System.out.println(map.get("india")); // 140
    System.out.println(map.get("nepal")); // null

    // Deletion
       System.out.println("deletion in HashMap");
    map.remove("china");
    System.out.println(map);
  }
}
