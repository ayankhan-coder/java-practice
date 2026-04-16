/* THIS & SUPER keyWord in Java */

class Person {                  // L1----------
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

/*class Car extends Vehicle {
    int price;
    String fuelType;

    public Car(String brand, int price) {
        super(brand);
        this.price = price;
        this.fuelType = "Petrol";   //  default
    }
    public Car(String brand, int price, String fuelType) {
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
//########################################################################################
//########################################################################################
class This_Super_keyWord{
    public static void main(String[] args) {

        Student student = new Student("Ayan");        // L1-----------
        Student s = new Student("Ayan","java");

        System.out.println(student.getName());
        System.out.println(student.getCourse());

        System.out.println(s.getName());
        System.out.println(s.getCourse());


       /* Car c1 = new Car("Toyota", 500000);           // L2----------
        Car c2 = new Car("Mahindra", 900000, "Diesel");

        c1.displayDetails();
        c2.displayDetails();*/

    }
}