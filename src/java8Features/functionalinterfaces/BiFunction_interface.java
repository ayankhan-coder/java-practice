package java8Features.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_interface {
    public static void main(String[] args) {

        BiFunction<String,String,Integer> length = (a,b) -> a.length()+b.length();
        System.out.println(length.apply("rajesh","khan"));

        BiFunction<Double,Integer,Double> totalPrice = (price,quantity) -> price * quantity;
        System.out.println(totalPrice.apply(4700d,15));

        BiFunction<Integer, String, Double> operation =
                (number, text) -> number + text.length() * 1.5;
        System.out.println(operation.apply(10,"af"));

        System.out.println("--------------------Methods-------------------------");
        /*andThen*/

        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        Function<Integer,String> convert = result -> "Result:"+result;
        BiFunction<Integer,Integer,String> finalOperation = add.andThen(convert);
        System.out.println(finalOperation.apply(10,20));

        Function<Double, Double> addTax = total -> total + (total * 0.18);
        BiFunction<Double, Integer, Double> finalPrice = totalPrice.andThen(addTax);
        System.out.println(finalPrice.apply(500.0, 2));

    }
}
