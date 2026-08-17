import java.util.*;

public class HM01_Basics {
    public static void main(String[] args) {
    
    HashMap<String, Integer>map = new HashMap<>();
    map.put("Kunal", 89);
    map.put("Karan", 99);
    map.put("Kanak", 19);
    map.put("apoorva", 190);


    // System.out.println(map.get("Kanak"));
    // System.out.println(map.getOrDefault("apoorva", 98));

    System.out.println(map.containsKey("Kanak"));

    HashSet<Integer>set = new HashSet<>();

    set.add(56);
    set.add(9);
    set.add(6);
    set.add(565);
    set.add(90);
    set.add(56);

    System.out.println(set);


    //internally its different 
    // TreeMap<String, Integer>Map = new TreeMap<>();
    // set.add(56);
    // set.add(9);
    // set.add(6);
    // set.add(565);
    // set.add(90);
    // set.add(56);

    // System.out.println(set);

    




}

}
