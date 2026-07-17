package advanceCore.java8Features;

interface Ayan{
    void display();
}
interface Dog{
    void bark();
}
interface Addition{
    int add(int a ,int b, int c);
}
interface Multiplication{
    int multiply(int a , int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {

        Ayan ayan = () -> System.out.println("hello Ayan");
        ayan.display();

        Dog k = () -> {
            System.out.println("Dog");
            System.out.println("Barking");
        };
        k.bark();

        Multiplication m = (a, b) -> a * b;
        System.out.println(m.multiply(10,10));

        Addition n = (a, b, c) -> a + b + c;
        System.out.println(n.add(10,10,20));


    }
}
