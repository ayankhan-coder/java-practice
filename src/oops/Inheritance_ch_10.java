package practice;/*INHERITANCE IN JAVA*/

class Animal{                               // L1-----INHERITANCE PARENT AND CHILD CLASS
    public void walking(){
        System.out.println("they can walking!!");
    }
    public void eating(){
        System.out.println("they can eating!!");
    }
}
class Dog extends Animal{
    public void barking(){
        System.out.println("they can barking!!!");
    }
}

/*class practice.Base{                             // L2------ parent & child class
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("im setting the value of x");
        this.x = x;
    }
}

class d erived extends base{
    public int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("the value of y");
        this.y = y;
    }
}*/

/*CONSTRUCTORS IN INHERITANCE*/
class Base{                                                  // L3------CONSTRUCTORS IN INHERITANCE
    Base(){
        System.out.println("i am practice.Base constructor");
    }
    Base(int a){
        System.out.println("i am overloaded constructor of practice.Base value of a :"+a);
    }
}
class Derived extends Base{
    Derived() {
        System.out.println("i am derived constructor");
    }
    Derived(int x,int y){
        super();
        System.out.println("i am overloaded constructor of practice.Derived with value of x&y :"+x + y);
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived() {
        super(10,20);
        System.out.println("i am practice.ChildOfDerived constructor");
    }
}

/*class practice.Account {                                    //  L4------Atm example of constructor in inheritance
    int accountNumber;
    double balance;

    // Parent constructor
    practice.Account(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
        System.out.println("practice.Account created");
    }
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
class ATMAccount extends practice.Account {
    // Child constructor
    ATMAccount(int accNo, double bal) {
        super(accNo, bal);   //  VERY IMPORTANT
        System.out.println("ATM practice.Account ready");
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}*/

/*THIS AND SUPER KEYWORD*/
class EKClass{                           // L5------THIS AND SUPER KEYWORD
    int a;
    EKClass(int a){
        this.a = a;
    }
    EKClass(){
        System.out.println(" ui ui ui");
    }
    public int getA(){
        return a;
    }
}
class DoClass extends EKClass{
    DoClass(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}

/*METHOD OVERRIDING*/                    // L6------METHOD OVERRIDING
/*class A{
    public void ayan(){
        System.out.println("Method of A");
    }
}
class B extends A{
    @Override
    public void ayan(){
        System.out.println("Method of B");
    }
}*/

class Soldier{                           // L7------GAME EXAMPLE OF METHOD OVERRIDING
    void attack(){
        System.out.println("ATTACKING WITH GUN---");
    }
}class Ninja extends Soldier{
    @Override
    void attack(){
        System.out.println("ATTACKING WITH STARS----");
    }
}
class Wizard extends Ninja{
    @Override
    void attack(){
        System.out.println("ATTACKING WITH MAGIC---");
    }
}

/*class School {                       // L8------FRIENDS EXAMPLE OF OVERRIDING
    void friends(){
        System.out.println("AliAmaan , Ismail, Ibrahim");
    }
}
class College extends School{
    @Override
    void friends(){
        System.out.println("Hussain , Akmal , Naveed");
    }
}*/

/*DYNAMIC METHOD DISPATCH(DMD)*/
class Phone{                             // L9---- Dynamic Method Dispatch
    public void on(){
        System.out.println("Turning On practice.Phone--");
    }
    public void call(){
        System.out.println("Calling With practice.Phone...");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning On practice.SmartPhone--");
    }
    public void playMusic(){
        System.out.println("Music Playing in practice.SmartPhone~~~~~");
    }
}

/*class Email{
    void sendMessage(){
        System.out.println("Message Is Sent By Email");
    }
}
class WhatsApp extends Email{                    // L10------- APP EXAMPLE OF(DMD)-
    @Override
    void sendMessage(){
        System.out.println("Message Is Sent By WhatsApp");
    }
    void status(){
        System.out.println("Status is Playing in WhatsApp");
    }
}
class Instagram extends WhatsApp{
    @Override
    void sendMessage(){
        System.out.println("Message Is Sent By Instagram");
    }
    void reels(){
        System.out.println("Reels is Playing In Instagram");
    }
}*/

//############################################################################################################################
//############################################################################################################################
public class Inheritance_ch_10 {
    public static void main(String[] args) {
//INHERITANCE IN JAVA
        Animal a=new Animal();               //L1-----INHERITANCE PARENT AND CHILD CLASS
        a.walking();  //parent calling itself
        a.eating();
// 	a.barking();              this will error bcz parent can't use child things
        System.out.println("-----with respect to dog-----");
        Dog d=new Dog();
        d.walking();//child calling parent
        d.eating();
        d.barking();

        /*practice.Derived c = new practice.Derived();                           // L2------ parent & child class
        System.out.println("this is a child object calling itself and parent ");
        c.setY(10);
        System.out.println(c.getY());
        c.setX(20);
        System.out.println(c.getX());*/

        ChildOfDerived c = new ChildOfDerived();                 // L3------CONSTRUCTORS IN INHERITANCE


        /*ATMAccount ayan = new ATMAccount(123455,50000);         //  L4------Atm example of constructor in inheritance
        ayan.showBalance();
        ayan.withdraw(1000);
        ayan.showBalance();*/

        DoClass D = new DoClass(10);                     // L5------THIS AND SUPER KEYWORD
        System.out.println(D.getA());

       /* A b = new B();                                   // L6---METHOD OVERRIDING
        A a = new A();
        a.ayan();*/

        Soldier ninja = new Ninja();                      // L7------GAME EXAMPLE OF METHOD OVERRIDING
        Soldier soldier = new Soldier();
        Ninja wizard = new Wizard();//important objects
        soldier.attack();
        ninja.attack();
        wizard.attack();

        /*School school = new School();                     // L8------FRIENDS EXAMPLE OF OVERRIDING
        College college = new College();
        school.friends();
        college.friends();*/

        Phone p = new SmartPhone();                        // L9---- Dynamic Method Dispatch
        SmartPhone s = new SmartPhone();
        p.on();
        p.call();
        s.on();
        s.call();
        s.playMusic();


       /* WhatsApp w = new Instagram();                  // L10------- APP EXAMPLE OF(DMD)-
        Instagram i = new Instagram();
        Email e = new Email();
        e.sendMessage();
        w.status();
        i.reels();*/
    }
}
