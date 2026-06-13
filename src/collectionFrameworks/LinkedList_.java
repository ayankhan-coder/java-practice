package collectionFrameworks;

public class LinkedList_ {
    public static void main(String[] args) {
        /*LINKED LIST*/
        java.util.LinkedList<String> names = new java.util.LinkedList<>();
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
