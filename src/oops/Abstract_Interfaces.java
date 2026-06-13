package practice;

import java.util.Scanner;


abstract class Animal1{               // L1 -----Abstract class&Methods
    abstract void makeSound();
}
class Dog1 extends Animal1{
    @Override
    void makeSound(){
        System.out.println("Barking");
    }
}class Cat1 extends Animal1{
    @Override
    void makeSound(){
        System.out.println("meowing");
    }
}

/*abstract class Notification{             // L2 -----------
    abstract void send(String message);
}
class EmailNotification extends Notification{
    @Override
    void send(String message){
        System.out.println("Sending Email : "+ message);
    }
}
class SmsNotification extends Notification{
    @Override
    void send(String message){
        System.out.println("Sending SMS : "+ message);
    }
}*/


abstract class Vehicle1{            // L3 ------------
    abstract void start();
}
class Bike extends Vehicle1 {
    @Override
    void start(){
        System.out.println(" practice.Bike Starts");
    }
}
class Car extends Vehicle1 {
    @Override
    void start(){
        System.out.println(" practice.Car Starts");
    }
}


/***************** INTERFACES *****************/

interface Bicycle{                               // L4 -------------
    void speedUp(int increment);
    void brake(int decrement);
}
interface HornBicycle{
    void blowHorn();
}
class AtlasCycle implements Bicycle,HornBicycle{
    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding up");
    }
    @Override
    public void brake(int decrement) {
        System.out.println("Applying Brake");
    }
    @Override
    public void blowHorn() {
        System.out.println("peee peee pee peee");
    }
}


/*abstract class Student2{                   // L5 ----------------
    String name;
    Student2(String name){
        this.name = name;
    }
    abstract void study();
}
interface SportsPlayer{
    void play();
}
class SchoolStudent extends Student2{
    SchoolStudent(String name){
        super(name);
    }
    @Override
    void study(){

        System.out.println(name + " is studying");
    }
}
class CollegeStudent extends Student2 implements SportsPlayer{
    CollegeStudent(String name){
        super(name);
    }
    void study(){
        System.out.println(name + " is studying");
    }
    public void play(){
        System.out.println(name + " Playing");
    }
}*/

//#########################################################################
public class Abstract_Interfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal1 a = new Dog1();        // L1 -----Abstract class&Methods
        Animal1 b = new Cat1();
        a.makeSound();
        b.makeSound();

        /*Notification n;               // L2 ------------
        System.out.println("Enter Message to send :");
        String input = sc.nextLine();
        System.out.println("Choose Notification Typer : ");
        System.out.println("Email");
        System.out.println("sms : ");
        int choice = sc.nextInt();
        if (choice == 1){
            n = new EmailNotification();
        }else {
            n = new SmsNotification();
        }
        n.send(input);*/

        Vehicle1 v;                     // L3 --------------
        System.out.println("Which Vehicle You Wanna Start : ");
        System.out.println("1: practice.Car");
        System.out.println("2: practice.Bike");
        System.out.print("Enter : ");
        int choice = sc.nextInt();
        if (choice == 1){
            v = new Car();
        }else {
            v = new Bike();
        }
        v.start();

/***************** INTERFACES *****************/
        AtlasCycle atlasCycle = new AtlasCycle();         // L4 --------------
        atlasCycle.speedUp(50);
        atlasCycle.brake(10);
        atlasCycle.blowHorn();

       /* Student2 s1 = new SchoolStudent("ayan");        // L5 --------------
        Student2 s2 = new CollegeStudent("ahmed");
        s1.study();
        s2.study();
        CollegeStudent cs = new CollegeStudent("khan");
        cs.play();*/

    }
}
