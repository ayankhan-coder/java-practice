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
class NegativeRadiusException extends Exception{          // L3 ---custom and Throws Keyword
    public NegativeRadiusException(String message){
        super(message);
    }
}

//-----------------------------------------------------------------------------------------------
public class Custom_Exception {
    static double area(int r) throws NegativeRadiusException {  // L3 ---custom and Throws Keyword
        if (r<=0){
            throw new NegativeRadiusException("an error");
        }
        double result = Math.PI * r * r;
        return result;
    }
   /* static int divide(int a,int b) throws ArithmeticException{   //L4 --- Throws keyword
        int result = a/b;
        return result;
    }*/
    //##########################################################################################
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

        try {                                        // L3 ---custom and Throws Keyword
            double b = area(0);
            System.out.println(b);
        }catch (Exception e){
            System.out.println(e);
        }

        /*try {                                      //L4 --- Throws keyword
            int c = divide(10, 0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.toString());
        }*/


        int[] arr = {10, 20, 30, 40, 50};
        while (true){
            int index;
            try {

                System.out.println("Enter Index : ");
                index = sc.nextInt();
                System.out.println(arr[index]);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry This Index DoesNot Exists");
                System.out.println(e.toString());
            }
        }

















    }
}
