package Errors_Exceptions;

public class Errors_Exceptions {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // Syntax Error Demo

//        int a = 2
//        System.out.println(a);

        // Logical Error Demo
        System.out.println(2);//Arithmetic error
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        //Runtime Error or Exception Demo
        System.out.print("Enter number to divide :");
        int num1 = sc.nextInt();//exception comes if user enter 0
        System.out.println(1000/num1);

        /*~ Different Types of Exceptions Handling ~*/

       /* int a = 9000;                   // L1 -------
        int b = 0;
        try {
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("Failed to divide");
            System.out.println("reason : "+e);
        }
        System.out.println("end of the program");*/

        int [] number = new int[3];           // L2 -----Diff Exception Handling
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        try {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            System.out.print("Enter the index you want to divide with : ");
            int ind = sc.nextInt();
            System.out.println("Entered Values : "+ num +" , "+ind);

            System.out.println("THE DIVIDED VALUE IS : " + num / number[ind]);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Occured");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException Occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Other Exception Occured");
            System.out.println(e);
        }

       /* int []marks = new int [3];          L3 -------- Nested Try-Catch Block
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter the value of index : ");
                int ind = sc.nextInt();
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index does not exist");
                }
            } catch (Exception e) {
                System.out.println("Exception in outer block");
            }
        }
        System.out.println("Program Ended");*/
    }
}
