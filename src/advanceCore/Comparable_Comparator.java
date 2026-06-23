package advanceCore;
/* Comparable is an interface used to define the natural ordering of objects of a class.
 It allows objects to be compared and sorted automatically by methods such as Collections.sort()*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
// Comparable
class Laptop implements Comparable<Laptop>{                // --------Comparable
    String name;
    int price;
    double rating;

    public Laptop(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public int compareTo(Laptop other) {
        return this.price - other.price;
    }
}
class RatingComparator implements Comparator<Laptop>{         // -----Comparator
    @Override
    public int compare(Laptop l1, Laptop l2) {
        return Double.compare(l2.rating,l1.rating);
    }
}

public class Comparable_Comparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Laptop dell = new Laptop("Dell", 47000, 8.1);
        Laptop hp = new Laptop("hp", 40000, 7.5);
        Laptop lenovo = new Laptop("lenovo", 55000, 9.3);
        Laptop acer = new Laptop("acer", 30000, 6.5);

        ArrayList<Laptop> list = new ArrayList<>();
        list.add(dell);
        list.add(hp);
        list.add(lenovo);
        list.add(acer);
        for (Laptop l : list) {
            System.out.println(l.name + " ~ " + l.price + " ~ " + l.rating);
        }
        while (true){
        System.out.println("1-SortByPrice 2-SortByRating");
        System.out.print("Enter Option Number : ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                Collections.sort(list);                                     // --------Comparable
                for (Laptop l : list) {
                    System.out.println(l.name + " ~ " + l.price + " ~ " + l.rating);
                }
                break;
            case 2:
                RatingComparator ratingComparator = new RatingComparator();

                Collections.sort(list, ratingComparator);                    // -----Comparator
                for (Laptop l : list) {
                    System.out.println(l.name + " ~ " + l.price + " ~ " + l.rating);
                }
                break;
            default:
                System.out.println("Enter Correct Option number");
        }
    }








    }
}
