package practice;

class MyException extends Exception{               // L1 ---- Custom Exception
    public MyException(String message){
        super(message);
    }
}

/*class MaxAgeException extends Exception{         // L2 ----- Overrided custom Exception
    @Override
    public String toString() {
        return "Age cannot be above 125";
    }

    @Override
    public String getMessage() {
        return "this is getMessage error";
    }
}*/
public class Custom_Exception {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        if (a<99){
            try {
                throw new MyException("My custom Exception error");
 //             throw new ArithmeticException("error");//weCan use like this also
            }catch (Exception e){
                System.out.println(e);
            }
        }

       /* int age = 150;                            // L2 ----- Overrided custom Exception
        if (age > 125){
            try {

                throw new MaxAgeException();
            }catch (MaxAgeException e){
                System.out.println(e);
            }
        }*/



        












    }
}
