package java8Features.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;


class Product{
    String name;
    int price;
    double rating;
    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    @Override
    public String toString() {
        return name+":"+price+":"+rating;
    }
}

public class BinaryOperator_Interface {
    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(10,20));

        BinaryOperator<String> upper = (a, b) -> a.toUpperCase()+b.toUpperCase();
        System.out.println(upper.apply( "ayan","-khan"));

        BinaryOperator<Integer> compare = (a,b) -> {
            if (a<b){
                return b;
            }else {
                return a;
            }
        };
        System.out.println(compare.apply(10,20));

        System.out.println("--------------------Methods-------------------------");
        /*minBy , maxBy*/

        BinaryOperator<Integer> smaller = BinaryOperator.minBy(Integer::compare);   //minBy
        System.out.println(smaller.apply(100,50));

        BinaryOperator<Integer> larger = BinaryOperator.maxBy(Integer::compare);    //maxBy
        System.out.println(smaller.apply(100,50));

        BinaryOperator<String> names = BinaryOperator.minBy(String::compareTo);
        System.out.println(names.apply("zahid","ayan"));

        BinaryOperator<String> names2 = BinaryOperator.maxBy(String::compareTo);
        System.out.println(names2.apply("zahid","ayan"));


        Product product1 = new Product("Laptop",470000,8.5);
        Product product2 = new Product("Mobile",15000,7.5);

        BinaryOperator<Product> price = BinaryOperator.minBy(Comparator.comparingInt(Product::getPrice));//with lambda
        System.out.println(price.apply(product1,product2));

        BinaryOperator<Product> rating = BinaryOperator.maxBy(Comparator.comparingDouble(Product::getRating));//withReference
        System.out.println(rating.apply(product1,product2));

    }
}
