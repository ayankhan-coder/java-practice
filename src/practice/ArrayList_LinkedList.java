package practice;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {
    public static void main(String[] args) {
        /*ARRAY LIST*/
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1);//prints all elements

        /* Methods */
        System.out.println("-- ArrayList Methods --");

        System.out.println(l1.get(0));
        System.out.println(l1.size());
        System.out.println(l1.remove(0));
        System.out.println(l1.set(0,100));
        System.out.println(l1.contains(30));
        System.out.println(l1.indexOf(30));
        l1.add(1,20);


        /*LINKED LIST*/
        LinkedList<String> names = new LinkedList<>();
        names.add("ramesh");
        names.add("sultan");
        names.add("suresh");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.removeLast());
        System.out.println(names);
        names.remove("ramesh");
        names.remove("suresh");
        System.out.println(names);

    }
}
