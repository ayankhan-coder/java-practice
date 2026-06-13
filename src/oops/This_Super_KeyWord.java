package oops;/* THIS & SUPER keyWord in Java */

class Person {                  // L1 ----------
    String name;

    Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Student extends Person {
    String course;

    Student(String name) {
        super(name);
        this.course = "Not Assigned";
    }
    Student(String name, String course) {
        super(name);
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
}

class Vehicle {
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
}

/*class oops.Car extends oops.Vehicle {           // L2 -----------
    int price;
    String fuelType;

    public oops.Car(String brand, int price) {
        super(brand);
        this.price = price;
        this.fuelType = "Petrol";   //  default
    }
    public oops.Car(String brand, int price, String fuelType) {
        super(brand);
        this.price = price;
        this.fuelType = fuelType;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Fuel: " + fuelType);
    }
}*/

class Account {                             // L3 -----------
    private String accountHolder;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
class SavingAccount extends Account {
    private float balance;
    private float interestRate;

    public SavingAccount(String accountHolder) {
        super(accountHolder);
        this.balance = 0;
        this.interestRate = 5;
    }
    public SavingAccount(String accountHolder, int balance) {
        super(accountHolder);
        this.balance = balance;
        this.interestRate = 5;
    }
    public SavingAccount(String accountHolder, int balance, int interestRate) {
        super(accountHolder);
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public float calculateInterest() {
        return (balance * interestRate) / 100;
    }
    public void displayDetails() {
        System.out.println("oops.Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest: " + calculateInterest());
    }
}
//########################################################################################
//########################################################################################
class This_Super_keyWord{
    public static void main(String[] args) {

        Student student = new Student("Ayan");        // L1 -----------
        Student s = new Student("Ayan","java");

        System.out.println(student.getName());
        System.out.println(student.getCourse());

        System.out.println(s.getName());
        System.out.println(s.getCourse());


       /* oops.Car c1 = new oops.Car("Toyota", 500000);           // L2 ----------
        oops.Car c2 = new oops.Car("Mahindra", 900000, "Diesel");

        c1.displayDetails();
        c2.displayDetails();*/

                                                          // L3 ------------
        SavingAccount savingAccount = new SavingAccount("Ayan",50000,5);
        SavingAccount savingAccount1 = new SavingAccount("Ahmed",199);
        savingAccount.displayDetails();
        savingAccount1.displayDetails();

    }
}