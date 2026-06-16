package collectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args) {

        HashMap<Integer , String> students = new HashMap<>();
        students.put(101,"khan");
        students.put(102,"Suresh");
        students.put(103,"ramesh");
        System.out.println(students);
        System.out.println(students.get(102));
        students.remove(103);
        System.out.println(students.containsKey(101));
        System.out.println(students.containsValue("Khan"));
        System.out.println(students.get(101));

        System.out.println(students.keySet());
        System.out.println(students.values());
        for (Map.Entry<Integer,String> e : students.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(students.entrySet());
        System.out.println(students);

    }
}
