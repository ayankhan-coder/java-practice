package collectionFrameworks;

/*TreeMap is a Map implementation that stores
key-value pairs with keys automatically sorted.*/

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(3,"khan");
        t.put(1,"ayan");
        t.put(2,"ahmed");
        System.out.println(t.entrySet());
        System.out.println(t.keySet());
        System.out.println(t.values());
        for (Map.Entry<Integer,String> e : t.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // TreeMap Special methods
        System.out.println(t.firstKey());
        System.out.println(t.lastKey());
        System.out.println("=++++++++++++");
        System.out.println(t.lowerEntry(2));

    }
}
