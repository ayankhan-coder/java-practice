package java8Features;

import java.util.function.Function;

public class Function_Interface {
    public static void main(String[] args) {

        Function<String,Integer>  lengthFunction = name -> name.length();
        System.out.println(lengthFunction.apply("Ayan"));

        Function<Integer,Integer> multiplication = num -> num * num;
        System.out.println(multiplication.apply(10));

        Function<Integer, String> ageMessage = age -> "Age is " + age;
        System.out.println(ageMessage.apply(18));

        Function<String, String> f = text -> text.toUpperCase();
        System.out.println(f.apply("java"));

        System.out.println("--------------------Methods-------------------------");
        /*Methods apply, andThen, compose, */

        Function<Integer,Integer> doubleNum = num -> num * 2;
        Function<Integer,String> convertToString = number -> "Number is " + number;
        Function<Integer,String> result = doubleNum.andThen(convertToString);             // andThen Method
        System.out.println(result.apply(10));

        Function<Integer,Integer> multiplyNum = num -> num * 2;
        Function<Integer,Integer> addTen = num -> num + 10;
        Function<Integer, String> convertInString  = num -> "Final result is "+ num;
        Function<Integer, String> finalResult =
                multiplyNum
                        .andThen(addTen)
                        .andThen(convertInString);
        System.out.println(finalResult.apply(1));


        Function<Integer,Integer> square = num -> num * num;
        Function<Integer,Integer> addThree = num -> num + 3;
        Function<Integer,Integer> res = square.andThen(addTen);
        Function<Integer,Integer> result2 = square.compose(addThree);             // compose Method
        System.out.println(res.apply(4));
        System.out.println(result2.apply(4));

        //identity method remaining


    }
}
