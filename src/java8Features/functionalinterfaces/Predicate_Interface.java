package java8Features;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Predicate<Integer> isAdult = age ->age >=18;
        System.out.println(isAdult.test(10));

        Predicate<Integer> isEven = (number) -> number % 2==0;
        if (isEven.test(10)){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }

        Predicate<String> p = (name) -> name.length() > 5;
        System.out.println(p.test("ayan"));


        int password = 1234;
        Predicate<Integer> passwordCheck = pass -> pass == password;
        if (passwordCheck.test(2358)){
            System.out.println("Logged in");
        }else {
            System.out.println("Incorrect Password");
        }

        Predicate<String> startsWithA = name -> name.toLowerCase().charAt(0) == 'a';
        System.out.println(startsWithA.test("ayan"));

        Predicate<String> endsWithN = name -> name.endsWith("n");
        System.out.println(endsWithN.test("khan"));


        System.out.println("--------------------Methods-------------------------");
        /* Methods of predicate*/

        Predicate<Integer> isEven2 = num -> num % 2 == 0;
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> result = isEven2.and(isPositive);    //and Method
        System.out.println(result.test(10));

        Predicate<String> result2 = startsWithA.or(endsWithN); // or Method
        System.out.println(result2.test("kahn"));

        Predicate<Integer> result3 = isPositive.or(isEven);
        System.out.println(result3.test(3));

        Predicate<Integer> isOdd = isEven.negate();          // negate Method
        System.out.println(isOdd.test(3));

        Predicate<Integer> isNotAdult = isAdult.negate();
        System.out.println(isNotAdult.test(15));

        Predicate<Integer> is10 = Predicate.isEqual(10);  // isEqual Method
        System.out.println(is10.test(10));

        Predicate<String> name = Predicate.isEqual("ramesh");
        System.out.println(name.test("khan"));


    }
}
