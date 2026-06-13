package collectionFrameworks;


public class ArrayList_ {
    public static void main(String[] args) {
        /*ARRAY LIST*/
        java.util.ArrayList<Integer> l1 = new java.util.ArrayList<>();
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

    }
}
