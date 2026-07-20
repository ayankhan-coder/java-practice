package advanceCore.java8Features;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import java.util.Random;

public class Supplier_Interface {
    public static void main(String[] args) {

        Supplier<Integer> printNum = () -> 100;
        System.out.println(printNum.get());

        Supplier<String> message = () -> "Welcome To Java";
        System.out.println(message.get());

        Random random = new Random();
        Supplier<Integer> randomNum = () -> random.nextInt(50);
        System.out.println(randomNum.get());

        Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
        System.out.println(dateTime.get());

        Supplier<Integer> randomNumber = () -> random.nextInt(9000) + 1000 ;
        System.out.println(randomNumber.get());


    }
}
