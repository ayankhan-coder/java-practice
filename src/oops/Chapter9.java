package practice;

class MyEmployee{             // L1------ GETTERS AND SETTERS
    private String name;
    private int id;
    public void setName(String n){
        name = n;
    }public void setId(int n){
        id = n;
    }public String getName(){
        return name;
    }public int getId(){
        return id;
    }
}

/*class MyMainEmployee{          // L2------CONSTRUCTORS
    private int id;
    private String name;
    private int salary;
    public MyMainEmployee(){
        id = 10;
        name = "CodeWithHarry";
    }
    public MyMainEmployee(int myid){
        id = myid;//------ constructor overloading
    }
    public MyMainEmployee(int myid ,String myName){
        id = myid;
        name = myName;
    }
    public MyMainEmployee(int Myid,String Myname,int Mysalary){
        id = Myid;
        name = Myname;
        salary = Mysalary;

    }public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }public int getId(){
        return id;
    }
}*/

// PRACTICE SET OF ACCESS MODIFIERS
class Cylinder{                          // P1 & P2 -------set radius & height and calculate surface & volume
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }public void setRadius(int radius) {
        this.radius = radius;
    }public int getHeight() {
        return height;
    }public void setHeight(int height) {
        this.height = height;
    }public double surfaceArea(){
        return 2 *3.142 * radius * radius +2*3.142 * radius * height;
    }public double volume(){
        return Math.PI * radius * radius * height;
    }
}

/*class Cylinder1{                  // P3------repeat1 using constructors
    private int radius;
    private int height;

    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}*/

class Rectangle1{                   // P4--------overloading a constructor
    private int length;
    private int height;

    public Rectangle1() {
        length = 10;
        height = 20;
    }
    public Rectangle1(int length, int height) {
        this.length = length;
        this.height = height;
    }public int getLength() {
        return length;
    }public int getHeight() {
        return height;
    }
}

public class Chapter9 {
//############################################################################################
    public static void main(String[] args){
        MyEmployee ayan = new MyEmployee();       //  L1------ GETTERS AND SETTERS
        ayan.setId(10);
        ayan.setName("ayan khan");
        System.out.println(ayan.getName());
        System.out.println(ayan.getId());


        /*MyMainEmployee anda = new MyMainEmployee(786,"ayan ahmed khan",1000);   // L2------CONSTRUCTORS
        System.out.println(anda.getId());
        System.out.println(anda.getName());
        System.out.println(anda.getSalary());*/

        Cylinder harry = new Cylinder();       // P1 & P2 -------set radius & height anda calculate surface & volume
        harry.setRadius(9);
        harry.setHeight(12);
        System.out.println("cylinder radius :" + harry.getRadius());
        System.out.println("cylinder height :" + harry.getHeight());
        System.out.println(harry.surfaceArea());
        System.out.println(harry.volume());

        /*Cylinder1 khan = new Cylinder1(10,20);      // P3------repeat1 using constructors
        System.out.println(khan.getRadius());
        System.out.println(khan.getHeight());*/

        Rectangle1 r = new Rectangle1(30, 50);  // P4--------overloading a constructor
        System.out.println(r.getLength());
        System.out.println(r.getHeight());
    }
}
