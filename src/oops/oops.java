package practice;

class Employee{         //----- Making first custom class
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
    public void getSalary(){
        System.out.println(salary);
    }
}
/* PRACTICE SETS */

/*class Employee1{         //  P1------class returning salary and name and setting name
    int salary;
    String name;
    public int getSalary(){
        return salary;   //hello
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}*/

class cellPhone{
    public void ring(){             // P2---------
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
}

/*class  square{        //  P3------finding area and perimeter of square
    int side;
    public int area(){
        return side  * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}*/

class Rectangle{       // P4-----finding area and perimeter of rectangle
    int l;
    int b;
    public int area(){
        return l * b;
    }
    public int perimeter(){
        return 2 * (l + b);
    }
}

/*class tommy{             // P5----- making a GAME
    public void hit(){
        System.out.println("Hitting the enemy....");
    }public void run(){
        System.out.println("Running from the enemy.......");
    }public void fire(){
        System.out.println("firing the enemy......");
    }
}*/
public class oops {
//#########################################################################################
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // instantiating an objects
        Employee harry = new Employee();
        Employee john = new Employee();
        //setting attributes
        harry.id =12;
        harry.name = "codeWithHarry";
        harry.salary = 12000;
        john.id = 13;
        john.name = "john babu";
        john.salary = 50000;
        //printing the attributes
        harry.printDetails();
        john.printDetails();
        harry.getSalary();

        /*Employee1 ayan = new Employee1();  // P1-----------
        ayan.setName("ayan khan");
        ayan.salary = 5000;
        System.out.println(ayan.getName());
        System.out.println(ayan.getSalary());*/

        cellPhone oppo = new cellPhone();   // P2-------
        oppo.ring();
        oppo.vibrate();

        /*square sq = new square();      //  P3 ----------
        sq.side =3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/

        Rectangle rec = new Rectangle();   //  P4-----------
        rec.l = 10;
        rec.b = 5;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

        /*tommy player1 = new tommy();    // P5--------
        player1.hit();
        player1.run();
        player1.fire();*/

    }
}
